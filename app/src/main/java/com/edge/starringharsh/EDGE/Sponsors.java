package com.edge.starringharsh.EDGE;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Sponsors extends BaseActivity {

    ImageView iv;
    TextView spName, spType;
    GridView mGridView;
    Master master;
    String names[], linkadd, imglink[], type[];
    ProgressDialog progress;
    Context cont;
    View o;
    ArrayList mGridData;
    GridViewAdapter mGridAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_sponsors);

        TextView tvHead = (TextView) findViewById(R.id.tvHeader);
        tvHead.setTypeface(Typeface.createFromAsset(getAssets(),"TypoGraphica.otf"));



        progress = new ProgressDialog(this);
        master = new Master();
        linkadd = master.sponsorslink;
        //0B9ir1SJLpxDEUHktS1d1Y240a1U

        o = getWindow().getDecorView().getRootView();
        mGridView = (GridView) findViewById(R.id.gridSpon);
        new BackFetch().execute();
        cont = this;

        mGridData = new ArrayList<GridItem>();
        mGridAdapter = new GridViewAdapter(this, R.layout.sponsorgrid, mGridData);
        mGridView.setAdapter(mGridAdapter);


    }

    class GridItem{
        String giName, giType, giImage;
        int i;

        GridItem(int i, String a, String b, String c)
        {
            this.i = i;
            giName = a;
            giType = b;
            giImage = c;
        }

    }

    class BackFetch extends AsyncTask<Void, Void, Void>
    {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progress.setIndeterminate(false);
            progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progress.setCancelable(true);
            progress.setMessage("Fetching Information...");
            progress.show();
            System.out.println("PRE");
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                URL url = new URL(linkadd);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String str;
                String[] Snames = new String[100];
                String[] Stype = new String[100];
                String[] Simglink = new String[100];
                int c=0;
                while ((str = br.readLine()) != null) {
                    Snames[c] = str;
                    Stype[c] = br.readLine();
                    Simglink[c++] = br.readLine();
                }
                names = new String[c];
                type = new String[c];
                imglink = new String[c];
                for(int i =0; i<c; i++)
                {
                    names[i] = Snames[i];
                    type[i] = Stype[i];
                    imglink[i] = Simglink[i];
                }
                br.close();
            } catch (Exception e) {
                System.out.println("Failed");
                names = master.sponsors;
                type = new String[100];
                imglink = new String[100];
                for(int i=0; i<names.length; i++)
                {
                    type[i] = master.sponType.get(names[i]);
                    imglink[i] = master.sponImg.get(names[i]);
                }
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {System.out.println("POST");
            super.onPostExecute(aVoid);
            progress.dismiss();
            for(int i=0; i<names.length; i++)
            {
                GridItem obj = new GridItem(i, names[i], type[i], imglink[i]);
                mGridData.add(obj);
            }
            mGridAdapter.setGridData(mGridData);
        }
    }

    public class GridViewAdapter extends ArrayAdapter<GridItem> {

        private Context mContext;
        private int layoutResourceId;
        private ArrayList<GridItem> mGridData = new ArrayList<GridItem>();

        public GridViewAdapter(Context mContext, int layoutResourceId, ArrayList<GridItem> mGridData) {
            super(mContext, layoutResourceId, mGridData);
            this.layoutResourceId = layoutResourceId;
            this.mContext = mContext;
            this.mGridData = mGridData;
        }


        /**
         * Updates grid data and refresh grid items.
         * @param mGridData
         */
        public void setGridData(ArrayList<GridItem> mGridData) {
            this.mGridData = mGridData;
            notifyDataSetChanged();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            ViewHolder holder;

            if (row == null) {
                LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
                row = inflater.inflate(layoutResourceId, parent, false);
                holder = new ViewHolder();
                holder.titleTextView = (TextView) row.findViewById(R.id.tvSponName);
                holder.subTextView = (TextView) row.findViewById(R.id.tvSponType);
                holder.imageView = (ImageView) row.findViewById(R.id.ivSpon);
                row.setTag(holder);
            } else {
                holder = (ViewHolder) row.getTag();
            }

            GridItem item = mGridData.get(position);
            holder.titleTextView.setText(item.giName);
            holder.subTextView.setText(item.giType);

            Picasso.get().load(item.giImage).into(holder.imageView);
            return row;
        }
    }

    static class ViewHolder {
        TextView titleTextView, subTextView;
        ImageView imageView;
    }

    }
