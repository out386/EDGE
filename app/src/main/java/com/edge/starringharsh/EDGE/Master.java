package com.edge.starringharsh.EDGE;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by starringharsh on 01-12-2016.
 */

class Master {

    String categories[] = {"Compute Aid", "Robotics", "Cyber Crusade", "Money Matters", "Innovati", "Infocus", "Food For Fun", "Create It", "Newron", "Elevation", "Just Like That"};
    String intraCat[] = {"Compute Aid", "Robotics", "Cyber Crusade", "Infocus", "Food For Fun", "Newron", "Elevation", "Fun Events"};


    String events0[] = {"FLAWLESS", "BUG HUNT", "CRYPTO QUEST", "CODE OUT", "BLIND CODING", "INFINITY WARS", "WEB DESIGN"};
    String events1[] = {"LIFT'N'LAY", "STALKER", "JIGSAW", "WALLSTREET", "MARINODRIFT", "DOUBLE-UP", "ROBO SOCCER", "BLITZKRIEG", "ROBO RACE"};
    String events2[] = {"CS COLLEGE LEAGUE", "CS PRO LEAGUE", "DOTA 2", "NEED FOR SPEED MOST WANTED", "FIFA 14", "FIFA 18", "MINI MILITIA", "8 BALL POOL"};
    String events3[] = {"B-PLAN", "B-QUIZ","ADDOMEDIA", "STOCK IT"};
    String events4[] = {"PROJECT VIEW"};
    String events5[] = {"CRUMBS", "ODYSSEY", "SHOOT M UP", "INSTA CLICK", "INSTA FILM"};
    String events6[] = {"CREATION-X-NIHILO", "FOOD PRODUCT LABELLING", "FOOD PROCESSING","FOOD HUNT"};
    String events7[] = {"MEKANIX", "RAGS TO RICHES"};
    String events8[] = {"ELECTRONICALLY YOURS", "THE QUIZ", "YOUTH PARLIAMENT"};
    String events9[] = {"CAD O MANIA", "NIRMAAN"};
    String events10[] = {"KHUL JAA SIM SIM", "BOOMERANG", "MUSICAL.LY", "REWIND"};
    String sponsors[] = {"GEEK ALUMS"};
    String sponsorslink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEN2RTOTBnLTZhNFE";
    String megalink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEOUlTaEJSa3BDQzQ";
    String upcominglink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEWF9kaUIyeUx6V28";
    String funlink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEWDFiWkRPR25OYzQ";
    String team17[] = {"Ashish Choudhary", "Shubham Sharma", "Priyankar Banerjee", "Mayank", "Wriddhi Mukherjee", "Aqsa Zea", "Kumar Satyam Singh", "Anurag Ranjan", "Akhilesh Upadhyay"};
    String team18[] = {"Abhishek Singh", "Ayush Tiwari", "Deep Arora", "Shuvojit Ray Chaudhuri", "Harsh Sheth", "Ashif Iqbal", "Md. Mukarram Quraishi", "Neha Roy", "Priya Chaudhuri"};
    String team[] = {"Chandrasekhar Upadhyay", "Rohan Choudhury", "Souradipta Ojha", "Ritaban Chakrabarti", "Siddharth Verma", "Rounak Ghosh", "Shatavisha Biswas", "Urmimala Sen", "Ankur Rai"};
    Map<String, String> eventDetails, link, teamPost, sponType, intraLink, intraDetails, sponImg, megaType, megaImg;
    Map<String, Integer> teamImg, teamImg1, categoriesImg, eventsImg;
    Map<String, Long> teamNum;


    Master()
    {
        eventDetails = new HashMap<String, String>();
        eventDetails.put("FLAWLESS", "Just like the name suggests, as flawless as ones codes become the better chance they have of winning.\n" +
                "Saquib Ul Hassan\n" +
                "9804887223\n" +
                "Suyash Mittal\n" +
                "7044793121\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Compute%20Aid/FlawLess");

        eventDetails.put("BUG HUNT", "A coder is all about perfection and identifying the cracks and holes to make a flawed algorithm picture perfect.\n" +
                "Prince Kumar\n" +
                "7059507444\n" +
                "Indrajit Salui\n" +
                "7209127729\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Compute%20Aid/BugHunt");

        eventDetails.put("CRYPTO QUEST", "Put your cryptography and deciphering skills to test by proving yourself while solving the clues.\n" +
                "Suyash Mittal\n" +
                "7044793121\n" +
                "Priyadarshini Purkayastha\n" +
                "8584944024\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Compute%20Aid/CryptoQuest");

       eventDetails.put("INFINITY WARS", "For coders having strategic skills in them, this online map conquest event will be a cake- walk!\n" +
               "Shiv Kumar\n" +
               "8820315476\n" +
               "Saquib ul Hassan\n" +
               "9804887223\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/#/events/Compute%20Aid");

        eventDetails.put("CODE OUT", "A call out to all you hidden gem coders to prove your abilities in this online event.\n" +
                "Shiv Kumar\n" +
                "8820315476\n" +
                "Saquib ul Hassan\n" +
                "9804887223\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Compute%20Aid/CodeOut");

        eventDetails.put("BLIND CODING", "Practice in coding makes a coder perfect. But to the extent where you can code blindfolded?\n" +
                "Amar Bathwal\n" +
                "8820549897\n" +
                "Meghna roy\n" +
                "7059306878\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Compute%20Aid/Blind%20Coding");

        eventDetails.put("WEB DESIGN", "There are three responses to a piece of design – yes, no, and WOW! Wow is the one to aim for.\n" +
                "Saquib Ul Hassan\n" +
                "9804887223\n" +
                "Sanjeev Kumar\n" +
                "7003566634\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Compute%20Aid/Web%20Design");

        eventDetails.put("BLITZKRIEG", "A moment of pain is worth a lifetime of glory. The bot that survives till the end emerges as the victor.\n" +
                "Sagar Sangam\n" +
                "7991186092\n" +
                "Saurabh Kumar Gupta\n" +
                "8697474145\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://www.edg.co.in/#/events/Robotics/Blitzkrieg");

        eventDetails.put("DOUBLE-UP", "You want to double-up, then first toe the line.\n" +
                "Sagar Sangam\n" +
                "7991186092\n" +
                "Saurabh Kumar Gupta\n" +
                "8697474145\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://www.edg.co.in/#/events/Robotics/Double-Up");

        eventDetails.put("LIFT'N'LAY", "Put the right effort and things will get rightly placed.\n" +
                "Sagar Sangam\n" +
                "7991186092\n" +
                "Piyush Raj\n" +
                "8282926317\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://www.edg.co.in/#/events/Robotics/Lift%20'N'%20Lay");

        eventDetails.put("MARINODRIFT", "Strategize with your bot to win glory on both the terrains.\n" +
                "Saurabh Kumar Gupta\n" +
                "8697474145\n" +
                "Piyush Raj\n" +
                "8282926317\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://www.edg.co.in/#/events/Robotics/Marino%20Drift");

        eventDetails.put("STALKER", "Follow the trail and glory waits for you at the finishing line.\n" +
                "Utsav Shah\n" +
                "8697108688\n" +
                "Dwitam Ghosh\n" +
                "8293929077\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://www.edg.co.in/#/events/Robotics/Line%20Follower");

        eventDetails.put("JIGSAW", "Only the craze to solve the maze can help you win and subjects you to praise.\n" +
                "Dwitam Ghosh\n" +
                "8293929077\n" +
                "Utsav Shah\n" +
                "8697108688\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://www.edg.co.in/#/events/Robotics/Maze%20Solver");

        eventDetails.put("ROBO RACE", "The better you maneuver, the farther you reach.\n" +
                "Sagar Sangam\n" +
                "7991186092\n" +
                "Saurabh Kumar Gupta\n" +
                "8697474145\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://www.edg.co.in/#/events/Robotics/Robo%20Race");

        eventDetails.put("ROBO SOCCER", "Steer your bot expertly to score the maximum number of goals and win the match.\n" +
                "Sagar Sangam\n" +
                "7991186092\n" +
                "Piyush Raj\n" +
                "8282926317\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://www.edg.co.in/#/events/Robotics/Robo%20Soccer");

        eventDetails.put("WALLSTREET", "Follow the trail and glory awaits you at the finishing line.\n" +
                "Dwitam Ghosh\n" +
                "8293929077\n" +
                "Utsav Shah\n" +
                "8697108688\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Robotics/Wall%20Street");

        eventDetails.put("CS COLLEGE LEAGUE", "For the action frenzy college studying aficionados who got a trigger for an arm and flashbang for the other.\n" +
                "Prangshu Shyam\n" +
                "7551833860\n" +
                "Agnideep Mukherjee\n" +
                "8478954693\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Cyber%20Crusade/CS%20GO%20College-League");

        eventDetails.put("CS PRO LEAGUE", "The PRO CSGO League , for all hardcore CS Gamers and learners alike.\n" +
                "Neel Roy\n" +
                "9830052618\n" +
                "Swastik Samaddar Chowdhury\n" +
                "9874436481\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Cyber%20Crusade/Cs%20GO%20Pro-League");

        eventDetails.put("DOTA 2", "It’s time to choose the sides. Would you choose the might of the dark or the glory of the light?\n" +
                "Abhirup Saha\n" +
                "9434250077\n" +
                "Jyotishman Chakraborty\n" +
                "8910664354\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Cyber%20Crusade/DOTA%202");

        eventDetails.put("NEED FOR SPEED MOST WANTED", "Put your feet down on the throttle to burn the tires with raging speed.\n" +
                "Sohail Khan\n" +
                "7278282148\n" +
                "Sujoy Das\n" +
                "91-9073107423\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Cyber%20Crusade/Need%20For%20Speed%20most%20wanted");

        eventDetails.put("FIFA 14", "Tuned down gameplay and graphics of FIFA 14 here paves the way for a richer competition coming from years of experience.\n" +
                "Avishek Chakraborty\n" +
                "7063280262\n" +
                "Tamesh Chakraborty\n" +
                "9831764352\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Cyber%20Crusade/Fifa%2014%20College%20League");

        eventDetails.put("FIFA 18", "For the Hard and Tough FIFA veterans out there , come battle it out.\n" +
                "Sayantan Mondal\n" +
                "768091091\n" +
                "Md. Imran Khan\n" +
                "9007272859\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Cyber%20Crusade/Fifa%2018%20Pro%20League");

        eventDetails.put("MINI MILITIA", "Go in with all guns blazing and take down your foe.\n" +
                "Arkaprava Banerjee\n" +
                "8101041843\n" +
                "Abhinaba Ray\n" +
                "9474979853\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Cyber%20Crusade/Mini%20Militia");

        eventDetails.put("8 BALL POOL", "Take aim and shoot.\n" +
                "Arkaprava Banerjee\n" +
                "8101041843\n" +
                "Abhinaba Ray\n" +
                "9474979853\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Cyber%20Crusade/8-Ball%20Pool");


        eventDetails.put("B-PLAN", "If you fail to plan, you plan to fail.\n" +
                "Kirti\n" +
                "9038870176\n" +
                "Punit Ojha\n" +
                "9163413293\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Money%20Matters/B-PLAN");

        eventDetails.put("B-QUIZ", "A one of it's kind BizTech quiz that puts your knowledge of technology and business mindedness to test.\n" +
                "Kirti\n" +
                "9038870176\n" +
                "Punit Ojha\n" +
                "9163413293\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Money%20Matters/B-Quiz");

        eventDetails.put("ADDOMEDIA", "Without innovation, advertisement won't grab attention. With innovation , it will also grab you a handsome prize money.\n" +
                "Saptarshi\n" +
                "9474092342\n" +
                "Punit Ojha\n" +
                "947492342\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Money%20Matters/AddoMedia");

        eventDetails.put("STOCK IT", "Traverse the turbulent waters of the stock market in this online event that simulates the thrill of the stock market without any of the risks involved.\n" +
                "Kirti\n" +
                "9038870176\n" +
                "Kirti\n" +
                "9038870176\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Money%20Matters/Stock%20It");

        eventDetails.put("PROJECT VIEW", "Ideas exploring the technical field that is advancing with every passing day need a push and here we give it to you.\n" +
                "Aditi Kumari\n" +
                "8276960454\n" +
                "Nabanita Bhandary\n" +
                "7059485319\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Innovati/Project%20View");

        eventDetails.put("CRUMBS", "Landscape photography? That’s too mainstream. Time to go against the tide and explore the elegance in the most inconspicuous items around. The topic is open so just give us the best of you.\n" +
                "Priyanka Sengupta\n" +
                "9748234607\n" +
                "Subhradeep Basu\n" +
                "8436238707\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Infocus/Crumbs");

        eventDetails.put("ODYSSEY", "If it can be written or thought, it can be filmed” A picture is worth a thousand words . Tell us your story as you capture the mobility.\n" +
                "Priyanka Sengupta\n" +
                "9748234607\n" +
                "Biswajit Banerjee\n" +
                "78090100127\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Infocus/Odyssey");

        eventDetails.put("SHOOT M UP", "“Where you capture the soul infatuation with your cell phone.\n" +
                "Priyanka Sengupta\n" +
                "9748234607\n" +
                "Biswajit Banerjee\n" +
                "78090100127\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Infocus/Shoot-'M'-Up");

        eventDetails.put("INSTA CLICK", "Capture the moment that’s gone and impossible to reproduce. Shoot at the moment.\n" +
                "Subhradeep Basu\n" +
                "8436238707\n" +
                "Nilanjana Biswas\n" +
                "9800996502\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Infocus/Insta-Click");

        eventDetails.put("INSTA FILM", "Live EDGE and thread the frames. The best mobile video with a creative approach , shot on the spot , gets rewarded.\n" +
                "Sayantan Bhattacharya\n" +
                "9163480278\n" +
                "Biswajit Banarjee\n" +
                "7890100127\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Infocus/Insta-Film");

        eventDetails.put("X-QUIZ-IT", "Unleash your brain cells and win this informative quiz on a wide spectrum of topics.\n" +
                "Raptilekha\n" +
                "9073853754\n" +
                "Raptilekha\n" +
                "9073853754\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Food%20for%20Fun/X-Quiz-It");

        eventDetails.put("FOOD PRODUCT LABELLING", "Label the food products correctly to win this event.\n" +
                "Raptilekha\n" +
                "9073853754\n" +
                "Raptilekha\n" +
                "9073853754\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Food%20for%20Fun/Food%20Product%20Labelling");


        eventDetails.put("CREATION-X-NIHILO","Create a machine with the raw materials and take away the prize for your creative thinking.\n" +
                "Raptilekha\n" +
                "9073853754\n" +
                "Raptilekha\n" +
                "9073853754\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Food%20for%20Fun/Creation-X-Nihilo");

        eventDetails.put("FOOD HUNT", "Hungry enough for the prize? Hunt your food down and satiate yourself.\n" +
                "Raptilekha\n" +
                "9073853754\n" +
                "Raptilekha\n" +
                "9073853754\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Food%20for%20Fun/Food%20Hunt");

        eventDetails.put("FOOD PROCESSING", "Think your way through food to solve riddles and puzzles.\n" +
                "Raptilekha\n" +
                "9073853754\n" +
                "Raptilekha\n" +
                "9073853754\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Food%20for%20Fun/Food%20Relay");


        eventDetails.put("MEKANIX", "Knowledge and creativity go hand in hand in this event that tests how updated and polished your mind is!\n" +
                "Aditi Kumari\n" +
                "8276960454\n" +
                "Nabanita Bhandary\n" +
                "7059485319\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Create%20It/Mekanix");

        eventDetails.put("RAGS TO RICHES", "If creativity from scratch is your strength, rags to riches is definitely your platform.\n" +
                "Nabanita Bhandary\n" +
                "7059485319\n" +
                "Medha Mishra\n" +
                "8013290587\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Create%20It/Rags%20to%20Riches");

        eventDetails.put("ELECTRONICALLY YOURS","It is all about how well you handle pressure and ultimately win using your knowledge in the domain of electronics.\n" +
                "Alvin Karkun\n" +
                "7890150690\n" +
                "Alvin Karkun\n" +
                "7890150690\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Newron/Electronically%20Yours");

        eventDetails.put("THE QUIZ","Being inquisitive is how you win this event that tests your general knowledge.\n" +
                "Samanway Banerjee\n" +
                "799812802\n" +
                "Sankarshan Sur\n" +
                "9830792503\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Newron/The%20Quiz");

        eventDetails.put("YOUTH PARLIAMENT","If you have a keen interest in the Indian parliamentary proceedings then this is an event where you can excel.\n" +
                "Ankit Anjan\n" +
                "9020349610\n" +
                "Alvin Karkun\n" +
                "7890150690\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Newron/Youth%20Parliament");

        /*eventDetails.put("TREASURE HUNT","Time for you  to unveil an intriguing treasure that is only a few clues away.\n"+
                "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEWjMyc21xcmlkbDQ");*/
        /*eventDetails.put("GET SELFISH WITH EDGE17", "Have a craze for clicking selfies?Click innovative Selfies during the event and get maximum likes to win exciting prizes!\n"+
        "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00");*/
        eventDetails.put("CAD O MANIA", "Showcase your expertise with AutoCAD by taking on the provided challenge head-on and give a suitable solution.\n" +
                "Hritu Raj\n" +
                "8282800821\n" +
                "Deepak\n" +
                "9831669967\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Elevation/Cad-O-Mania");

        eventDetails.put("NIRMAAN", "Build a model bridge good enough to take you over the competitors and take you towards the coveted winner's prize.\n" +
                "Hritu Raj\n" +
                "8282800821\n" +
                "Mrityunjay\n" +
                "8961383442\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Elevation/Nirmaan");

        eventDetails.put("BOOMERANG", "Loop in back and forth, secure the maximum likes and take home exciting goodies.\n" +
                "Neha Roy\n" +
                "8327640533\n" +
                "Neha Roy\n" +
                "8327640533\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Just%20Like%20That/Boomerang");

        eventDetails.put("KHUL JAA SIM SIM", "Decipher the clues provided as the hidden treasure awaits you.\n" +
                "Aditi Kumari\n" +
                "8276960454\n" +
                "Nabanita Bhandary\n" +
                "7059485319\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Just%20Like%20That/Khul%20Ja%20Sim%20Sim");

        eventDetails.put("MUSICAL.LY", "Perform to your hearts content and your creativity will bag you exciting prizes.\n" +
                "Neha Roy\n" +
                "8327640533\n" +
                "Neha Roy\n" +
                "8327640533\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Just%20Like%20That/Musical.Ly");

        eventDetails.put("REWIND", "Rewind, Rollback and Play.\n" +
                "Neha Roy\n" +
                "8327640533\n" +
                "Neha Roy\n" +
                "8327640533\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/#/events/Just%20Like%20That/Rewind");


        eventsImg = new HashMap<String, Integer>();
        eventsImg.put("FLAWLESS", R.drawable.flawless);
        eventsImg.put("BUG HUNT", R.drawable.bughunt);
        eventsImg.put("CRYPTO QUEST", R.drawable.cryptoquest);
        eventsImg.put("CODE OUT", R.drawable.codeout);
        eventsImg.put("BLIND CODING", R.drawable.blindcoding);
        eventsImg.put("INFINITY WARS", R.drawable.infinitywar);
        eventsImg.put("WEB DESIGN", R.drawable.webdevelopment);
        eventsImg.put("LIFT'N'LAY", R.drawable.liftnlay);
        eventsImg.put("STALKER", R.drawable.stalker);
        eventsImg.put("JIGSAW", R.drawable.jigsaw);
        eventsImg.put("MARINODRIFT", R.drawable.marinodrift);
        eventsImg.put("ROBO SOCCER", R.drawable.robosoccer);
        eventsImg.put("DOUBLE-UP", R.drawable.doubleup);
        eventsImg.put("ROBO RACE", R.drawable.roborace);
        eventsImg.put("BLITZKRIEG", R.drawable.blitzkrieg);
        eventsImg.put("WALLSTREET", R.drawable.wallstreet);
        eventsImg.put("CS COLLEGE LEAGUE", R.drawable.csgocollege);
        eventsImg.put("CS PRO LEAGUE", R.drawable.csgopro);
        eventsImg.put("DOTA 2", R.drawable.dota2);
        eventsImg.put("NEED FOR SPEED MOST WANTED", R.drawable.needforspeed);
        eventsImg.put("FIFA 14", R.drawable.fifa14);
        eventsImg.put("FIFA 18", R.drawable.fifa18);
        eventsImg.put("MINI MILITIA", R.drawable.minimilitia);
        eventsImg.put("8 BALL POOL", R.drawable.eightballpool);
        eventsImg.put("B-PLAN", R.drawable.bplan);
        eventsImg.put("B-QUIZ", R.drawable.bquiz);
        eventsImg.put("ADDOMEDIA", R.drawable.addomedia);
        eventsImg.put("STOCK IT", R.drawable.stockit);
        eventsImg.put("PROJECT VIEW", R.drawable.projectview);
        eventsImg.put("CRUMBS", R.drawable.crumbs);
        eventsImg.put("ODYSSEY", R.drawable.odyssey);
        eventsImg.put("SHOOT M UP", R.drawable.shootmup);
        eventsImg.put("INSTA CLICK", R.drawable.instaclick);
        eventsImg.put("INSTA FILM", R.drawable.instafilm);
        eventsImg.put("X QUIZ'IT", R.drawable.xquizit);
        eventsImg.put("FOOD PROCESSING", R.drawable.foodprocessing);
        eventsImg.put("FOOD HUNT", R.drawable.foodhunt);
        eventsImg.put("FOOD PRODUCT LABELLING", R.drawable.foodlabeling);
        eventsImg.put("CREATION-X-NIHILO", R.drawable.creationxnihilo);
        eventsImg.put("MEKANIX", R.drawable.mekanix);
        eventsImg.put("RAGS TO RICHES", R.drawable.ragsriches);
        eventsImg.put("ELECTRONICALLY YOURS", R.drawable.electronicallyyours);
        eventsImg.put("THE QUIZ", R.drawable.thequiz);
        eventsImg.put("YOUTH PARLIAMENT", R.drawable.youthparliament);
        eventsImg.put("KHUL JAA SIM SIM", R.drawable.khuljasimsim);
        eventsImg.put("REWIND", R.drawable.rewind);
        eventsImg.put("MUSICAL.LY", R.drawable.musically);
        eventsImg.put("BOOMERANG", R.drawable.boomerang);
        eventsImg.put("CAD O MANIA", R.drawable.cadomania);
        eventsImg.put("NIRMAAN",R.drawable.nirman);



        link = new HashMap<String, String>();
        link.put("FLAWLESS", "https://drive.google.com/uc?export=download&id=1H4MJZUtw1eM3fQ8tEFYoqFFuU0xkecqc");
        link.put("BUG HUNT", "https://drive.google.com/uc?export=download&id=1y8GOOoIF0OYpuv7Fn0Z8dWuleI7uwzmj");
        link.put("CRYPTO QUEST", "https://drive.google.com/uc?export=download&id=1-q4oYtQfNy8N2NtV3_0nNAutGYCk1RLn");
        link.put("CODE OUT", "https://drive.google.com/uc?export=download&id=1YUR5n5mOqTcrxNAcfm8pcU3HqdvLeB6a");
        link.put("BLIND CODING", "https://drive.google.com/uc?export=download&id=18aryzwybBFjCafC6T3f69nu3zsGPs0to");
        link.put("INFINITY WARS", "https://drive.google.com/uc?export=download&id=1wSgWsLhtFtI4dY8h4h7K8zN6z8bvtB6E");
        link.put("WEB DESIGN", "https://drive.google.com/uc?export=download&id=1Nm7Toc6knx6DWZxkIAtXLu8zFpIGA83f");
        link.put("LIFT'N'LAY", "https://drive.google.com/uc?export=download&id=1drfG9i2kbcLmR38QoTJosMmfciuQV1Tk");
        link.put("STALKER", "https://drive.google.com/uc?export=download&id=1TtVGgMd2lM7rJgrf9zHi4AhKEmbNbxBW");
        link.put("JIGSAW", "https://drive.google.com/uc?export=download&id=1R5Y46N37vhGitg_NWr3qioD3TAvV0DL6");
        link.put("MARINODRIFT", "https://drive.google.com/uc?export=download&id=1N-mYclgKo482UxggEXdUX3iZ6vgvXbwY");
        link.put("ROBO SOCCER", "https://drive.google.com/uc?export=download&id=1DT9J3OXsDwA8XHcmGRWWN9LGmSXBQ0fr" );
        link.put("DOUBLE-UP", "https://drive.google.com/uc?export=download&id=1BmSdvdDwWgKGAyF5vrV8yHdIqT-l-ZzQ");
        link.put("ROBO RACE", "https://drive.google.com/uc?export=download&id=1Ck3H5nrxPdadPk3MPZ3T2dQhkTnAmbq1");
        link.put("BLITZKRIEG", "https://drive.google.com/uc?export=download&id=1_TH0_XBKEG_iPBLr568eaNEhivSNVJiG");
        link.put("WALLSTREET", "https://drive.google.com/uc?export=download&id=1JzpJhwFY8hk5Hbd7iwAciD5EuHxRQBdl");
        link.put("CS COLLEGE LEAGUE", "https://drive.google.com/uc?export=download&id=1R1DTgyeLuAnO8myYB6-cBgngHlBROH4o");
        link.put("CS PRO LEAGUE", "https://drive.google.com/uc?export=download&id=1wuojjPeAjTexCIJy4_l8Cn6s6KJQAoKt");
        link.put("DOTA 2", "https://drive.google.com/uc?export=download&id=1t48je_U4_2_HMF7cALb6J0faFRoUgdkF");
        link.put("NEED FOR SPEED MOST WANTED", "https://drive.google.com/uc?export=download&id=15DuwK0m8lgd2XURoMzU-lCNsGCodW0h5");
        link.put("FIFA 14", "https://drive.google.com/uc?export=download&id=160GC6vpb_8Qj6kJm-qckUnNbQS9J7FM6");
        link.put("FIFA 18", "https://drive.google.com/uc?export=download&id=1swA6H4EeyEagVQoF3TbYLsoIzctCty8V");
        link.put("MINI MILITIA","https://drive.google.com/uc?export=download&id=1bt4GlAYAm_INiZTPHWcYTAyTfnnku0Xn");
        link.put("8 BALL POOL", "https://drive.google.com/uc?export=download&id=1kRJvvbrStEq9n6lr3DL2YrIa37YmhpZr");
        link.put("B-PLAN", "https://drive.google.com/uc?export=download&id=10kEzTCaJY9XKjD1p0LdqzkknEjGDD4Gm");
        link.put("B-QUIZ", "https://drive.google.com/uc?export=download&id=1gvgl4nX_Y4Clq_72V8WyA9mxZhu4VMWq");
        link.put("ADDOMEDIA", "https://drive.google.com/uc?export=download&id=11Qu1CWLvthPhxU-vqEgEalUVpQ4Y4kWf");
        link.put("STOCK IT", "https://drive.google.com/uc?export=download&id=1Gy-Zbg1gwd8_Pkjq-dKm9pT7FFbe3S8G");
        link.put("PROJECT VIEW", "https://drive.google.com/uc?export=download&id=1OFdubHQkri5SrmoYoIIrkqzfRH3fm6ck");
        link.put("CRUMBS", "https://drive.google.com/uc?export=download&id=1jd9aWFc_5MfRkLxmBx7X1rQcPzETOpA0");
        link.put("ODYSSEY", "https://drive.google.com/uc?export=download&id=1fibG9x9GRjQFMxS84tv4Dih495hNudNS");
        link.put("SHOOT M UP", "https://drive.google.com/uc?export=download&id=1LyGO1a2nCXP6jF4DWSVwvQffo1D6tySb");
        link.put("INSTA CLICK", "https://drive.google.com/uc?export=download&id=1r2u7PYL_XT4-hhqGE0HA9R6rSseJtccK");
        link.put("INSTA FILM", "https://drive.google.com/uc?export=download&id=1NFymjArkPLCQVnCUk8VpJkS_X3IU5ezA");
        link.put("X QUIZ'IT", "https://drive.google.com/uc?export=download&id=1B8UM8qQG_vH6M6AsFHpywhs6YcbVYufK");
        link.put("FOOD PROCESSING", "https://drive.google.com/uc?export=download&id=1w-MVmn47E_f4U5dE8ZhtF6_L7wYksLWJ");
        link.put("FOOD HUNT", "https://drive.google.com/uc?export=download&id=1ciqWkVB0FdOb9HA-JZzVGIceh8YwXlXB");
        link.put("FOOD PRODUCT LABELLING", "https://drive.google.com/uc?export=download&id=1SqExMuHf-8-zFLtXl94_dMk1jh6g2MUC");
        link.put("CREATION-X-NIHILO", "https://drive.google.com/uc?export=download&id=1Ugyyug3cvYaRCT82NOXs53SjLKcrRoFW");
        link.put("MEKANIX", "https://drive.google.com/uc?export=download&id=14MNioWdWFt0dYSleYYDkJDIAyHbZK8Z4");
        link.put("RAGS TO RICHES", "https://drive.google.com/uc?export=download&id=1cZzLiYsKhouezRi4SJwJonGa7olkJ5ZT");
        link.put("ELECTRONICALLY YOURS", "https://drive.google.com/uc?export=download&id=15wL6TDK7ezqC-AYD0cqSFY8wjD5u487H");
        link.put("THE QUIZ", "https://drive.google.com/uc?export=download&id=1jyCCNykrbXwcISwT-CDfHXbvEh7SsY6Y");
        link.put("YOUTH PARLIAMENT", "https://drive.google.com/uc?export=download&id=1FJJVZ-6Pb9RoRl6Fs-D6o6gr3YbTr9Vh");
        link.put("KHUL JAA SIM SIM", "https://drive.google.com/uc?export=download&id=1E_fCNFGa4ahWh8x1glU3fvVkW5KKGbwM");
        link.put("REWIND", "https://drive.google.com/uc?export=download&id=18dj9NkmRLSObogdfqJKqWHwU7B-n6ZFm");
        link.put("MUSICAL.LY", "https://drive.google.com/uc?export=download&id=1EKkucr1PCe4NdfEfy_4v91yHELRo1Gtf");
        link.put("BOOMERANG", "https://drive.google.com/uc?export=download&id=1eLs9zjP8uzWhHRb9VchXadEDESRfEVPV");
        link.put("CAD O MANIA","https://drive.google.com/uc?export=download&id=1YuOWuePa8N6FAOUwv36qs-t8Ctmrdj8l");
        link.put("NIRMAAN","https://drive.google.com/uc?export=download&id=1ylHvMeBa0ku9TX5ppTiGpv-MADswdGbD");


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

        //String team[] = {"Abhishek Singh", "Ayush Tiwari", "Deep Arora", "Shuvojit Ray Chaudhuri", "Harsh Sheth", "Ashif Iqbal", "Md. Mukarram Quraishi", "Neha Roy", "Priya Chaudhuri"};
        teamImg.put("Abhishek Singh", R.drawable.abhishek);
        teamImg.put("Ayush Tiwari", R.drawable.ayush);
        teamImg.put("Deep Arora", R.drawable.deep);
        teamImg.put("Harsh Sheth", R.drawable.harsh);
        teamImg.put("Shuvojit Ray Chaudhuri", R.drawable.shuvojit);
        teamImg.put("Neha Roy", R.drawable.neha);
        teamImg.put("Priya Chaudhuri", R.drawable.priya);
        teamImg.put("Ashif Iqbal", R.drawable.ashif);
        teamImg.put("Md. Mukarram Quraishi", R.drawable.mukarram);

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
        teamPost.put("Rounak Ghosh", "Resource Head");
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
        intraLink.put("Compute Aid", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEN1U0S3ZhZjQwOUk");
        intraLink.put("Robotics", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEd1d3VFhsQTNzREU");
        intraLink.put("Cyber Crusade", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEdE9vUExqdnplV1k");
        //intraLink.put("Money Matters", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEN1U0S3ZhZjQwOUk");
        //intraLink.put("Innovati", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEN1U0S3ZhZjQwOUk");
        intraLink.put("Infocus", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEZ0FlZ2V1bFBTSTA");
        intraLink.put("Food For Fun", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDENlFnWVFQUUhBczQ");
        //intraLink.put("Create It", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEN1U0S3ZhZjQwOUk");
        intraLink.put("Newron", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEYmU4Y3lhSFVtTmM");
        intraLink.put("Elevation", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEbHA2WmNNN2lRSm8");
        intraLink.put("Fun Events", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEV09PRmhvSUxJRWc");

        intraDetails = new HashMap<String, String>();
        intraDetails.put("Compute Aid", "FLAWLESS\n" +
                "If coding is your passion and whenever you see a problem you cannot wait to get down to code it, then this is the perfect event for you. Code out with your heart and race with the others to win the battle of wits and will. Be Flawless!\n" +
                "http://intrafest17.edg.co.in/assets/Banner_Flawless.pdf\n" +
                "Suraj Kumar\n" +
                "8820070440\n" +
                "BUGHUNT\n" +
                "Do you often find faults in others’ codes? Or are you always on the hunt for errors whenever you see a code? Well, then this event might just be for you. Find out the trickiest of bugs in the simplest codes and correct them in the shortest and smartest way possible. Beat the others to the finish and claim the prize.\n" +
                "http://intrafest17.edg.co.in/assets/Banner_BugHunt.pdf\n" +
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
