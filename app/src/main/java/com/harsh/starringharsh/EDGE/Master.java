package com.harsh.starringharsh.EDGE;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by starringharsh on 01-12-2016.
 */

class Master {

    String categories[] = {"Compute Aid", "Robotics", "Cyber Crusade", "Money Matters", "Innovati", "Infocus", "Food For Fun", "Create It", "Newron", "Elevation", "Just Like That"};



    String events0[] = {"FLAWLESS", "BUG HUNT", "CRYPTO QUEST", "CODE MART", "CODE OUT", "GAME OF ZONES"};
    String events1[] = {"EXPEDITION", "EXCELSIOR", "KICK-O-BOT", "EXPORT", "PERPLEXITY", "EXULT", "EXPLORE", "BLITZKRIEG", "EXSTREET"};
    String events2[] = {"CS COLLEGE LEAGUE", "CS PRO LEAGUE", "DOTA 2", "CLASH OF CLANS", "NEED FOR SPEED MOST WANTED", "FIFA COLLEGE LEAGUE", "FIFA 16 PRO LEAGUE"};
    String events3[] = {"B-PLAN", "B-QUIZ","ADDOMEDIA"};
    String events4[] = {"PROJECT VIEW"};
    String events5[] = {"CRUMBS", "ODYSSEY", "SHOOT M UP", "INSTA CLICK"};
    String events6[] = {"X QUIZ'IT", "WIZCASE", "KWIZNET", "SELL IT", "CREATION-X-NIHILO", "WORD WARRIOR"};
    String events7[] = {"MEKANIX", "RAGS TO RICHES"};
    String events8[] = {"ELECTRONICALLY YOURS", "THE QUIZ", "YOUTH PARLIAMENT"};
    String events9[] = {"CAD O MANIA", "NIRMAAN"};
    String events10[] = {"TREASURE HUNT", "GET SELFISH WITH EDGE17"};
    String sponsors[] = {"GEEK ALUMS"};
    String sponsorslink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEN2RTOTBnLTZhNFE";
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
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("BUG HUNT", "Only vigilant minds at work! Debug the buggy algorithm before anybody else does.\n" +
                "Subhodeep\n" +
                "9051734382\n" +
                "Palash Das\n" +
                "7686820875\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("CRYPTO QUEST", "Decrypt the encrypted problem and code out its solution.\n" +
                "Subhodeep\n" +
                "9051734382\n" +
                "Palash Das\n" +
                "7686820875\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("CODE MART", "An event that has a conglomeration of coding and trading skills.\n" +
                "Subhodeep\n" +
                "9051734382\n" +
                "Palash Das\n" +
                "7686820875\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("CODE OUT", "An online coding event on the platform of CodeChef.\n" +
                "Subhodeep\n" +
                "9051734382\n" +
                "Palash Das\n" +
                "7686820875\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("GAME OF ZONES", "For coders having strategic skills in them, this online map conquest event will be a cake- walk!\n" +
                "Subhodeep\n" +
                "9051734382\n" +
                "Palash Das\n" +
                "7686820875\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");


        eventDetails.put("EXPEDITION", "Where you're the best kind of god, the one with the function controller in your hands.\n" +
                "Loveneesh Singh\n" +
                "7278601537\n" +
                "Tiyash Kr Chanda\n" +
                "9836441321\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");

        eventDetails.put("EXCELSIOR", "Robots are just people with semicolons instead of synapses. Triumph with the perfect creation.\n" +
                "Loveneesh Singh\n" +
                "7278601537\n" +
                "Tiyash Kr Chanda\n" +
                "9836441321\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");

        eventDetails.put("KICK-O-BOT","The better you dodge your bot through the field, the more goals you score.\n" +
                "Loveneesh Singh\n" +
                "7278601573\n" +
                "Tiyash Kr Chanda\n" +
                "9836441321\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("EXPORT","Simultaneous success in both terrains in the field will bring about victory.\n"+
                "Loveneesh Singh\n" +
                "7278601573\n" +
                "Tiyash Kr Chanda\n" +
                "9836441321\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("PERPLEXITY","Life is a maze so don't just gaze but change your pace to win the race.\n"+
                "Loveneesh Singh\n" +
                "7278601573\n" +
                "Tiyash Kr Chanda\n" +
                "9836441321\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("EXULT","All work and no play makes Jack's bot tired of its job, so have fun with your bots in this robotics fun event.\n"+
                "Loveneesh Singh\n" +
                "7278601573\n" +
                "Tiyash Kr Chanda\n" +
                "9836441321\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("EXPLORE","Where you bestow sentience upon an electro-mechanic jumble with a few taps of the keyboard to complete its quest.\n"+
                "Loveneesh Singh\n" +
                "7278601573\n" +
                "Tiyash Kr Chanda\n" +
                "9836441321\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("BLITZKRIEG","War does not only determine who is right – only who is left victorious in the end.\n"+
                "Loveneesh Singh\n" +
                "7278601573\n" +
                "Tiyash Kr Chanda\n" +
                "9836441321\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("EXSTREET","A competition of collaboration of the hands and the mind bots in the field in which only joint perfections will triumph.\n"+
                "Loveneesh Singh\n" +
                "7278601573\n" +
                "Tiyash Kr Chanda\n" +
                "9836441321\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("CS COLLEGE LEAGUE","CS 1.6 for college students who are dexterous counter strikers.\n"+
                "Rahul Gupta\n" +
                "8016580363\n" +
                "Arunabho\n" +
                "9679365688\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("CS PRO LEAGUE","For the best of the best.\n"+
                "Rahul Gupta\n" +
                "8016580363\n" +
                "Arunabho\n" +
                "9679365688\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("DOTA 2","No business but war, no family but death, no mercy but the grave!\n"+
                "Rahul Gupta\n" +
                "8016580363\n" +
                "Arunabho\n" +
                "9679365688\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("CLASH OF CLANS","There is no knowledge that is not power.\n"+
                "Rahul Gupta\n" +
                "8016580363\n" +
                "Arunabho\n" +
                "9679365688\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("NEED FOR SPEED MOST WANTED","Got gas-tank for brain and gasoline for blood? Come prove it.\n"+
                "Rahul Gupta\n" +
                "8016580363\n" +
                "Arunabho\n" +
                "9679365688\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("FIFA COLLEGE LEAGUE","The strength of the leg lies in the hands.\n"+
                "Rahul Gupta\n" +
                "8016580363\n" +
                "Arunabho\n" +
                "9679365688\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("FIFA 16 PRO LEAGUE","Keep scoring until your virtual limbs wear out.\n"+
                "Rahul Gupta\n" +
                "8016580363\n" +
                "Arunabho\n" +
                "9679365688\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("B-PLAN","Money speaks, but only if you're an able enough interrogator with a judicious business plan.\n"+
                "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("B-QUIZ","In a sea of uncertainty, be the anchor, be the map, be the compass.\n"+
                "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("ADDOMEDIA","Creative without strategy is called art, creative with strategy is called advertising.\n"+
                "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("PROJECT VIEW","“Think out of the box!”, explore your innovation, implement the ideas and impress the jury with your creation.\n"+
                "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("CRUMBS","Time to discover and capture the elegance in the most inconspicuous things around.\n"+
                "Rudranil Das\n" +
                "8013785503\n" +
                "Deepan Da\n" +
                "8013138986\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("ODYSSEY","”A picture is worth a thousand words” Tell us your story as you capture the mobility.\n"+
                "Rudranil Das\n" +
                "8013785503\n" +
                "Deepan Da\n" +
                "8013138986\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("SHOOT M UP","A live photography competition where your photographic skills combined with innovative ideas can bag you the first prize.\n"+
                "Rudranil Das\n" +
                "8013785503\n" +
                "Deepan Da\n" +
                "8013138986\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("INSTA CLICK","The best and the most extraordinary photograph clicked on the spot gets awarded.\n"+
                "Rudranil Das\n" +
                "8013785503\n" +
                "Deepan Da\n" +
                "8013138986\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("X QUIZ'IT","Think fast and think hard, that’s the way you win this highly informative event.\n"+
                "Ronny(Bishal)\n" +
                "8961679294\n" +
                "Vandana Singh\n" +
                "8620947119\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("WIZCASE","Don the hats of real life consultants to figure out solutions of real life problems through practical thinking.\n"+
                "Ronny(Bishal)\n" +
                "8961679294\n" +
                "Vandana Singh\n" +
                "8620947119\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("KWIZNET","Being fast and a foodie are the only requirements for this online quiz with a time limit.\n"+
                "Ronny(Bishal)\n" +
                "8961679294\n" +
                "Vandana Singh\n" +
                "8620947119\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("SELL IT","'Knowing it and seeing it are two different things.' Have you ever checked the food labels that you consume? How would it feel to market and sell your own product? Wanna check your stand point! Come and test your skills.\n" +
                "Ronny(Bishal)\n" +
                "8961679294\n" +
                "Vandana Singh\n" +
                "8620947119\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("CREATION-X-NIHILO","Channel your inner innovator to create an effective machine from raw materials and showcase your creativity.\n"+
                "Ronny(Bishal)\n" +
                "8961679294\n" +
                "Vandana Singh\n" +
                "8620947119\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("WORD WARRIOR","A marvellously imaginative competition which aims to stimulate, excite and grow young minds. Become a warrior and get into the battle of words and defeat everyone to be called as a 'WORD WARRIOR'.\n" +
                "Ronny(Bishal)\n" +
                "8961679294\n" +
                "Vandana Singh\n" +
                "8620947119\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("MEKANIX","Let your concept of mechanics shine through and take you forward via your creativity.\n"+
                "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("RAGS TO RICHES","Your incredible mind, if used to turn the ordinary into the extraordinary, will take you from rags to riches.\n"+
                "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("ELECTRONICALLY YOURS","An on spot event which will ultimately reveal how well you know your electron.\n"+
                "Nirjhar\n" +
                "8902230155\n" +
                "Nirjhar\n" +
                "8902230155\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("THE QUIZ","If you think you know about the world you live in, take your inquisitiveness a step further!\n"+
                "Nirjhar\n" +
                "8902230155\n" +
                "Nirjhar\n" +
                "8902230155\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("YOUTH PARLIAMENT","A replica of the Indian Parliament itself with its members consisting of politically aware students, where the proceedings would be done through debate, party formation, policy making and voting.\n"+
                "Nirjhar\n" +
                "8902230155\n" +
                "Nirjhar\n" +
                "8902230155\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("TREASURE HUNT","Time for you  to unveil an intriguing treasure that is only a few clues away.\n"+
                "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("GET SELFISH WITH EDGE17", "Have a craze for clicking selfies?Click innovative Selfies during the event and get maximum likes to win exciting prizes!\n"+
        "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");
        eventDetails.put("CAD O MANIA", "Put your imagination into your drawing.\n" +
                "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "004");
        eventDetails.put("NIRMAAN", "The art of constructing Bridge . Bring out the Engineer inside you. May the BRIDGE you build today, light the way for a better tomorrow.\n" +
                "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");


        eventsImg = new HashMap<String, Integer>();
        eventsImg.put("BUG HUNT", R.drawable.bughunt);
        eventsImg.put("FLAWLESS", R.drawable.flawless);
        eventsImg.put("CRYPTO QUEST", R.drawable.cryptoquest);
        eventsImg.put("CODE MART", R.drawable.codemart);
        eventsImg.put("CODE OUT", R.drawable.codeout);
        eventsImg.put("GAME OF ZONES", R.drawable.gameofzones);
        eventsImg.put("EXPEDITION", R.drawable.expedition);
        eventsImg.put("EXCELSIOR", R.drawable.excelsior);
        eventsImg.put("KICK-O-BOT",R.drawable.kickobot);
        eventsImg.put("EXPORT",R.drawable.export);
        eventsImg.put("PERPLEXITY",R.drawable.perplexity);
        eventsImg.put("EXULT",R.drawable.exult);
        eventsImg.put("EXPLORE",R.drawable.explore);
        eventsImg.put("BLITZKRIEG",R.drawable.blitzkrieg);
        eventsImg.put("EXSTREET",R.drawable.extreet);
        eventsImg.put("CS COLLEGE LEAGUE",R.drawable.csgocollege);
        eventsImg.put("CS PRO LEAGUE",R.drawable.csgopro);
        eventsImg.put("DOTA 2",R.drawable.dota2);
        eventsImg.put("CLASH OF CLANS",R.drawable.clashofclans);
        eventsImg.put("NEED FOR SPEED MOST WANTED",R.drawable.nfsmostwanted);
        eventsImg.put("FIFA COLLEGE LEAGUE",R.drawable.fifcollege);
        eventsImg.put("FIFA 16 PRO LEAGUE",R.drawable.fifapro);
        eventsImg.put("B-PLAN",R.drawable.bplan);
        eventsImg.put("B-QUIZ",R.drawable.bquiz);
        eventsImg.put("ADDOMEDIA",R.drawable.addomedia);
        eventsImg.put("PROJECT VIEW",R.drawable.projectview);
        eventsImg.put("CRUMBS",R.drawable.crumbs);
        eventsImg.put("ODYSSEY",R.drawable.odyssey);
        eventsImg.put("SHOOT M UP",R.drawable.shootmup);
        eventsImg.put("INSTA CLICK",R.drawable.instaclick);
        eventsImg.put("X QUIZ'IT",R.drawable.xquizit);
        eventsImg.put("WIZCASE",R.drawable.wizcase);
        eventsImg.put("KWIZNET",R.drawable.kwiznet);
        eventsImg.put("SELL IT",R.drawable.sellit);
        eventsImg.put("CREATION-X-NIHILO",R.drawable.creationxnihilo);
        eventsImg.put("WORD WARRIOR",R.drawable.wordwarrior);
        eventsImg.put("MEKANIX",R.drawable.mekanix);
        eventsImg.put("RAGS TO RICHES",R.drawable.ragstoriches);
        eventsImg.put("ELECTRONICALLY YOURS",R.drawable.electronicallyyours);
        eventsImg.put("THE QUIZ",R.drawable.quiz);
        eventsImg.put("YOUTH PARLIAMENT",R.drawable.youthparliament);
        eventsImg.put("TREASURE HUNT",R.drawable.treasurehunt);
        eventsImg.put("GET SELFISH WITH EDGE17",R.drawable.getselfish);
        eventsImg.put("CAD O MANIA", R.drawable.cadomania);
        eventsImg.put("NIRMAAN", R.drawable.nirmaan);


        link = new HashMap<String, String>();
        link.put("FLAWLESS", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDENzA1NVBZY3E5a1k");
        link.put("BUG HUNT", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEYnpEZTUwWFJxTkU");
        link.put("CRYPTO QUEST", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEeXZVODJNQ2xWZE0");
        link.put("CODE MART", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDERWJMeE9tQVNyOUU");
        link.put("CODE OUT", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEU0d0OUctREJEWnc");
        link.put("GAME OF ZONES", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDETElNdWVLZm1Xd3M");
        link.put("EXPEDITION", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEMlFxSG93dzRJdVU");
        link.put("EXCELSIOR", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDETnF3YklSM0o5Zkk");
        link.put("KICK-O-BOT", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiRzFkb19sMjdyY1k");
        link.put("EXPORT", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiVXRFRGpJX1ZYT2M");
        link.put("PERPLEXITY", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiQkRzVU5JN0NKdFE" );
        link.put("EXULT", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiVDNyZEFFc21xVDQ");
        link.put("EXPLORE", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqibkU1eXRjRVNrRVU");
        link.put("BLITZKRIEG", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiQ0hOVjk1cUxhSmM");
        link.put("EXSTREET", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiVTJTUUtoY1dKWnc");
        link.put("CS COLLEGE LEAGUE", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiZ1ZaNll1enJMeWM");
        link.put("CS PRO LEAGUE", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiREozSVFrN0p4V0k");
        link.put("DOTA 2", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiaEFCb0tpSElGYTA");
        link.put("CLASH OF CLANS", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEMzdCV01YTU5YYUE");
        link.put("NEED FOR SPEED MOST WANTED", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiQXAtdTFuOFpSRE0");
        link.put("FIFA COLLEGE LEAGUE", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiLTVpMHpwZmdBOE0");
        link.put("FIFA 16 PRO LEAGUE", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqidHB6SzN2Vl9keTg");
        link.put("B-PLAN", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiLXlKelNMS0pxV1U");
        link.put("B-QUIZ", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiNmlqU0dpNEdseEU");
        link.put("ADDOMEDIA", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiSFNRVHNCaXBuWUk");
        link.put("PROJECT VIEW", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiNlpkSXd6bV9ULVE");
        link.put("CRUMBS", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqidWpOaWFrMnJNYUE");
        link.put("ODYSSEY", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiYmdLTTZaM3VNdVE");
        link.put("SHOOT M UP", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiZVFWZHNLMjM5LWM");
        link.put("INSTA CLICK", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiaUFHTDczaGZUR3M");
        link.put("X QUIZ'IT", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiZDBWUTJyblJBOEk");
        link.put("WIZCASE", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiSU5sWGVwdDc1Y1U");
        link.put("KWIZNET", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiT3FRSnNZdjVWc1U");
        link.put("SELL IT", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEbWFtUkJ1dklabFU");
        link.put("CREATION-X-NIHILO", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiVmxZcm1QRVczdnM");
        link.put("WORD WARRIOR", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEWVAwQ3h6Z2pRelE");
        link.put("MEKANIX", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiV0JWMk13ZkpJN00");
        link.put("RAGS TO RICHES", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiY21EdDEyT0NvY1k");
        link.put("ELECTRONICALLY YOURS", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqibFFjRU1CTElnUzg");
        link.put("THE QUIZ", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiN0VzTzRUaGpwLTg");
        link.put("YOUTH PARLIAMENT", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiZGpISjJtaFJEbzg");
        link.put("TREASURE HUNT", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiY3B2eXdUT1lZOGs");
        link.put("GET SELFISH WITH EDGE17", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDER2FrejkxMEZ3ak0");
        link.put("CAD O MANIA","https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDETDZGQlJ6WUljRkE");
        link.put("NIRMAAN","https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEY2ZCRTRwazVuaXc");


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
        sponType.put("GEEK ALUMS", "Supporters");

        sponImg = new HashMap<String, String>();
        sponImg.put("ABC", "http://cdn.media.abc.com/m/images/global/butterscotch/abccom_logo.png");
        sponImg.put("PQR", "https://pbs.twimg.com/profile_images/1709525450/PQR-icoon__jpg__400x400.jpg");
        sponImg.put("GEEK ALUMS", "https://pbs.twimg.com/profile_images/639172860041261056/g_KngOx4.png");

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
        categoriesImg.put("Elevation", R.drawable.elevation);
        categoriesImg.put("Just Like That", R.drawable.justlikethat);
    }

}
