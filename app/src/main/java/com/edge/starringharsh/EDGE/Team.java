package com.edge.starringharsh.EDGE;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Team extends AppCompatActivity implements AdapterView.OnItemClickListener {

    GridView grid;
    Context context;
    ImageView iv;
    Master master;
    String name[];
    View o;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(0,0);
        setContentView(R.layout.activity_team);

        o = getWindow().getDecorView().getRootView();

        master = new Master();
        name = master.team;
        grid = (GridView) findViewById(R.id.gridTeam);
        grid.setAdapter(new teamAdapter(this));
        grid.setOnItemClickListener(this);

        TextView tvHead = (TextView) findViewById(R.id.tvHeader);
        tvHead.setTypeface(Typeface.createFromAsset(getAssets(),"TypoGraphica.otf"));
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        
        Intent intent = new Intent(Team.this, TeamMember.class);
        intent.putExtra("name", name[i]);
        startActivity(intent);
    }

    class EleTeam
    {
        String name, posi;
        long num;
        int img;

        EleTeam(String name, String posi,  long num, int img)
        {
            this.name = name;
            this.posi = posi;
            this.num = num;
            this.img = img;
        }
    }

    class teamAdapter extends BaseAdapter
    {
        ArrayList<EleTeam> list;
        Context context;
        teamAdapter(Context context)
        {
            this.context = context;
            list = new ArrayList<EleTeam>();
            for (int i = 0; i<name.length; i++)
            {
                String posi = master.teamPost.get(name[i]);
                long num = master.teamNum.get(name[i]);
                int img = master.teamImg.get(name[i]);
                EleTeam ob = new EleTeam(name[i], posi, num, img);
                list.add(ob);
            }
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
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
                row = inflater.inflate(R.layout.teamgrid, viewGroup, false);
                iv = (ImageView) row.findViewById(R.id.ivMember);
            }
            EleTeam e = list.get(i);
            iv.setBackgroundResource(e.img);
            return row;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Team.this, MainMenu.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(0,0);
    }
}
