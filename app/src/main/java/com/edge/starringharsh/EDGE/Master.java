package com.edge.starringharsh.EDGE;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by starringharsh on 01-12-2016.
 */

class Master {

    String categories[] = {"Compute Aid", "Robotics", "Cyber Crusade", "Money Matters", "Innovati", "Infocus", "Food For Fun", "Create It", "Newron", "Elevation", "Just Like That"};
    String intraCat[] = {"Compute Aid", "Robotics", "Cyber Crusade", "Infocus", "Food For Fun", "Newron", "Elevation", "Fun Events"};


    String events0[] = {"FLAWLESS", "BUG HUNT", "CRYPTO QUEST", "CODE OUT", "CODANWARS", "BLIND CODING"};
    String events1[] = {"SARVATRA", "AFFILIATOR", "DRAG-ON", "MARINODRIFT", "JIGSAW", "DOUBLE-UP", "STALKER", "BLITZKRIEG", "WALLSTREET"};
    String events2[] = {"CS COLLEGE LEAGUE", "CS PRO LEAGUE", "DOTA 2", "CLASH OF CLANS", "NEED FOR SPEED MOST WANTED", "FIFA COLLEGE LEAGUE", "FIFA 16 PRO LEAGUE"};
    String events3[] = {"B-PLAN", "B-QUIZ","ADDOMEDIA", "STOCK IT"};
    String events4[] = {"PROJECT VIEW"};
    String events5[] = {"CRUMBS", "ODYSSEY", "SHOOT M UP", "INSTA CLICK"};
    String events6[] = {"X QUIZ'IT", "WIZCASE", "KWIZNET", "FOOD PRODUCT LABELLING", "CREATION-X-NIHILO", "WORD WARRIOR"};
    String events7[] = {"MEKANIX", "RAGS TO RICHES"};
    String events8[] = {"ELECTRONICALLY YOURS", "THE QUIZ", "YOUTH PARLIAMENT"};
    String events9[] = {"CAD O MANIA", "NIRMAAN"};
    String events10[] = {"TREASURE HUNT"};
    String sponsors[] = {"GEEK ALUMS"};
    String sponsorslink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEN2RTOTBnLTZhNFE";
    String megalink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEOUlTaEJSa3BDQzQ";
    String funlink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEWDFiWkRPR25OYzQ";
    String team[] = {"Ashish Choudhary", "Shubham Sharma", "Priyankar Banerjee", "Mayank", "Wriddhi Mukherjee", "Aqsa Zea", "Kumar Satyam Singh", "Anurag Ranjan", "Akhilesh Upadhyay"};
    Map<String, String> eventDetails, link, teamPost, sponType, intraLink, intraDetails, sponImg, megaType, megaImg;
    Map<String, Integer> teamImg, teamImg1, categoriesImg, eventsImg;
    Map<String, Long> teamNum;


    Master()
    {
        eventDetails = new HashMap<String, String>();
        eventDetails.put("FLAWLESS", "A flawless code is all that you need to build the best and destroy the rest.\n" +
                "Suraj Kumar\n" +
                "8820070440\n" +
                "Ashish Kumar\n" +
                "8697879005\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/Flawless.pdf");
        eventDetails.put("BUG HUNT", "Only vigilant minds at work! Debug the buggy algorithm before anybody else does.\n" +
                "Raunak Roy\n" +
                "9831079974\n" +
                "Shubhadeep Basu\n" +
                "9051734382\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/BugHunt.pdf");
        eventDetails.put("CRYPTO QUEST", "Decrypt the encrypted problem and code out its solution.\n" +
                "Puja Singh\n" +
                "9474373163\n" +
                "Shreya Chamaria\n" +
                "9163220215\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/CryptoQuest.pdf");
        eventDetails.put("CODANWARS", "For coders having strategic skills in them, this online map conquest event will be a cake- walk!\n" +
                "Ritwik Datta\n" +
                "8334881521\n" +
                "Suraj Kumar\n" +
                "8820070440\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/Codan%20Wars.pdf");
        eventDetails.put("CODE OUT", "An online coding event on the platform of CodeChef.\n" +
                "Ashish Kumar\n" +
                "8820022347\n" +
                "Shubhadeep Basu\n" +
                "9051734382\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/Code%20Out.pdf");
        eventDetails.put("CODANWARS", "For coders having strategic skills in them, this online map conquest event will be a cake- walk!\n" +
                "Ritwik Datta\n" +
                "8334881521\n" +
                "Suraj Kumar\n" +
                "8820070440\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/Codan%20Wars.pdf");
        eventDetails.put("BLIND CODING", "Can you code blindly? Then come show us your power of coding at Edge 2017.\n" +
                "Shubhadeep Basu\n" +
                "9051734382\n" +
                "Supratik Basu\n" +
                "9046688464\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/BLINDCODING.pdf");



        eventDetails.put("SARVATRA", "A competition of collaboration of the hands and the mind bots in the field in which only joint perfections will triumph.\n" +
                "Rahul Kumar Goel\n" +
                "9804150874\n" +
                "Saurabh Kumar Gupta\n" +
                "8697474145\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/sarvatra.pdf");

        eventDetails.put("AFFILIATOR", "Where you're the best kind of god, the one with the function controller in your hands.\n" +
                "Aman Jaiswal\n" +
                "7059486071\n" +
                "Sagar Sangam\n" +
                "7059486078\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/affiliator.pdf");

        eventDetails.put("DRAG-ON","The better you dodge your bot through the field, the more goals you score.\n" +
                "Himanshu Kumar Micky\n" +
                "8620038947\n" +
                "Tuhin Pal\n" +
                "9475263491\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/drag-on.pdf");
        eventDetails.put("MARINODRIFT","Simultaneous success in both terrains in the field will bring about victory.\n" +
                "Aman Singh\n" +
                "7044296374\n" +
                "Ekram Ansari\n" +
                "7890145686\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/marinodrift.pdf");
        eventDetails.put("JIGSAW","Life is a maze so don't just gaze but change your pace to win the race.\n" +
                "Dwitam Ghosh\n" +
                "8293929077\n" +
                "Akramul Kabir\n" +
                "8017510039\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/jigsaw.pdf");
        eventDetails.put("DOUBLE-UP","All work and no play makes Jack's bot tired of its job, so have fun with your bots in this robotics fun event.\n" +
                "Md Arqum Shahzad\n" +
                "9471945558\n" +
                "Chetna Bulbul\n" +
                "9007221426\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/double-up.pdf");
        eventDetails.put("STALKER","Where you bestow sentience upon an electro-mechanic jumble with a few taps of the keyboard to complete its quest.\n" +
                "Utsav Shah\n" +
                "8697108688\n" +
                "Beauty Kumari\n" +
                "9748430057\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/stalker.pdf");
        eventDetails.put("BLITZKRIEG","War does not only determine who is right – only who is left victorious in the end.\n" +
                "Ashif Iqbal\n" +
                "7059546856\n" +
                "Piyush Raj\n" +
                "8282926317\n" +
                "n\n" +
                "9\n" +
                "3\n" +
                "13\n" +
                "00\n" +
                "http://edg.co.in/assets/blitzkrieg.pdf");
        eventDetails.put("WALLSTREET","Robots are just people with semicolons instead of synapses. Triumph with the perfect creation.\n" +
                "Indranil Chatterjee\n" +
                "8116288844\n" +
                "Sourabh Shivendra Pathak\n" +
                "7059485134\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "30\n" +
                "http://edg.co.in/assets/wallstreet.pdf");
        eventDetails.put("CS COLLEGE LEAGUE","Put your AWP skills acquired from bunked classes into good use here.\n" +
                "Arabindo Ghosh\n" +
                "9038814910\n" +
                "Neel Roy\n" +
                "9830052618\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/csgo-college-league.pdf");
        eventDetails.put("CS PRO LEAGUE","For the best of the best.\n" +
                "Tapobrata Saha\n" +
                "9830590381\n" +
                "Arabindo Ghosh\n" +
                "9038814910\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/csgo-pro-league.pdf");
        eventDetails.put("DOTA 2","No business but war, no family but death, no mercy but the grave! It's time to choose the sides. Would you choose the might of the dark or the glory of the light.\n" +
                "Ayan Ghosh\n" +
                "9734464681\n" +
                "Akash Mitra Thakur\n" +
                "8759402431\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/dota-2.pdf");
        eventDetails.put("CLASH OF CLANS","Get ready for the biggest clash at Edge 17.\n" +
                "Abhik Das\n" +
                "7501794441\n" +
                "Surajit Ghosh\n" +
                "9038810174\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/coc.pdf");
        eventDetails.put("NEED FOR SPEED MOST WANTED","Got gas-tank for brain and gasoline for blood? Come prove it.\n" +
                "Shivalik Chakravarty\n" +
                "8017734424\n" +
                "Swarup Sukai\n" +
                "7098501151\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/need-for-speed.pdf");
        eventDetails.put("FIFA COLLEGE LEAGUE","The strength of the leg lies in the hands.\n" +
                "Suman Mandal\n" +
                "9038457494\n" +
                "Arkadeep Chatterjee\n" +
                "9830370622\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/fifa-college-league.pdf");
        eventDetails.put("FIFA 16 PRO LEAGUE","Attack like Barca, defend like Juventus, win like Bayern; Be the best of the best\n" +
                "Arkadeep Chatterjee\n" +
                "9830370622\n" +
                "Rohan Sarkhel\n" +
                "9474579101\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/fifa-pro-league.pdf");
        eventDetails.put("B-PLAN","Money speaks, but only if you're an able enough interrogator with a judicious business plan.\n" +
                "Harsh H Sheth\n" +
                "9681253545\n" +
                "Punit Ojha\n" +
                "9163413293\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/B-Plan.pdf");
        eventDetails.put("B-QUIZ","In a sea of uncertainty, be the anchor, be the map, be the compass.\n" +
                "Saptarshi Ghosh\n" +
                "9474092342\n" +
                "Md Isa\n" +
                "9681089227\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/B-Quiz.pdf");
        eventDetails.put("ADDOMEDIA","Creative without strategy is called art, creative with strategy is called advertising.\n" +
                "Punit Ojha\n" +
                "9163413293\n" +
                "Saptarshi Ghosh\n" +
                "9474092342\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/Addomedia.pdf");
        eventDetails.put("STOCK IT","\"Rule No.1: Never lose money. Rule No.2: Never forget rule No.1.\" - Warren Buffet. It is that simple. Or is it? Find out as you take on the stock market in a quest to gather as much wealth as you can. Limited participants allowed. Register Here: http://www.dsij.in/stock-edge-2017.aspx Challenge Key: DgQWBvB7\n" +
                "Harsh H Sheth\n" +
                "9681253545\n" +
                "Harsh H Sheth\n" +
                "9681253545\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "30\n" +
                "http://edg.co.in/assets/StockIt.pdf");
        eventDetails.put("PROJECT VIEW","Think out of the box! Explore your innovation, implement the ideas and impress the jury with your creation.\n" +
                "ANUKALPA ROY\n" +
                "9474158507\n" +
                "ADITI KUMARI\n" +
                "8276960454\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/innovati.pdf");
        eventDetails.put("CRUMBS","Landscape photography? That be too mainstream. Time to discover and capture the elegance in the most inconspicuous things around.\n" +
                "Rudranil Das (Rudy)\n" +
                "8013785503\n" +
                "Rudranil Das (Rudy)\n" +
                "8013785503\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/Crumbs.pdf");
        eventDetails.put("ODYSSEY","A picture is worth a thousand words. Tell us your story as you capture the mobility.\n" +
                "Rudranil Das (Rudy)\n" +
                "8013785503\n" +
                "Dipon (Danny Roger)\n" +
                "8013138986\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/Odyssey.pdf");
        eventDetails.put("SHOOT M UP","A live photography competition where your photographic skills combined with innovative ideas can bag you the first prize.\n" +
                "Saptadip Das\n" +
                "7059703077\n" +
                "Subhradeep\n" +
                "8436238707\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/Shoot-em-up.pdf");
        eventDetails.put("INSTA CLICK","The best and the most extraordinary photograph clicked on the spot gets awarded.\n" +
                "Dipon (Danny Roger)\n" +
                "8013138986\n" +
                "Priyanka Sengupta\n" +
                "9748234607\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/InstaClick.pdf");
        eventDetails.put("X QUIZ'IT","Think fast and think hard, thats the way you win this highly informative event.\n" +
                "SRIYANSHI BANERJI\n" +
                "9674341362\n" +
                "PIYALI ROY\n" +
                "8584065639\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/x-quizit.pdf");
        eventDetails.put("WIZCASE","Don the hats of real life consultants to figure out solutions of real life problems through practical thinking.\n" +
                "VANDANA SINGH\n" +
                "8620947119\n" +
                "KOEL ROY\n" +
                "8013946165\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/wizcase.pdf");
        eventDetails.put("KWIZNET","Being fast and a foodie are the only requirements for this online quiz with a time limit.\n" +
                "SRIYANSHI BANERJI\n" +
                "9674341362\n" +
                "PIYALI ROY\n" +
                "8584065639\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/kwiznet.pdf");
        eventDetails.put("FOOD PRODUCT LABELLING","Create labels for a food product under strict guidelines in a fixed period of time to take home the winning prize.\n" +
                "SREYASEE BISWAS\n" +
                "9051972439\n" +
                "ABHIJIT SAHA\n" +
                "7001912929\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/crypto-label.pdf");
        eventDetails.put("CREATION-X-NIHILO","Channel your inner innovator to create an effective machine from raw materials and showcase your creativity.\n" +
                "Nilanjan Bhattacharyya\n" +
                "9163506577\n" +
                "RAPTILEKHA CHOWDHURY\n" +
                "9073853754\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/creationxnihilo.pdf");
        eventDetails.put("WORD WARRIOR","An exhilarating event that combines teamwork with speed and accuracy in order to emerge victorious.\n" +
                "SOUMYAJIT BAGCHI\n" +
                "9038649522\n" +
                "SANKHABRATA CHOWDHURY\n" +
                "8697517273\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/WORD_WARRIOR.pdf");
        eventDetails.put("MEKANIX","Let your concept of mechanics shine through and take you forward via your creativity.\n" +
                "Srestha Paul\n" +
                "9674480944\n" +
                "Srestha Paul\n" +
                "9674480944\n" +
                "y\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/mekanix.pdf");
        eventDetails.put("RAGS TO RICHES","Your incredible mind, if used to turn the ordinary into the extraordinary, will take you from rags to riches.\n" +
                "Srestha Paul\n" +
                "9674480944\n" +
                "Srestha Paul\n" +
                "9674480944\n" +
                "y\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEWjMyc21xcmlkbDQ");
        eventDetails.put("ELECTRONICALLY YOURS","An on spot event which will ultimately reveal how well you know your electron.\n" +
                "Nirjhar (NGT)\n" +
                "8902230155\n" +
                "Nirjhar (NGT)\n" +
                "8902230155\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/electronicallyyours.pdf");
        eventDetails.put("THE QUIZ","If you think you know about the world you live in, take your inquisitiveness a step further!\n" +
                "Nirjhar (NGT)\n" +
                "8902230155\n" +
                "Nirjhar (NGT)\n" +
                "8902230155\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/Quiz.pdf");
        eventDetails.put("YOUTH PARLIAMENT","A replica of the Indian Parliament itself with its members consisting of politically aware students, where the proceedings would be done through debate, party formation, policy making and voting.\n" +
                "ANKIT ANJAN\n" +
                "7739793511\n" +
                "ANKIT ANJAN\n" +
                "7739793511\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/Youth%20Parliament.pdf");
        eventDetails.put("TREASURE HUNT","Time for you  to unveil an intriguing treasure that is only a few clues away.\n"+
                "Harsh Sheth\n" +
                "9681253545\n" +
                "Harsh Sheth\n" +
                "9681253545\n"+
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEWjMyc21xcmlkbDQ");
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
                "Suvotosh Nandi\n" +
                "9804137312\n" +
                "Soumyabrata Guha\n" +
                "8013811950\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/Cad_o_mania.pdf");
        eventDetails.put("NIRMAAN", "The art of constructing Bridge . Bring out the Engineer inside you. May the BRIDGE you build today, light the way for a better tomorrow.\n" +
                "Soumyabrata Guha\n" +
                "8013811950\n" +
                "Suvotosh Nandi\n" +
                "9804137312\n" +
                "n\n" +
                "7\n" +
                "3\n" +
                "9\n" +
                "00\n" +
                "http://edg.co.in/assets/Nirmaan.pdf");


        eventsImg = new HashMap<String, Integer>();
        eventsImg.put("BUG HUNT", R.drawable.bughunt);
        eventsImg.put("FLAWLESS", R.drawable.flawless);
        eventsImg.put("CRYPTO QUEST", R.drawable.cryptoquest);
        eventsImg.put("CODANWARS", R.drawable.codemart);
        eventsImg.put("CODE OUT", R.drawable.codeout);
        eventsImg.put("CODANWARS", R.drawable.codanwars);
        eventsImg.put("BLIND CODING", R.drawable.blindcoding);
        eventsImg.put("SARVATRA", R.drawable.sarvatra);
        eventsImg.put("AFFILIATOR", R.drawable.affiliator);
        eventsImg.put("DRAG-ON",R.drawable.dragon);
        eventsImg.put("MARINODRIFT",R.drawable.marinodrift);
        eventsImg.put("JIGSAW",R.drawable.jigsaw);
        eventsImg.put("DOUBLE-UP",R.drawable.doubleup);
        eventsImg.put("STALKER",R.drawable.stalker);
        eventsImg.put("BLITZKRIEG",R.drawable.blitzkrieg);
        eventsImg.put("WALLSTREET",R.drawable.wallstreet);
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
        eventsImg.put("STOCK IT",R.drawable.stockit);
        eventsImg.put("PROJECT VIEW",R.drawable.projectview);
        eventsImg.put("CRUMBS",R.drawable.crumbs);
        eventsImg.put("ODYSSEY",R.drawable.odyssey);
        eventsImg.put("SHOOT M UP",R.drawable.shootmup);
        eventsImg.put("INSTA CLICK",R.drawable.instaclick);
        eventsImg.put("X QUIZ'IT",R.drawable.xquizit);
        eventsImg.put("WIZCASE",R.drawable.wizcase);
        eventsImg.put("KWIZNET",R.drawable.kwiznet);
        eventsImg.put("FOOD PRODUCT LABELLING",R.drawable.foodproductlabelling);
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
        link.put("FLAWLESS", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEa0xFT09iWkdkcGc");
        link.put("BUG HUNT", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEMXMzb3kwSk5DUWc");
        link.put("CRYPTO QUEST", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEd01zUGZ5V2xHYkU");
        link.put("CODANWARS", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDENHk2ck82Mnlvb2M");
        link.put("CODE OUT", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDES1lYdWFaSnJvSU0");
        link.put("BLIND CODING", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEN3V6dUdjYjEyUXc");
        link.put("SARVATRA", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEYldLcEZGcWw2Y28");
        link.put("AFFILIATOR", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEcUZJNjdyYnpBMDA");
        link.put("DRAG-ON", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEYWdBUnFBSXpnclU");
        link.put("MARINODRIFT", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEa2tTQTI3dlB6U0k");
        link.put("JIGSAW", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEWERFMldZM0NYUkE" );
        link.put("DOUBLE-UP", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEUV9nZ3YyczBBUkE");
        link.put("STALKER", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDET3ZOUEE0akZEaWc");
        link.put("BLITZKRIEG", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEb0NlVFEtVmtGNHc");
        link.put("WALLSTREET", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEU1BWbldIOGp1YlE");
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
        link.put("STOCK IT", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEY0VIdW9iLVhjYlU");
        link.put("PROJECT VIEW", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiNlpkSXd6bV9ULVE");
        link.put("CRUMBS", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqidWpOaWFrMnJNYUE");
        link.put("ODYSSEY", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiYmdLTTZaM3VNdVE");
        link.put("SHOOT M UP", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiZVFWZHNLMjM5LWM");
        link.put("INSTA CLICK", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiaUFHTDczaGZUR3M");
        link.put("X QUIZ'IT", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiZDBWUTJyblJBOEk");
        link.put("WIZCASE", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiSU5sWGVwdDc1Y1U");
        link.put("KWIZNET", "https://drive.google.com/uc?export=download&id=0BywZFi8e3vqiT3FRSnNZdjVWc1U");
        link.put("FOOD PRODUCT LABELLING", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEbWFtUkJ1dklabFU");
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

        teamImg1 = new HashMap<String, Integer>();
        teamImg1.put("Ashish Choudhary", R.drawable.ashish1);
        teamImg1.put("Shubham Sharma", R.drawable.shubham1);
        teamImg1.put("Priyankar Banerjee", R.drawable.priyankar1);
        teamImg1.put("Mayank", R.drawable.mayank1);
        teamImg1.put("Wriddhi Mukherjee", R.drawable.wridhhi1);
        teamImg1.put("Aqsa Zea", R.drawable.aqsa1);
        teamImg1.put("Kumar Satyam Singh", R.drawable.kumar1);
        teamImg1.put("Anurag Ranjan", R.drawable.anurag1);
        teamImg1.put("Akhilesh Upadhyay", R.drawable.akhilesh1);

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
        categoriesImg.put("Fun Events", R.drawable.fun_events);

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
                "FOOD RELAY\n" +
                "Have you ever shown your team work? A chance is given to you by EDGE 2016 to show your skills in team game “FOOD RELAY”\n" +
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