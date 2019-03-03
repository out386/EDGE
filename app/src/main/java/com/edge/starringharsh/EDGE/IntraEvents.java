package com.edge.starringharsh.EDGE;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;

public class IntraEvents extends AppCompatActivity {

    ImageView iv;
    Button bcontPhn, contWA;
    TextView spName, spType, tvcontName;
    GridView mGridView;
    Master master;
    String actName;
    String names[] = {}, linkadd, imglink[] = {}, type[] = {}, contName[] = {};
    String contPhn[] = {};
    ProgressDialog progress;
    Context cont;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    View o;
    ArrayList mGridData;
    GridViewAdapter mGridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);
        setContentView(R.layout.activity_mega_events);
        actName = getIntent().getStringExtra("category");

        sharedPreferences = getSharedPreferences("EventsChoice", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
        progress = new ProgressDialog(this);
        master = new Master();

        linkadd = master.intraLink.get(actName);

        o = getWindow().getDecorView().getRootView();
        mGridView = (GridView) findViewById(R.id.gridMega);
        mGridData = new ArrayList<GridItem>();
        mGridAdapter = new GridViewAdapter(this, R.layout.intragrid, mGridData);
        mGridView.setAdapter(mGridAdapter);
        new BackFetch().execute();
        cont = this;
        TextView tvHead = (TextView) findViewById(R.id.tvHeader);
        tvHead.setTypeface(Typeface.createFromAsset(getAssets(),"TypoGraphica.otf"));
        tvHead.setText(actName);


    }

    class GridItem{
        String giName, giType, giCont, giLink;
        String giNum;
        int i;

        GridItem(int i, String a, String b, String c, String d, String e)
        {
            this.i = i;
            giName = a;
            giType = b;
            giLink = c;
            giCont = d;
            giNum = e;
        }

    }

    class BackFetch extends AsyncTask<Void, Void, Void>
    {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            try {
                progress.setIndeterminate(false);
                progress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progress.setCancelable(true);
                progress.setMessage("Fetching Information...");
                progress.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("PRE");
        }

        @Override
        protected Void doInBackground(Void... voids) {
            try {
                URL url = new URL(linkadd);
                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
                String str, newstr="";
                String[] Snames = new String[50];
                String[] Stype = new String[50];
                String[] Simglink = new String[50];
                String[] ScontName = new String[50];
                String[] ScontPhn = new String[50];
                int c=0;
                while ((str = br.readLine()) != null) {
                    newstr+=str+"\n";
                    Snames[c] = str;
                    Stype[c] = br.readLine();
                    newstr+=Stype[c]+"\n";
                    Simglink[c] = br.readLine();
                    newstr+=Simglink[c]+"\n";
                    ScontName[c] = br.readLine();
                    newstr+=ScontName[c]+"\n";
                    ScontPhn[c] = (br.readLine());
                    newstr+=ScontPhn[c++]+"\n";
                }
                editor.putString(actName + " Intra", newstr.trim());
                editor.commit();
                names = new String[c];
                type = new String[c];
                imglink = new String[c];
                contName = new String[c];
                contPhn = new String[c];
                for(int i =0; i<c; i++)
                {
                    names[i] = Snames[i];
                    type[i] = Stype[i];
                    imglink[i] = Simglink[i];
                    contName[i] = ScontName[i];
                    contPhn[i] = ScontPhn[i];
                }
                br.close();
            } catch (Exception e) {
                System.out.println("Failed");
                String newstr = sharedPreferences.getString(actName + " Intra", master.intraDetails.get(actName));//put default value
                BufferedReader br = new BufferedReader(new StringReader(newstr));
                String str;
                String[] Snames = new String[100];
                String[] Stype = new String[100];
                String[] Simglink = new String[100];
                String[] ScontName = new String[50];
                String[] ScontPhn = new String[50];
                int c=0;
                try {
                    while ((str = br.readLine()) != null) {
                        Snames[c] = str;
                        Stype[c] = br.readLine();
                        Simglink[c] = br.readLine();
                        ScontName[c] = br.readLine();
                        ScontPhn[c++] = (br.readLine());
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                names = new String[c];
                type = new String[c];
                imglink = new String[c];
                contName = new String[c];
                contPhn = new String[c];
                for(int i =0; i<c; i++)
                {
                    names[i] = Snames[i];
                    type[i] = Stype[i];
                    imglink[i] = Simglink[i];
                    contName[i] = ScontName[i];
                    contPhn[i] = ScontPhn[i];
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

            if(names.length==0)
            {
                Intent intent = new Intent(IntraEvents.this, ComingSoon.class);
                startActivity(intent);
            }
            for(int i=0; i<names.length; i++)
            {
                GridItem obj = new GridItem(i, names[i], type[i], imglink[i], contName[i], contPhn[i]);
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
                holder.titleTextView = (TextView) row.findViewById(R.id.tvSpEvent);
                holder.subTextView = (TextView) row.findViewById(R.id.tvSpEventDesc);
                //holder.imageView = (ImageView) row.findViewById(R.id.ivSpEvent);
                holder.contName = (TextView) row.findViewById(R.id.tvEventCont);
                holder.call = (Button) row.findViewById(R.id.bEventCall);
                holder.whatsapp = (Button) row.findViewById(R.id.bEventWA);
                holder.downloadPdf = (Button) row.findViewById(R.id.bDownloadPdf);
                row.setTag(holder);
            } else {
                holder = (ViewHolder) row.getTag();
            }

            GridItem item = mGridData.get(position);
            holder.titleTextView.setText(item.giName);
            holder.subTextView.setText(item.giType);
            holder.contName.setText(item.giCont);
            holder.call.setText("" + item.giNum);
            holder.whatsapp.setText("" + item.giNum);
            holder.downloadPdf.setText("" + item.giLink);
            //Picasso.get().load(item.giImage).into(holder.imageView);

            holder.downloadPdf.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Button x = (Button)view;

                    /*Intent intent = new Intent(IntraEvents.this, CampusAmbassadors.class);
                    intent.putExtra("weblink", x.getText());
                    startActivity(intent);
                    finish();*/

                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("" + x.getText()));
                    startActivity(intent);
                }
            });

            holder.subTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TextView x = (TextView)view;
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(IntraEvents.this);
                    builder1.setTitle("Event Details");
                    builder1.setMessage(x.getText());
                    builder1.setCancelable(true);
                    builder1.setNeutralButton(android.R.string.ok,
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            });

            holder.call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Button x = (Button)view;

                    Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + x.getText()));
                    startActivity(intent);
                }
            });
            holder.whatsapp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Button x = (Button)view;

                    Intent sendIntent = new Intent("android.intent.action.MAIN");
                    sendIntent.setComponent(new ComponentName("com.whatsapp","com.whatsapp.Conversation"));
                    sendIntent.putExtra("jid", PhoneNumberUtils.stripSeparators("91" + x.getText())+"@s.whatsapp.net");//phone number without "+" prefix
                    startActivity(sendIntent);

                }
            });


            return row;
        }
    }

    static class ViewHolder {
        TextView titleTextView, subTextView, contName;
        Button call, whatsapp, downloadPdf;
        //ImageView imageView;
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
}