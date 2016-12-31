package com.harsh.starringharsh.EDGE;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by starringharsh on 01-12-2016.
 */

class Master {

    String categories[] = {"Compute Aid", "Robotics", "Cyber Crusade"};
    String events0[] = {"Bug Hunt", "Flaw Less", "Code Mart"};
    String events1[] = {"Blitzkreig", "Robowar"};
    String events2[] = {"NSF Most Wanted", "CS Pro League", "CS College League"};
    String sponsors[] = {"ABC", "PQR", "XYZ"};
    String sponsorslink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEUHktS1d1Y240a1U";
    String mega[] = {"ABC", "PQR", "XYZ"};
    String megalink = "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEOUlTaEJSa3BDQzQ";
    String team[] = {"Ashish Choudhary", "Shubham Sharma"};
    Map<String, String> eventDetails, link, teamPost, sponType, sponImg, megaType, megaImg;
    Map<String, Integer> teamImg, categoriesImg;
    Map<String, Long> teamNum;


    Master()
    {
        eventDetails = new HashMap<String, String>();
        eventDetails.put("Bug Hunt", "Hello These Are Default Details For Bug Hunt");
        eventDetails.put("Flaw Less", "Hello These Are Default Details For Flaw Less. khagflkgalbvl iausbciulwfhlui agfiluagcjkbc augvuiasbcuak cgsiuagfugl ifugakgf afgailuviul hgyyiu  iuiul ui g ilug ilugliugiul giulg iulg ugiulglu glig ilu giu gyfiuguig iuugiugiugiug iugiugiug iugiugoighoiu iugilugiulg iugiugliugliug iugiugiugiug iugifuydfy gutdytdytdyt tdytdyduitduiy 6r8riufuiyf 86ru66rfu7ruyr 6ururfuyfyuf 7i6r8t6r r76er76r76ir r68r87r78rt 868r87ro87t8 8r787ruyfi68e6 6r68r87r87 68r87r87r 76e76e76r 87t887ti7r cgsiuagfugl ifugakgf afgailuviul hgyyiu  iuiul ui g ilug ilugliugiul giulg iulg ugiulglu glig ilu giu gyfiuguig iuugiugiugiug iugiugiug iugiugoighoiu iugilugiulg iugiugliugliug iugiugiugiug iugifuydfy gutdytdytdyt tdytdyduitduiy 6r8riufuiyf 86ru66rfu7ruyr 6ururfuyfyuf 7i6r8t6r r76er76r76ir r68r87r78rt 868r87ro87t8 8r787ruyfi68e6 6r68r87r87 68r87r87r 76e76e76r 87t887ti7r cgsiuagfugl ifugakgf afgailuviul hgyyiu  iuiul ui g ilug ilugliugiul giulg iulg ugiulglu glig ilu giu gyfiuguig iuugiugiugiug iugiugiug iugiugoighoiu iugilugiulg iugiugliugliug iugiugiugiug iugifuydfy gutdytdytdyt tdytdyduitduiy 6r8riufuiyf 86ru66rfu7ruyr 6ururfuyfyuf 7i6r8t6r r76er76r76ir r68r87r78rt 868r87ro87t8 8r787ruyfi68e6 6r68r87r87 68r87r87r 76e76e76r 87t887ti7r 76r7i6ri7er e67e7r67i gsdhssh sdh sh hsdea e ystry rttstth heshtseh. cgsiuagfugl ifugakgf afgailuviul hgyyiu  iuiul ui g ilug ilugliugiul giulg iulg ugiulglu glig ilu giu gyfiuguig iuugiugiugiug iugiugiug iugiugoighoiu iugilugiulg iugiugliugliug iugiugiugiug iugifuydfy gutdytdytdyt tdytdyduitduiy 6r8riufuiyf 86ru66rfu7ruyr 6ururfuyfyuf 7i6r8t6r r76er76r76ir r68r87r78rt 868r87ro87t8 8r787ruyfi68e6 6r68r87r87 68r87r87r 76e76e76r 87t887ti7r 76r7i6ri7er e67e7r67i gsdhssh sdh sh hsdea e ystry rttstth heshtseh. cgsiuagfugl ifugakgf afgailuviul hgyyiu  iuiul ui g ilug ilugliugiul giulg iulg ugiulglu glig ilu giu gyfiuguig iuugiugiugiug iugiugiug iugiugoighoiu iugilugiulg iugiugliugliug iugiugiugiug iugifuydfy gutdytdytdyt tdytdyduitduiy 6r8riufuiyf 86ru66rfu7ruyr 6ururfuyfyuf 7i6r8t6r r76er76r76ir r68r87r78rt 868r87ro87t8 8r787ruyfi68e6 6r68r87r87 68r87r87r 76e76e76r 87t887ti7r 76r7i6ri7er e67e7r67i gsdhssh sdh sh hsdea e ystry rttstth heshtseh. cgsiuagfugl ifugakgf afgailuviul hgyyiu  iuiul ui g ilug ilugliugiul giulg iulg ugiulglu glig ilu giu gyfiuguig iuugiugiugiug iugiugiug iugiugoighoiu iugilugiulg iugiugliugliug iugiugiugiug iugifuydfy gutdytdytdyt tdytdyduitduiy 6r8riufuiyf 86ru66rfu7ruyr 6ururfuyfyuf 7i6r8t6r r76er76r76ir r68r87r78rt 868r87ro87t8 8r787ruyfi68e6 6r68r87r87 68r87r87r 76e76e76r 87t887ti7r 76r7i6ri7er e67e7r67i gsdhssh sdh sh hsdea e ystry rttstth heshtseh. 76r7i6ri7er e67e7r67i gsdhssh sdh sh hsdea e ystry rttstth heshtseh. 76r7i6ri7er e67e7r67i gsdhssh sdh sh hsdea e ystry rttstth heshtseh. cgsiuagfugl ifugakgf afgailuviul hgyyiu  iuiul ui g ilug ilugliugiul giulg iulg ugiulglu glig ilu giu gyfiuguig iuugiugiugiug iugiugiug iugiugoighoiu iugilugiulg iugiugliugliug iugiugiugiug iugifuydfy gutdytdytdyt tdytdyduitduiy 6r8riufuiyf 86ru66rfu7ruyr 6ururfuyfyuf 7i6r8t6r r76er76r76ir r68r87r78rt 868r87ro87t8 8r787ruyfi68e6 6r68r87r87 68r87r87r 76e76e76r 87t887ti7r 76r7i6ri7er e67e7r67i gsdhssh sdh sh hsdea e ystry rttstth heshtseh.\nHarsh Sheth\n9681253545\nAaditya\n8789675837\nN\n3\n3\n3\n3");
        eventDetails.put("Code Mart", "Hello These Are Default Details For Code Mart");
        eventDetails.put("Blitzkreig", "Hello These Are Default Details Blitskreig");
        eventDetails.put("Robowar", "Hello These Are Default Details For Robowar");
        eventDetails.put("NFS Most Wanted", "Hello These Are Default Details For NFS Most Wanted");
        eventDetails.put("CS Pro League", "Hello These Are Default Details For CS Pro League");
        eventDetails.put("CS College League", "Hello These Are Default Details For CS College League");

        link = new HashMap<String, String>();
        link.put("Bug Hunt", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEcGVHWkN4bkdWaVk");
        link.put("Flaw Less", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEcGVHWkN4bkdWaVk");
        link.put("Code Mart", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEcGVHWkN4bkdWaVk");
        link.put("Blitzkreig", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEcGVHWkN4bkdWaVk");
        link.put("Robowar", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEcGVHWkN4bkdWaVk");
        link.put("NFS Most Wanted", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEcGVHWkN4bkdWaVk");
        link.put("CS Pro League", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEcGVHWkN4bkdWaVk");
        link.put("CS College League", "https://drive.google.com/uc?export=download&id=0B9ir1SJLpxDEcGVHWkN4bkdWaVk");

        teamImg = new HashMap<String, Integer>();
        teamImg.put("Ashish Choudhary", R.drawable.ashish);
        teamImg.put("Shubham Sharma", R.drawable.shubham);

        teamPost = new HashMap<String, String>();
        teamPost.put("Ashish Choudhary", "Convener");
        teamPost.put("Shubham Sharma", "Co Convener");

        teamNum = new HashMap<String, Long>();
        teamNum.put("Ashish Choudhary", 9836891210L);
        teamNum.put("Shubham Sharma", 9836933862L);

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
    }

}