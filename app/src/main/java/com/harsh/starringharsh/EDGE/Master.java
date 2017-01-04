package com.harsh.starringharsh.EDGE;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by starringharsh on 01-12-2016.
 */

class Master {

    String categories[] = {"Compute Aid", "Robotics", "Cyber Crusade", "Money Matters", "Innovati", "Infocus", "Food For Fun", "Create It", "Newron", "Just Like That"};



    String events0[] = {"FLAWLESS", "BUG HUNT", "CRYPTO QUEST", "CODE MART", "CODE OUT", "GAME OF ZONES"};
    //String events1[] = {"EXPEDITION", "EXCELSIOR", "KICK-O-BOT", "EXPORT", "PERPLEXITY", "EXULT", "EXPLORE", "BLITZKRIEG", "EXSTREET"};
    //String events2[] = {"CS COLLEGE LEAGUE", "CS PRO LEAGUE", "DOTA 2", "MORTAL KOMBAT", "NEED FOR SPEED MOST WANTED", "FIFA COLLEGE LEAGUE", "FIFA 16 PRO LEAGUE"};
    String events1[] = {};
    String events2[] = {};
    String events3[] = {};
    String events4[] = {};
    String events5[] = {};
    String events6[] = {};
    String events7[] = {};
    String events8[] = {};
    String sponsors[] = {"ABC", "PQR", "XYZ"};
    String sponsorslink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEUHktS1d1Y240a1U";
    String mega[] = {"ABC", "PQR", "XYZ"};
    String megalink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEOUlTaEJSa3BDQzQ";
    String funlink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEWDFiWkRPR25OYzQ";
    String team[] = {"Ashish Choudhary", "Shubham Sharma", "Priyankar Banerjee", "Mayank", "Wriddhi Mukherjee", "Aqsa Zea", "Kumar Satyam Singh", "Anurag Ranjan", "Akhilesh Upadhyay"};
    Map<String, String> eventDetails, link, teamPost, sponType, sponImg, megaType, megaImg;
    Map<String, Integer> teamImg, categoriesImg, eventsImg;
    Map<String, Long> teamNum;


    Master()
    {
        eventDetails = new HashMap<String, String>();
        eventDetails.put("FLAWLESS", "A flawless code is all that you need to build the best and destroy the rest.\n" +
                "Subhodeep\n" +
                "9051734382\n" +
                "Palash Das\n" +
                "7686820875\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00");
        eventDetails.put("BUG HUNT", "Only vigilant minds at work! Debug the buggy algorithm before anybody else does.\n" +
                "Subhodeep\n" +
                "9051734382\n" +
                "Palash Das\n" +
                "7686820875\n" +
                "y\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00");
        eventDetails.put("CRYPTO QUEST", "Decrypt the encrypted problem and code out its solution.\n" +
                "Subhodeep\n" +
                "9051734382\n" +
                "Palash Das\n" +
                "7686820875\n" +
                "y\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00");
        eventDetails.put("CODE MART", "An event that has a conglomeration of coding and trading skills.\n" +
                "Subhodeep\n" +
                "9051734382\n" +
                "Palash Das\n" +
                "7686820875\n" +
                "y\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00");
        eventDetails.put("CODE OUT", "An online coding event on the platform of CodeChef.\n" +
                "Subhodeep\n" +
                "9051734382\n" +
                "Palash Das\n" +
                "7686820875\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00");
        eventDetails.put("GAME OF ZONES", "For coders having strategic skills in them, this online map conquest event will be a cake- walk!\n" +
                "Subhodeep\n" +
                "9051734382\n" +
                "Palash Das\n" +
                "7686820875\n" +
                "y\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00");


        eventDetails.put("EXPEDITION", "Where you're the best kind of god, the one with the function controller in your hands.\n" +
                "Subhodeep\n" +
                "9051734382\n" +
                "Palash Das\n" +
                "7686820875\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00");

        eventDetails.put("EXCELSIOR", "Robots are just people with semicolons instead of synapses. Triumph with the perfect creation.\n" +
                "Loveneesh Singh\n" +
                "7278601537\n" +
                "Tiyash Kr Chanda\n" +
                "9836441321\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00");




        eventsImg = new HashMap<String, Integer>();
        eventsImg.put("BUG HUNT", R.drawable.bughunt);
        eventsImg.put("FLAWLESS", R.drawable.flawless);
        eventsImg.put("CRYPTO QUEST", R.drawable.cryptoquest);
        eventsImg.put("CODE MART", R.drawable.codemart);
        eventsImg.put("CODE OUT", R.drawable.codeout);
        eventsImg.put("GAME OF ZONES", R.drawable.gameofzones);
        //eventsImg.put("EXPEDITION", R.drawable.expedetion);
        //eventsImg.put("EXCELSIOR", R.drawable.excelsior);



        link = new HashMap<String, String>();
        link.put("FLAWLESS", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDENzA1NVBZY3E5a1k");
        link.put("BUG HUNT", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEYnpEZTUwWFJxTkU");
        link.put("CRYPTO QUEST", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEeXZVODJNQ2xWZE0");
        link.put("CODE MART", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDERWJMeE9tQVNyOUU");
        link.put("CODE OUT", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEU0d0OUctREJEWnc");
        link.put("GAME OF ZONES", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDETElNdWVLZm1Xd3M");
        link.put("EXPEDETION", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEMlFxSG93dzRJdVU");
        link.put("EXCELSIOR", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDETnF3YklSM0o5Zkk");

        teamImg = new HashMap<String, Integer>();
        teamImg.put("Ashish Choudhary", R.drawable.ashish);
        teamImg.put("Shubham Sharma", R.drawable.shubham);
        teamImg.put("Priyankar Banerjee", R.drawable.priyankar);
        teamImg.put("Mayank", R.drawable.mayank);
        teamImg.put("Wriddhi Mukherjee", R.drawable.wridhhi);
        teamImg.put("Aqsa Zea", R.drawable.aqsa);
        teamImg.put("Kumar Satyam Singh", R.drawable.kumar);
        teamImg.put("Anurag Ranjan", R.drawable.anurag);
        teamImg.put("Akhilesh Upadhyay", R.drawable.akhilesh);

        teamPost = new HashMap<String, String>();
        teamPost.put("Ashish Choudhary", "Convener");
        teamPost.put("Shubham Sharma", "Co-Convener");
        teamPost.put("Priyankar Banerjee", "Co-Convener");
        teamPost.put("Mayank", "Treasurer");
        teamPost.put("Wriddhi Mukherjee", "Sponsorship Head");
        teamPost.put("Aqsa Zea", "Publicity Head");
        teamPost.put("Kumar Satyam Singh", "Administrative Head");
        teamPost.put("Anurag Ranjan", "Resource Head");
        teamPost.put("Akhilesh Upadhyay", "On-Site Management Head");

        teamNum = new HashMap<String, Long>();
        teamNum.put("Ashish Choudhary", 9836891210L);
        teamNum.put("Shubham Sharma", 9836933862L);
        teamNum.put("Priyankar Banerjee", 7044298043L);
        teamNum.put("Mayank", 8443823443L);
        teamNum.put("Wriddhi Mukherjee", 9002921922L);
        teamNum.put("Aqsa Zea", 8981202855L);
        teamNum.put("Kumar Satyam Singh", 8599913131L);
        teamNum.put("Anurag Ranjan", 8013044530L);
        teamNum.put("Akhilesh Upadhyay", 9674331776L);

        sponType = new HashMap<String, String>();
        sponType.put("ABC", "Associate Sponsor");
        sponType.put("PQR", "Title Sponsor");
        sponType.put("XYZ", "Training Partner");

        sponImg = new HashMap<String, String>();
        sponImg.put("ABC", "http://cdn.media.abc.com/m/images/global/butterscotch/abccom_logo.png");
        sponImg.put("PQR", "https://pbs.twimg.com/profile_images/1709525450/PQR-icoon__jpg__400x400.jpg");
        sponImg.put("XYZ", "http://www.graphis.com/media/uploads/cache/b3/e4/b3e4bf424d71554226fc9c8bbe1d9c91.jpg");

        megaType = new HashMap<String, String>();
        megaType.put("ABC", "Bla Bla Bla Bla Bla Bla Bla Bla");
        megaType.put("PQR", "jkhba vkuo ifnoq ihvo inoinnnlaaa aafn d tndv xcerh");
        megaType.put("XYZ", "jhvjhbj kyfhlb uygl jkblk nunl knjkfvtkcvgh uyyfukybhg igglhj uyfuyig uyfuyf iufguiofg uyf uy fi");

        megaImg = new HashMap<String, String>();
        megaImg.put("ABC", "http://cdn.media.abc.com/m/images/global/butterscotch/abccom_logo.png");
        megaImg.put("PQR", "https://pbs.twimg.com/profile_images/1709525450/PQR-icoon__jpg__400x400.jpg");
        megaImg.put("XYZ", "http://www.graphis.com/media/uploads/cache/b3/e4/b3e4bf424d71554226fc9c8bbe1d9c91.jpg");


        categoriesImg = new HashMap<String, Integer>();
        categoriesImg.put("Compute Aid", R.drawable.computeaid);
        categoriesImg.put("Robotics", R.drawable.robotics);
        categoriesImg.put("Cyber Crusade", R.drawable.gaming);
        categoriesImg.put("Money Matters", R.drawable.moneymatters);
        categoriesImg.put("Innovati", R.drawable.innovati);
        categoriesImg.put("Infocus", R.drawable.infocus);
        categoriesImg.put("Food For Fun", R.drawable.foodforfun);
        categoriesImg.put("Create It", R.drawable.createit);
        categoriesImg.put("Newron", R.drawable.newron);
        categoriesImg.put("Just Like That", R.drawable.justlikethat);
    }

}