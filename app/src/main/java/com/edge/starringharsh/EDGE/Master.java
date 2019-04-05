package com.edge.starringharsh.EDGE;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by starringharsh on 01-12-2016.
 */

public class Master {

    public static final String EVENT_LINK_FORMAT = "https://firebasestorage.googleapis.com/v0/b/edge-8fc5e.appspot.com/o/event_details%%2F%s?alt=media";
    public String categories[] = {"Robotics", "Cyber Crusade", "Compute Aid", "Infocus", "CIIC", "Newron",
            "Elevation", "Food For Fun", "Create It", "Just Like That", "Innovati", "Fun Events"};
    String mainMenu[] = {"Events", "Intra", "Mega Events", "Upcoming Events", "Results", "Edge Kube", "Team EDGE", "Our Sponsors", "Accomodation", "About Us"};
    String intraCat[] = {"Robotics", "Cyber Crusade", "Compute Aid", "Infocus", "CIIC", "Newron", "Elevation", "Food For Fun", "Create It"};

    public String events0[] = {"LIFT'N'LAY", "STALKER", "JIGSAW", "WALLSTREET", "MARINODRIFT", "DOUBLE-UP", "ROBO SOCCER", "BLITZKRIEG", "ROBO RACE"};
    public String events1[] = {"CS GO COLLEGE LEAGUE", "CS GO PRO LEAGUE", "DOTA 2", "FIFA COLLEGE LEAGUE", "FIFA PRO LEAGUE", "PUBG MOBILE"};
    public String events2[] = {"FLAWLESS", "BUG HUNT", "CRYPTO QUEST", "CODE OUT", "CODE RELAY", "WEB DEV"};
    public String events3[] = {"CRUMBS", "ODYSSEY", "SHOOT M UP", "INSTA CLICK", "INSTA EDIT"};
    public String events4[] = {"TROLL MARKETTING", "CROWD PITCH", "PITCH RIGHT", "B-PLAN", "B-QUIZ","ADDOMEDIA", "STOCK IT"};
    public String events5[] = {"ELECTRONICALLY YOURS", "THE QUIZ", "YOUTH PARLIAMENT"};
    public String events6[] = {"CAD O MANIA", "NIRMAAN"};
    public String events7[] = {"CREATION-X-NIHILO", "FOOD PRODUCT LABELLING", "FOOD RELAY", "XQUIZIT", "FOOD DISPLAY PRESENTATION", "ANIMATE"};
    public String events8[] = {"MEKANIX", "RAGS TO RICHES"};
    public String events9[] = {"EDGE ZOOM", "UDAAN", "1 MINUTE STAND"};
    public String events10[] = {"PROJECT VIEW"};
    public String events11[] = {"RED BULL PONG", "BODY ZORBING"};
    String sponsors[] = {"GEEK ALUMS"};
    String sponsorslink = "https://drive.google.com/uc?export=download&id=1k1bsfx019J9b8BOT61Ho2cYxKGeI0k2O";
    String megalink = "https://drive.google.com/uc?export=download&id=1PBcdHlBBqekwWcKBLVqwlQXZO4oFl1Cr";
    String upcominglink = "https://drive.google.com/uc?export=download&id=1Sb2SoByPtDPMuw5CRxX1emkPfaPAhgRf";
    String funlink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEWDFiWkRPR25OYzQ";
    String team17[] = {"Ashish Choudhary", "Shubham Sharma", "Priyankar Banerjee", "Mayank", "Wriddhi Mukherjee", "Aqsa Zea", "Kumar Satyam Singh", "Anurag Ranjan", "Akhilesh Upadhyay"};
    String team18[] = {"Abhishek Singh", "Ayush Tiwari", "Deep Arora", "Shuvojit Ray Chaudhuri", "Harsh Sheth", "Ashif Iqbal", "Md. Mukarram Quraishi", "Neha Roy", "Priya Chaudhuri"};
    String team[] = {"Chandrasekhar Upadhyay", "Rohan Choudhury", "Souradipta Ojha", "Ritaban Chakrabarti", "Siddharth Verma", "Rounak Ghosh", "Shatavisha Biswas", "Urmimala Sen", "Ankur Rai"};
    Map<String, String> teamPost, sponType, intraLink, intraDetails, sponImg, megaType, megaImg;
    Map<String, Integer> teamImg, teamImg1, categoriesImg, mainMenuImg;
    public Map<String, Integer> eventsImg;
    public Map<String, String> eventDetails;
    Map<String, Long> teamNum;


    public Master()
    {
        eventDetails = new HashMap<String, String>();
        eventDetails.put("TROLL MARKETTING", "\n" +
                "Medha\n" +
                "8961187020\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("CROWD PITCH", "\n" +
                "Rahul Singh,Medha\n" +
                "8420617283,8961187020\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("PITCH RIGHT", "\n" +
                "Medha\n" +
                "8961187020\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("FLAWLESS", "Just like the name suggests, as flawless as ones codes become the better chance they have of winning."
                +"<br><br><b>05/04/2019</b><br><i>Prelims 1st day</i> - 01:30pm - 04:30pm<br><b>06/04/2019</b><br><i>Prelims 2nd day</i> - 01:30pm - 04:30pm"
                +"<br><b>07/04/2019</b><br><i>Finals</i> - 01:30pm - 04:30pm\n" +
                "Raja Sachin,Avnish Kumar\n" +
                "9062647976,9162023260\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("BUG HUNT", "A coder is all about perfection and identifying the cracks and holes to make a flawed algorithm picture perfect."
                +"<br><br><b>05/04/2019</b><br><i>Prelims 1st day</i> - 11:00am - 11:45pm<br><b>06/04/2019</b><br><i>Prelims 2nd day</i> - 12:30pm - 01:15pm"
                +"<br><b>07/04/2019</b><br><i>Finals</i> - 12:15am - 1:15pm\n" +
                "Shreya Agarwal,Abhishek Das\n" +
                "9836566212,7033534472\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("CRYPTO QUEST", "Put your cryptography and deciphering skills to test by proving yourself while solving the clues."
                +"<br><br><b>06/04/2019</b><br>09:30am - 12:30pm\n" +
                "Radhika Mohta,Suyash Mittal\n" +
                "9163981049,7044793121\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

       eventDetails.put("INFINITY WARS", "For coders having strategic skills in them, this online map conquest event will be a cake- walk!\n" +
               "Shiv Kumar,Saquib ul Hassan\n" +
               "8820315476,9804887223\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n");

        eventDetails.put("CODE OUT", "A call out to all you hidden gem coders to prove your abilities in this online event."
                +"<br><br><b>06/04/2019</b><br>09:00pm - 11:59pm\n" +
                "Raja Sachin,Indranil Chowdhury\n" +
                "9062647976,9635874015\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("CODE RELAY",
                "A fun event where both team members take turns to solve different questions without changing each others code."
                        +"<br><br><b>05/04/2019</b><br>10:00am - 05:00pm<br><b>06/04/2019</b><br>09:00am - 05:00pm"
                        +"<br><b>07/04/2019</b><br>9:00am - 05:00pm\n" +
                "Raja Sachin,Suyash Mittal\n" +
                "9062647976,7044793121\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("BLIND CODING", "Practice in coding makes a coder perfect. But to the extent where you can code blindfolded?\n" +
                "Amar Bathwal,Meghna roy\n" +
                "8820549897,7059306878\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("WEB DEV", "There are three responses to a piece of design – yes, no, and WOW! Wow is the one to aim for."
                +"<br><br><b>05/04/2019</b><br><i>Prelims 1st day</i> - 10:00am - 10:45am<br><b>07/04/2019</b><br><i>Finals</i> - 9:30am - 12:00pm\n" +
                "Raja Sachin,Suyash Mittal\n" +
                "9062647976,7044793121\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("BLITZKRIEG", "A moment of pain is worth a lifetime of glory. The bot that survives till the end emerges as the victor.\n" +
                "Ashutosh Priyadarshi,Wahid Hussain,Rajeev Ranjan,Sujoy Basak\n" +
                "8697276841,8583908125,8820879972,8013821259\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("DOUBLE-UP", "You want to double-up, then first toe the line.\n" +
                "Ashutosh Priyadarshi,Wahid Hussain,Rajeev Ranjan,Sujoy Basak\n" +
                "8697276841,8583908125,8820879972,8013821259\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("LIFT'N'LAY", "Put the right effort and things will get rightly placed.\n" +
                "Ashutosh Priyadarshi,Wahid Hussain,Rajeev Ranjan,Sujoy Basak\n" +
                "8697276841,8583908125,8820879972,8013821259\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("MARINODRIFT", "Strategize with your bot to win glory on both the terrains.\n" +
                "Ashutosh Priyadarshi,Wahid Hussain,Rajeev Ranjan,Sujoy Basak\n" +
                "8697276841,8583908125,8820879972,8013821259\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("STALKER", "Follow the trail and glory waits for you at the finishing line.\n" +
                "Sudhanshu Shivam,Sourav Ghosh\n" +
                "8697892729,8013174091\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("JIGSAW", "Only the craze to solve the maze can help you win and subjects you to praise.\n" +
                "Sudhanshu Shivam,Sourav Ghosh\n" +
                "8697892729,8013174091\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("ROBO RACE", "The better you maneuver, the farther you reach.\n" +
                "Ashutosh Priyadarshi,Wahid Hussain,Rajeev Ranjan,Sujoy Basak\n" +
                "8697276841,8583908125,8820879972,8013821259\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("ROBO SOCCER", "Steer your bot expertly to score the maximum number of goals and win the match.\n" +
                "Ashutosh Priyadarshi,Wahid Hussain,Rajeev Ranjan,Sujoy Basak\n" +
                "8697276841,8583908125,8820879972,8013821259\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("WALLSTREET", "Follow the trail and glory awaits you at the finishing line.\n" +
                "Sudhanshu Shivam,Sourav Ghosh\n" +
                "8697892729,8013174091\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("CS GO COLLEGE LEAGUE", "For the action frenzy college studying aficionados who got a trigger for an arm and flashbang for the other.\n" +
                "Ahana Sarkar\n" +
                "9674362280\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("CS GO PRO LEAGUE", "The PRO CSGO League , for all hardcore CS Gamers and learners alike.\n" +
                "Swastik Samaddar Chowdhury\n" +
                "9874436481\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("DOTA 2", "It\'s time to choose the sides. Would you choose the might of the dark or the glory of the light?\n" +
                "Jyotishman Chakraborty\n" +
                "8910664354\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("NEED FOR SPEED MOST WANTED", "Put your feet down on the throttle to burn the tires with raging speed.\n" +
                "Sohail Khan,Sujoy Das\n" +
                "7278282148,9073107423\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("FIFA COLLEGE LEAGUE", "Tuned down gameplay and graphics of FIFA here paves the way for a richer competition coming from years of experience.\n" +
                "Arkadeep Dey\n" +
                "9051822311\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("FIFA PRO LEAGUE", "For the Hard and Tough FIFA veterans out there , come battle it out.\n" +
                "Arkadeep Dey\n" +
                "9051822311\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("PUBG MOBILE", "\n" +
                "Agnideep Mukherjee\n" +
                "8478954693\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");


        eventDetails.put("B-PLAN", "If you fail to plan, you plan to fail.\n" +
                "Rahul Singh,Prince\n" +
                "8420617283,9038610317\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("B-QUIZ", "A one of it's kind BizTech quiz that puts your knowledge of technology and business mindedness to test.\n" +
                "Prince\n" +
                "9038610317\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("ADDOMEDIA", "Without innovation, advertisement won't grab attention. With innovation , it will also grab you a handsome prize money.\n" +
                "Prince\n" +
                "9038610317\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("STOCK IT", "Traverse the turbulent waters of the stock market in this online event that simulates the thrill of the stock market without any of the risks involved.\n" +
                "Medha\n" +
                "8961187020\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("PROJECT VIEW", "Ideas exploring the technical field that is advancing with every passing day need a push and here we give it to you.\n" +
                "Medha Mishra,Parshati Chaudhury\n" +
                "8013290587,8961807090\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("CRUMBS", "Landscape photography? That’s too mainstream. Time to go against the tide and explore the elegance in the most inconspicuous items around. The topic is open so just give us the best of you.\n" +
                "Rohit Deb,Karan Paul\n" +
                "9038220806,8906833180\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("ODYSSEY", "“If it can be written or thought, it can be filmed” A picture is worth a thousand words . Tell us your story as you capture the mobility.\n" +
                "Rohit Deb,Karan Paul\n" +
                "9038220806,8906833180\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("SHOOT M UP", "Where you capture the soul infatuation with your cell phone.\n" +
                "Rohit Deb,Indrajeet Dhara\n" +
                "9038220806,9804179878\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("INSTA CLICK", "Capture the moment that’s gone and impossible to reproduce. Shoot at the moment.\n" +
                "Indrajit Dhara,Karan Paul\n" +
                "9804179878,8906833180\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("INSTA EDIT", "INSTA EDIT is an editing competition where your creative mind blends perfectly with your Photoshop skills to create your masterpiece.\n" +
                "Rohit Deb,Karan Paul\n" +
                "9038220806,8906833180\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("INSTA FILM", "Live EDGE and thread the frames. The best mobile video with a creative approach , shot on the spot , gets rewarded.\n" +
                "Sayantan Bhattacharya,Biswajit Banarjee\n" +
                "9163480278,7890100127\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("XQUIZIT", "Unleash your brain cells and win this informative quiz on a wide spectrum of topics.\n" +
                "Sanchari Kar\n" +
                "6290283116\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("FOOD PRODUCT LABELLING", "Label the food products correctly to win this event.\n" +
                "Sanchari Kar\n" +
                "6290283116\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");


        eventDetails.put("CREATION-X-NIHILO", "\n" +
                "\n" +
                "\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("FOOD DISPLAY PRESENTATION", "\n" +
                "Saptarsi Dey\n" +
                "7059285164\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("FOOD RELAY", "It consists of 4 sub games. Whichever team finishes the task first wins the game.\n" +
                "Sanchari Kar\n" +
                "6290283116\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("ANIMATE", "Prepare an advertisement for a specific food product in whichever possible way!\n" +
                "Sanchari Kar\n" +
                "6290283116\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");


        eventDetails.put("MEKANIX", "Knowledge and creativity go hand in hand in this event that tests how updated and polished your mind is!\n" +
                "Medha Mishra,Parshati Chaudhury\n" +
                "8013290587,8961807090\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("RAGS TO RICHES", "If creativity from scratch is your strength, rags to riches is definitely your platform.\n" +
                "Medha Mishra,Parshati Chaudhury\n" +
                "8013290587,8961807090\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("ELECTRONICALLY YOURS","It is all about how well you handle pressure and ultimately win using your knowledge in the domain of electronics.\n" +
                "Alvin Karkun,Soumalya Ghosh\n" +
                "7890150690,8582834183\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("THE QUIZ","Being inquisitive is how you win this event that tests your general knowledge.\n" +
                "Alvin Karkun,Sankarshan Sur\n" +
                "7890150690,9830792503\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("YOUTH PARLIAMENT","If you have a keen interest in the Indian parliamentary proceedings then this is an event where you can excel.\n" +
                "Ankit Anjan,Alvin Karkun\n" +
                "7739793511,7890150690\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("CAD O MANIA", "Showcase your expertise with AutoCAD by taking on the provided challenge head-on and give a suitable solution.\n" +
                "Sanjit Shaw,Vishal Kumar,Prashant Kumar Dubey\n" +
                "9093058470,7991176304,9091397765\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("NIRMAAN", "Build a model bridge good enough to take you over the competitors and take you towards the coveted winner's prize.\n" +
                "Sanjit Shaw,Srimonti Kundu,Saptarshi Bhattacharjee\n" +
                "9093058470,8240253078,9051159470\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("EDGE ZOOM", "\n" +
                "\n" +
                "\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("UDAAN", "\n" +
                "\n" +
                "\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("1 MINUTE STAND", "\n" +
                "\n" +
                "\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("RED BULL PONG", "Sponsored by Red Bull this event became quite popular amongst the youth. " +
                "This event judged how many balls each player could land into the red bull cups. The player with the maximum score was awarded by Red Bull.\n" +
                "\n" +
                "\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventDetails.put("BODY ZORBING", "This fun event procures the highest participation every year since this high energy, fun-filled activity has been a treat for the participants. " +
                "Here participants secured themselves in transparent balls and set everybody else laughing their hearts out while they fell down, " +
                "bumped on each other or rolled down, trying to overthrow their opponents.\n" +
                "\n" +
                "\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n");

        eventsImg = new HashMap<String, Integer>();
        eventsImg.put("TROLL MARKETTING", R.drawable.trollmarketting);
        eventsImg.put("CROWD PITCH", R.drawable.crowdpitch);
        eventsImg.put("PITCH RIGHT", R.drawable.pitchright);
        eventsImg.put("FLAWLESS", R.drawable.flawless);
        eventsImg.put("BUG HUNT", R.drawable.bughunt);
        eventsImg.put("CRYPTO QUEST", R.drawable.cryptoquest);
        eventsImg.put("CODE OUT", R.drawable.codeout);
        eventsImg.put("CODE RELAY", R.drawable.coderelay);
      //  eventsImg.put("BLIND CODING", R.drawable.blindcoding);
        // eventsImg.put("INFINITY WARS", R.drawable.infinitywar);
        eventsImg.put("WEB DEV", R.drawable.codeout);
        eventsImg.put("LIFT'N'LAY", R.drawable.liftlay);
        eventsImg.put("STALKER", R.drawable.stalker);
        eventsImg.put("JIGSAW", R.drawable.jigsaw);
        eventsImg.put("MARINODRIFT", R.drawable.marinodrift);
        eventsImg.put("ROBO SOCCER", R.drawable.robosoccer);
        eventsImg.put("DOUBLE-UP", R.drawable.doubleup);
        eventsImg.put("ROBO RACE", R.drawable.roborace);
        eventsImg.put("BLITZKRIEG", R.drawable.blitzkrieg);
        eventsImg.put("WALLSTREET", R.drawable.wallstreet);
        eventsImg.put("CS GO COLLEGE LEAGUE", R.drawable.csgocollege);
        eventsImg.put("CS GO PRO LEAGUE", R.drawable.csgopro);
        eventsImg.put("DOTA 2", R.drawable.dota2);
       // eventsImg.put("NEED FOR SPEED MOST WANTED", R.drawable.megaevents);
        eventsImg.put("FIFA COLLEGE LEAGUE", R.drawable.fifacollege);
        eventsImg.put("FIFA PRO LEAGUE", R.drawable.fifapro);
      //  eventsImg.put("MINI MILITIA", R.drawable.minimilitia);
        eventsImg.put("PUBG MOBILE", R.drawable.pubgm);
        eventsImg.put("B-PLAN", R.drawable.bplan);
        eventsImg.put("B-QUIZ", R.drawable.bquiz);
        eventsImg.put("ADDOMEDIA", R.drawable.addomedia);
        eventsImg.put("STOCK IT", R.drawable.stockit);
        eventsImg.put("PROJECT VIEW", R.drawable.projectview);
        eventsImg.put("CRUMBS", R.drawable.crumbs);
        eventsImg.put("ODYSSEY", R.drawable.odyssey);
        eventsImg.put("SHOOT M UP", R.drawable.shootmup);
        eventsImg.put("INSTA CLICK", R.drawable.instaclick);
        eventsImg.put("INSTA EDIT", R.drawable.instaedit);
        //eventsImg.put("INSTA FILM", R.drawable.megaevents);
        //eventsImg.put("FOOD PROCESSING", R.drawable.foodprocessing);
        eventsImg.put("XQUIZIT", R.drawable.xquizit);
        eventsImg.put("FOOD DISPLAY PRESENTATION", R.drawable.fooddisplaypresentation);
        eventsImg.put("FOOD RELAY", R.drawable.foodrelay);
        eventsImg.put("FOOD PRODUCT LABELLING", R.drawable.foodlabelling);
        eventsImg.put("CREATION-X-NIHILO", R.drawable.creationxnihilo);
        eventsImg.put("ANIMATE", R.drawable.animate);
        eventsImg.put("MEKANIX", R.drawable.mekanix);
        eventsImg.put("RAGS TO RICHES", R.drawable.ragstoriches);
        eventsImg.put("ELECTRONICALLY YOURS", R.drawable.electronicallyyours);

       eventsImg.put("THE QUIZ", R.drawable.thequiz);
        eventsImg.put("YOUTH PARLIAMENT", R.drawable.youthparliament);
        eventsImg.put("EDGE ZOOM", R.drawable.edgezoom);
        eventsImg.put("UDAAN", R.drawable.udaan);
        eventsImg.put("1 MINUTE STAND", R.drawable.oneminstand);
        eventsImg.put("CAD O MANIA", R.drawable.cadomania);
        eventsImg.put("NIRMAAN",R.drawable.nirmaan);

        eventsImg.put("RED BULL PONG", R.drawable.redbullpong);
        eventsImg.put("BODY ZORBING", R.drawable.zorbing);


        mainMenuImg = new HashMap<String, Integer>();
        mainMenuImg.put("Events", R.drawable.events);
        mainMenuImg.put("Intra", R.drawable.intra);
        mainMenuImg.put("Mega Events", R.drawable.megaevents);
        mainMenuImg.put("Fun Events", R.drawable.funevents);
        mainMenuImg.put("Upcoming Events", R.drawable.upcomingevents);
        mainMenuImg.put("Results", R.drawable.results);
        mainMenuImg.put("Edge Kube", R.drawable.edgekube);
        mainMenuImg.put("Schedule", R.drawable.schedule);
        mainMenuImg.put("Team EDGE", R.drawable.teamedge);
        mainMenuImg.put("Our Sponsors", R.drawable.sponsers);
        mainMenuImg.put("Accomodation", R.drawable.accomodation);
        mainMenuImg.put("About Us", R.drawable.aboutus);

        teamImg = new HashMap<String, Integer>();
        teamImg.put("Chandrasekhar Upadhyay", R.drawable.chandrasekhar);
        teamImg.put("Rohan Choudhury", R.drawable.rohan);
        teamImg.put("Souradipta Ojha", R.drawable.souradipta);
        teamImg.put("Ritaban Chakrabarti", R.drawable.ritaban);
        teamImg.put("Siddharth Verma", R.drawable.siddharth);
        teamImg.put("Rounak Ghosh", R.drawable.rounak);
        teamImg.put("Shatavisha Biswas", R.drawable.shatavisha);
        teamImg.put("Urmimala Sen", R.drawable.urmimala);
        teamImg.put("Ankur Rai", R.drawable.ankur);

        teamImg1 = new HashMap<String, Integer>();
        teamImg1.put("Chandrasekhar Upadhyay", R.drawable.chandrasekhar1);
        teamImg1.put("Rohan Choudhury", R.drawable.rohan1);
        teamImg1.put("Souradipta Ojha", R.drawable.souradipta1);
        teamImg1.put("Ritaban Chakrabarti", R.drawable.ritaban1);
        teamImg1.put("Siddharth Verma", R.drawable.siddharth1);
        teamImg1.put("Rounak Ghosh", R.drawable.rounak1);
        teamImg1.put("Shatavisha Biswas", R.drawable.shatavisha1);
        teamImg1.put("Urmimala Sen", R.drawable.urmimala1);
        teamImg1.put("Ankur Rai", R.drawable.ankur1);

        teamPost = new HashMap<String, String>();
        teamPost.put("Chandrasekhar Upadhyay", "Convener");
        teamPost.put("Rohan Choudhury", "Co-Convener, Co-sponsorship Head, Editorial Head");
        teamPost.put("Souradipta Ojha", "Co-Convener, Co-Signing Authority");
        teamPost.put("Ritaban Chakrabarti", "Sponsorship Head");
        teamPost.put("Siddharth Verma", "Administrative Head");
        teamPost.put("Rounak Ghosh", "Signing Authority & Resource Head");
        teamPost.put("Shatavisha Biswas", "Member Management Head");
        teamPost.put("Urmimala Sen", "Outreach");
        teamPost.put("Ankur Rai", "Media Strategist");

        teamNum = new HashMap<String, Long>();
        teamNum.put("Chandrasekhar Upadhyay", 9038606282L);
        teamNum.put("Rohan Choudhury", 9331556687L);
        teamNum.put("Souradipta Ojha", 9002992220L);
        teamNum.put("Ritaban Chakrabarti", 8444825573L);
        teamNum.put("Siddharth Verma", 7688080223L);
        teamNum.put("Rounak Ghosh", 9475593576L);
        teamNum.put("Shatavisha Biswas", 9748017460L);
        teamNum.put("Urmimala Sen", 8697802955L);
        teamNum.put("Ankur Rai", 7687848761L);

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
        categoriesImg.put("CIIC", R.drawable.ciic);
        categoriesImg.put("Compute Aid", R.drawable.computeaid);
        categoriesImg.put("Robotics", R.drawable.robotics);
        categoriesImg.put("Cyber Crusade", R.drawable.cybercrusade);
        categoriesImg.put("Money Matters", R.drawable.moneymatters);
        categoriesImg.put("Innovati", R.drawable.innovati);
        categoriesImg.put("Infocus", R.drawable.infocus);
        categoriesImg.put("Food For Fun", R.drawable.fff);
        categoriesImg.put("Create It", R.drawable.createit);
        categoriesImg.put("Newron", R.drawable.newron);
        categoriesImg.put("Elevation", R.drawable.elevation);
        categoriesImg.put("Just Like That", R.drawable.justlikethat);
        categoriesImg.put("Fun Events", R.drawable.funevents);

        intraLink = new HashMap<String, String>();
        intraLink.put("Compute Aid", "https://drive.google.com/uc?export=download&id=1nICB_ffCQDELEN5Bq82okiFOv-xDefm_");
        intraLink.put("Robotics", "https://drive.google.com/uc?export=download&id=12KtvoljdIVtjNsdqPXRwlYhbE47R76Uw");
        intraLink.put("Cyber Crusade", "https://drive.google.com/uc?export=download&id=1jylW7pYQmIWILF7C-VCdpGJON89WdryN");
        //intraLink.put("Innovati", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEN1U0S3ZhZjQwOUk");
        intraLink.put("Infocus", "https://drive.google.com/uc?export=download&id=1sIwsbi03N1aU2sIs1HF-E3jI29O6dqQn");
        intraLink.put("CIIC", "https://drive.google.com/uc?export=download&id=1ENGR0cZiXNq5Elt1F4zUndDEGYVyS6nf");
        intraLink.put("Newron", "https://drive.google.com/uc?export=download&id=1rF8YCI_7uuVrI6-MaY318GtEwaF4KyOk");
        intraLink.put("Elevation", "https://drive.google.com/uc?export=download&id=1_-21Vtt6g_PCrZVcAHbx9QX46xlVHdWw");
        intraLink.put("Food For Fun", "https://drive.google.com/uc?export=download&id=1bmImgMJhj0OHiXb8vgRp0XmUX_czpe8-");
        intraLink.put("Create It", "https://drive.google.com/uc?export=download&id=1JUXEx2q32H2bM0AFfhPJcYwyw-looJXf");
        //intraLink.put("Fun Events", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEV09PRmhvSUxJRWc");

        intraDetails = new HashMap<String, String>();
        intraDetails.put("Compute Aid", "FLAWLESS\n" +
                "If coding is your passion and whenever you see a problem you cannot wait to get down to code it, then this is the perfect event for you. Code out with your heart and race with the others to win the battle of wits and will. Be Flawless!\n" +
                "http://intrafest17.edg.co.in/assets/Banner_Flawless.pdf\n" +
                "Suraj Kumar\n" +
                "8820070440\n" +
                "BUGHUNT\n" +
                "Do you often find faults in others’ codes? Or are you always on the hunt for errors whenever you see a code? Well, then this event might just be for you. Find out the trickiest of bugs in the simplest codes and correct them in the shortest and smartest way possible. Beat the others to the finish and claim the prize.\n" +
                "Ritwik Dutta\n" +
                "8334881521\n" +
                "CRYPTO QUEST\n" +
                "Can you solve the cipher above and make a meaningful sentence out of it? Well if you can then you are made for this event. Crypto Quest is back again for the third time in EDGE with a lot of thrills and surprises. Well, in this event you need to be calm and gather all your wits to make meaning of most of the questions. Get ready for a cryptic experience!!!\n" +
                "http://intrafest17.edg.co.in/assets/Banner_Crypto.pdf\n" +
                "Suraj Kumar\n" +
                "8820070440\n" +
                "WEB CREATIONS\n" +
                "Are you a web developer? If yes, then this would be the best platform to show us your web development skills.\n" +
                "http://intrafest17.edg.co.in/assets/Banner_Web.pdf\n" +
                "Subhabrata Paul\n" +
                "9674842750");
        intraDetails.put("Robotics", "MICRO-MACHINA\n" +
                "Build an autonomous line follower bot based on microcontroller which is capable of following a white path on black surface and detecting crossroads and walls.\n" +
                "http://intrafest17.edg.co.in/assets/Micro-Machina.pdf\n" +
                "Dwitam Ghosh\n" +
                "8293929077\n" +
                "PIC-A-PARCEL\n" +
                "Design a manually controlled robot capable of dragging blocks and scoring maximum number of matching and avoid different obstacles which come in their way and moving blocks to their destined positions for required structure.\n" +
                "http://intrafest17.edg.co.in/assets/Pic-a-parcel.pdf\n" +
                "Piyush Raj\n" +
                "8282926317\n" +
                "RETRACK\n" +
                "You need to make a robot which is capable of traversing various terrains and is capable of dragging or pushing objects in the shortest time interval.\n" +
                "http://intrafest17.edg.co.in/assets/Retrack.pdf\n" +
                "Puja Singh\n" +
                "9073144225\n" +
                "SEGUIDOR\n" +
                "To build an autonomous line follower bot based on logic gates and capable of following a white path on black surface and detecting crossroads.\n" +
                "http://intrafest17.edg.co.in/assets/Seguidor.pdf\n" +
                "Utsav Shah\n" +
                "8697108688");
        intraDetails.put("Cyber Crusade", "COUNTER-STRIKE 1.6\n" +
                "CS 1.6 for college students who are dexterous counter strikers.\n" +
                "http://intrafest17.edg.co.in/assets/Counter%20Strike%201.6.pdf\n" +
                "Arkadeep Chatterjee\n" +
                "9830370622\n" +
                "NEED FOR SPEED\n" +
                "Got gas-tank for brain and gasoline for blood? Come prove it.\n" +
                "http://intrafest17.edg.co.in/assets/Need%20for%20Speed.pdf\n" +
                "Swarup Sukai\n" +
                "7098501151\n" +
                "FIFA 11\n" +
                "Keep scoring until your virtual limbs wear out. The strength of the leg lies in the hands.\n" +
                "http://intrafest17.edg.co.in/assets/FIFA%2011.pdf\n" +
                "Suman Mandal\n" +
                "9038457494\n" +
                "CLASH OF CLANS\n" +
                "Reserve and preserve your gems as the ultimate battle is yet to begin. (To register- go to intra2017.edg.co.in)\n" +
                "http://intrafest17.edg.co.in/assets/Clash%20of%20Clans.pdf\n" +
                "Abhik Das\n" +
                "7501794441");
        intraDetails.put("Infocus", "CRUMBS\n" +
                "General Photography where Tampering EXIF is not allowed. Mild post processing is allowed.\n" +
                "http://intrafest17.edg.co.in/assets/comingsoon.pdf\n" +
                "SAPTADIP DAS\n" +
                "7059703077\n" +
                "SHOOT-M-UP\n" +
                "Upload on your facebook timeline with #intra #InFocus #EDGE17 with a suitable caption and your details and receipt no. Submission start from 1st March, Last Date of Submission 8th March,2017 8 pm.\n" +
                "http://intrafest17.edg.co.in/assets/comingsoon.pdf\n" +
                "RUDRANIL DAS\n" +
                "8013785503");
        intraDetails.put("Food For Fun", "X-QUIZ IT\n" +
                "Do you think you know everything about food? Then gear up for the biggest and most exciting food quiz of India which will challenge your knowledge about the realm of food.\n" +
                "http://intrafest17.edg.co.in/assets/X-Quiz%20IT.pdf\n" +
                "Sriyanshi Banerjee\n" +
                "9674341362\n" +
                "FOOD PROCESSING\n" +
                "Have you ever shown your team work? A chance is given to you by EDGE 2016 to show your skills in team game “FOOD PROCESSING”\n" +
                "http://intrafest17.edg.co.in/assets/Food%20Relay.pdf\n" +
                "Soumyajit Bagchi\n" +
                "9038649522\n" +
                "The Elevator\n" +
                "\"Knowing it and seeing it are two different things.\" Have you ever checked the food labels that you consume?How would it feel to market and sell your own product?\n" +
                "http://intrafest17.edg.co.in/assets/Elevator.pdf\n" +
                "Sreyasee Biswas\n" +
                "9051972439");
        intraDetails.put("Newron", "QUIZ\n" +
                "Come and use your random knowledge for this fun quiz.\n" +
                "http://intrafest17.edg.co.in/assets/comingsoon.pdf\n" +
                "SAMANWAY BANERJEE\n" +
                "7998012802\n" +
                "YOUTH PARLIAMENT\n" +
                "Youth parliament is a form of modern debate to explore your knowledge about Indian parliamentary system. A topic will be given or discussion in the house. The more you research, the hotter you will be able to debate.\n" +
                "http://intrafest17.edg.co.in/assets/Youth%20Parliament.pdf\n" +
                "Ankit Anjan\n" +
                "9020349610");
        intraDetails.put("Elevation", "NIRMAAN\n" +
                "The art of constructing Bridge. Bring out the Engineer inside you. May the BRIDGE you build today, light the way for a better tomorrow. (4 members per team)\n" +
                "http://intrafest17.edg.co.in/assets/Nirmaan.pdf\n" +
                "Soumyabrata Guha\n" +
                "8981696657");
        intraDetails.put("Fun Events", "MINI-MILITIA\n" +
                "Hear the whiz of bullets flying past your face as you tumble for over. Out smart the enemy with a well placed grenade and watch them explode into bloody confetti.\n" +
                "http://intrafest17.edg.co.in/assets/comingsoon.pdf\n" +
                "Surajit Ghosh\n" +
                "9038810174\n" +
                "ROBOPUNTER\n" +
                "Race your manual control robot which is capable of competing with other robot  in a given individual track to run. The robot to reach the finish line first will be tagged as the winner of the race and team will be awarded with the double amount of registration in hand.\n" +
                "http://intrafest17.edg.co.in/assets/Robopunter.pdf\n" +
                "Md. Ekram Ansari\n" +
                "7890145686");


    }

}
