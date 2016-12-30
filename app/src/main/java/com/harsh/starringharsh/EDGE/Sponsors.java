package com.harsh.starringharsh.EDGE;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Sponsors extends AppCompatActivity {

    ImageView iv;
    TextView spName, spType;
    GridView grid;
    Master master;
    String names[], linkadd, imglink[], type[];
    ProgressDialog progress;
    Context cont;
    View o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);

        progress = new ProgressDialog(this);
        master = new Master();
        linkadd = master.sponsorslink;
        //0B9ir1SJLpxDEUHktS1d1Y240a1U

        o = getWindow().getDecorView().getRootView();
        grid = (GridView) findViewById(R.id.gridSpon);
        new BackFetch().execute();
        cont = this;
        /*new Thread(new Sponsors.Task()).start();
        while(p==0)
        {

        }

        l = names.length;
        ll = (LinearLayout) findViewById(R.id.llSponsors);
        TextView tv[] = new TextView[l];
        for(i=0; i<l; i++)
        {
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT);
            tv[i] = new TextView(this);
            tv[i].setText(names[i]);
            tv[i].setId(i);
            final int id_ = tv[i].getId();
            ll.addView(tv[i], params);
        }*/

    }

    /*class Task implements Runnable
    {

        @Override
        public void run() {
            try {
                URL url = new URL(linkadd);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String str;
                i=0;
                names = new String[20];
                while ((str = br.readLine()) != null) {
                    names[i++] = str;
                }
                br.close();
                p=1;
            } catch (Exception e) {
                System.out.println("Failed");
                names = master.sponsors;
                p=1;
                e.printStackTrace();
            }
        }
    }*/

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
                String str, newDet="";
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
        protected void onPostExecute(Void aVoid) {
            System.out.println("POST");
            super.onPostExecute(aVoid);
            progress.dismiss();
            grid.setAdapter(new SponAdapter(cont));
        }
    }

    class SponAdapter extends BaseAdapter
    {
        Context context;
        String n[];

        SponAdapter(Context context)
        {
            this.context = context;
            n = names;
        }
        @Override
        public int getCount() {
            return n.length;
        }

        @Override
        public Object getItem(int i) {
            return n[i];
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            View row = view;

            if(row == null)
            {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                row = inflater.inflate(R.layout.sponsorgrid, viewGroup, false);
                iv = (ImageView) row.findViewById(R.id.ivSpon);
                spName = (TextView) row.findViewById(R.id.tvSponName);
                spType = (TextView) row.findViewById(R.id.tvSponType);
            }
            spName.setText(n[i]);
            spType.setText(type[i]);
            new ImageLoadTask(imglink[i], iv).execute();
            return row;
        }
    }


    public class ImageLoadTask extends AsyncTask<Void, Void, Bitmap> {

        private String url;
        private ImageView imageView;

        public ImageLoadTask(String url, ImageView imageView) {
            this.url = url;
            this.imageView = imageView;
        }

        @Override
        protected Bitmap doInBackground(Void... params) {
            try {
                URL urlConnection = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) urlConnection
                        .openConnection();
                connection.setDoInput(true);
                connection.connect();
                InputStream input = connection.getInputStream();
                Bitmap myBitmap = BitmapFactory.decodeStream(input);
                return myBitmap;
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Bitmap result) {
            super.onPostExecute(result);
            imageView.setImageBitmap(result);
        }

    }

}
