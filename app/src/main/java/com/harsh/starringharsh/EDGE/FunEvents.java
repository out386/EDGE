package com.harsh.starringharsh.EDGE;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

public class FunEvents extends AppCompatActivity {

    ImageView iv;
    TextView spName, spType;
    GridView grid;
    Master master;
    String names[] = {}, linkadd, imglink[] = {}, type[] = {};
    ProgressDialog progress;
    Context cont;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    View o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);
        setContentView(R.layout.activity_mega_events);
        sharedPreferences = getSharedPreferences("EventsChoice", Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();

        progress = new ProgressDialog(this);
        master = new Master();
        linkadd = master.funlink;

        o = getWindow().getDecorView().getRootView();
        grid = (GridView) findViewById(R.id.gridMega);
        new BackFetch().execute();
        cont = this;


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
                String str, newstr="";
                String[] Snames = new String[100];
                String[] Stype = new String[100];
                String[] Simglink = new String[100];
                int c=0;
                while ((str = br.readLine()) != null) {
                    newstr+=str+"\n";
                    Snames[c] = str;
                    Stype[c] = br.readLine();
                    newstr+=Stype[c]+"\n";
                    Simglink[c] = br.readLine();
                    newstr+=Simglink[c++]+"\n";
                }
                editor.putString("Fun", newstr);
                editor.commit();
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
                String newstr = sharedPreferences.getString("fun", "");
                BufferedReader br = new BufferedReader(new StringReader(newstr));
                String str;
                String[] Snames = new String[100];
                String[] Stype = new String[100];
                String[] Simglink = new String[100];
                int c=0;
                try {
                    while ((str = br.readLine()) != null) {
                        Snames[c] = str;
                        Stype[c] = br.readLine();
                        Simglink[c++] = br.readLine();
                    }
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                editor.putString("Fun", newstr);
                editor.commit();
                names = new String[c];
                type = new String[c];
                imglink = new String[c];
                for(int i =0; i<c; i++)
                {
                    names[i] = Snames[i];
                    type[i] = Stype[i];
                    imglink[i] = Simglink[i];
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
            if(names.length==0)
            {
                Intent intent = new Intent(FunEvents.this, ComingSoon.class);
                startActivity(intent);
                finish();
            }
        }
    }

    class SponAdapter extends BaseAdapter
    {
        Context context;

        SponAdapter(Context context)
        {
            this.context = context;
        }
        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int i) {
            return names[i];
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
                row = inflater.inflate(R.layout.eventgrid, viewGroup, false);
                iv = (ImageView) row.findViewById(R.id.ivSpEvent);
                spName = (TextView) row.findViewById(R.id.tvSpEvent);
                spType = (TextView) row.findViewById(R.id.tvSpEventDesc);
            }
            spName.setText(names[i]);
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
            if(result != null)
            imageView.setImageBitmap(result);
        }




    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        Intent intent = new Intent(FunEvents.this, MainMenu.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
}
