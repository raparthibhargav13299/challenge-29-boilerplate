/**
 * ch29
 */
public class ch29 {

    public static void main(String[] args) {
        manual m=new manual();
        m.showSpecs("MP4");
        m.showSpecs("MP5");
        m.showSpecs("MP6");
        m.showSpecs("MD5");
        m.showSpecs("MD6");
      amt a=new amt();
      a.showSpec("AMTP4");
      a.showSpec("AMTD5");
cvtdct cd=new cvtdct();
cd.showSpec("CVT6");
cd.showSpec("DCT8");



    }
}

class Transmission 
{
    public String Num1="MP4",Num2="MP5",Num3="MP6",Num4="MD5",Num5="MD6",Num6="AMTP4",Num7="AMTD5",Num8="CVT6",Num9="DCT8";
    public int gears1,gears2,gears3,gears4,gears5,gears6,gears7,gears8,gears9;
    public float gear1,gear2,gear3,gear4,gear5,gear6,gear7,gear8,gear9,gear10,gear11,gear12,gear13,gear14,gear15,gear16,gear17,gear18,gear19,gear20,gear21,gear22,gear23,gear24,gear25,gear26,gear27,gear28,gear29,gear30,gear31,gear32,gear33,gear34,gear35,gear36,gear37,gear38,gear39,gear40,gear41,gear42,gear43,gear44,gear45,gear46,gear47,gear48,gear49;
    
        public Transmission()
        {
            if(Num1=="MP4")
            {
               Num1="MP4";
                gears1=4;
                gear1=2.540f;
                gear2=1.920f;
                gear3=1.510f;
               gear4=1.000f;
    
            }
            if(Num2=="MP5")
            {
               Num2="MP5";
              gears2=5;
                gear5=3.545f;
               gear6=1.904f;
              gear7=1.280f;
              gear8=0.914f;
           

            }

            if(Num3=="MP6")
            {
                Num3="MP6";
               gears3=6;
               gear10=3.010f;
               gear11=2.070f;
                gear12=1.430f;
                gear13=1.000f;
            }
            if(Num4=="MD5")
            {
               Num4="MD5";
                gears4=5;
                gear16=3.545f;
                gear17=1.904f;
                gear18=1.233f;
                gear19=0.911f;
            }

            if(Num5=="MD6")
            {
                Num5="MD6";
                gears5=6;
                gear21=3.640f;
                gear22=2.150f;
                gear23=1.360f;
               gear24=1.000f;
            }
            if(Num6=="AMTP4")
            {
                Num6="AMTP4";
                gears6=4;
                gear27=2.540f;
               gear28=1.920f;
                gear29=1.510f;
                gear30=1.000f;
    
            }

            if(Num7=="AMTD5")
            {
                Num7="AMTD5";
                gears7=5;
                gear31=2.950f;
               gear32=1.940f;
                gear33=1.340f;
                gear34=1.000f;
            }
            if(Num8=="CVT6")
            {
                Num8="CVT6";
                gears8=6;
                gear36=2.631f;
                gear37=1.440f;
                gear38=1.165f;
                gear39=0.906f;
            }
            if(Num9=="DCT8")
            {
                Num9="DCT8";
                gears9=8;
                gear42=4.714f;
                gear43=3.143f;
                gear44=2.106f;
               gear45=1.667f;
            }



            


        }
    }
    class manual extends Transmission 
    {
        public manual(){
           
            if(Num1=="MP4")
            {
                Num1="MP4";
                gears1=4;
                gear1=2.540f;
                gear2=1.920f;
                gear3=1.510f;
                gear4=1.000f;
                
    
            }


            if(Num2=="MP5")
            {
                Num2="MP5";
                gears2=5;
               gear5=3.545f;
               gear6=1.904f;
                gear7=1.280f;
                gear8=0.914f;
               gear9=0.757f;
                
            }
            
            if(Num3=="MP6")
            {
                Num3="MP6";
               gears3=6;
               gear10=3.010f;
                gear11=2.070f;
                gear12=1.430f;
               gear13=1.000f;
               gear14=0.710f;
                gear15=0.570f;
                
            }
            if(Num4=="MD5")
            {
                Num4="MD5";
                gears4=5;
                gear16=3.545f;
               gear17=1.904f;
               gear18=1.233f;
                gear19=0.911f;
               gear20=0.725f;
                
            }
              if(Num5=="MD6")
            {
                Num5="MD6";
                gears5=6;
                gear21=3.640f;
               gear22=2.150f;
                gear23=1.360f;
                gear24=1.000f;
                gear25=0.750f;
                gear26=0.630f;
                
            }
            

          
        }


        

        public void showSpecs(String Num) 
    {
        switch(Num) 
        {
        case "MP4" :
        System.out.println("Transmission type : Manual Transmission"+"\nModel number      : "+Num1+"\nForward Gears     : "
        +gears1+"\n1st Gear Ratio    : "+gear1+"\n2nd Gear Ratio    : "+gear2+"\n3rd Gear Ratio    : "+gear3+"\n4th Gear Ratio    : "
        +gear4+"\n\n--------------------------------------------------------");
        break;
        case "MP5" :
        System.out.println("Transmission type : Manual Transmission"+"\nModel number      : "+Num2+"\nForward Gears     : "
        +gears2+"\n1st Gear Ratio    : "+gear5+"\n2nd Gear Ratio    : "+gear6+"\n3rd Gear Ratio    : "+gear7+"\n4th Gear Ratio    : "
        +gear8+"\n5th Gear Ratio    : "+gear9+"\n\n--------------------------------------------------------");
        break;
        case "MP6" :
        System.out.println("Transmission type : Manual Transmission"+"\nModel number      : "+Num3+"\nForward Gears     : "
        +gears3+"\n1st Gear Ratio    : "+gear10+"\n2nd Gear Ratio    : "+gear11+"\n3rd Gear Ratio    : "+gear12+"\n4th Gear Ratio    : "
        +gear13+"\n5th Gear Ratio    : "+gear14+"\n6th Gear Ratio    : "+gear15+"\n\n--------------------------------------------------------");
        break;
        case "MD5" :
        System.out.println("Transmission type : Manual Transmission"+"\nModel number      : "+Num4+"\nForward Gears     : "
        +gears4+"\n1st Gear Ratio    : "+gear16+"\n2nd Gear Ratio    : "+gear17+"\n3rd Gear Ratio    : "+gear18+"\n4th Gear Ratio    : "
        +gear19+"\n5th Gear Ratio    : "+gear20+"\n\n--------------------------------------------------------");
        break;
        case "MD6" :
        System.out.println("Transmission type : Manual Transmission"+"\nModel number      : "+Num5+"\nForward Gears     : "
        +gears5+"\n1st Gear Ratio    : "+gear21+"\n2nd Gear Ratio    : "+gear22+"\n3rd Gear Ratio    : "+gear23+"\n4th Gear Ratio    : "
        +gear24+"\n5th Gear Ratio    : "+gear25+"\n6th Gear Ratio    : "+gear26+"\n\n--------------------------------------------------------");
        break;
        

    }
}
    }


    class amt extends Transmission
    {
        public amt()
        {


            if(Num6=="AMTP4")
            {
               Num6="AMTP4";
                gears6=4;
                gear27=2.540f;
                gear28=1.920f;
               gear29=1.510f;
               gear30=1.000f;
    
            }
            if(Num7=="AMTD5")
            {
                Num7="AMTD5";
                gears7=5;
               gear31=2.950f;
                gear32=1.940f;
               gear33=1.340f;
               gear34=1.000f;
                gear35=0.630f;
    
            }
    
        }


        public void showSpec(String Num) 
    {
        switch(Num) 
        {
        case "AMTP4" :
        System.out.println("Transmission type : Automated Manual Transmission"+"\nModel number      : "+Num6+"\nForward Gears     : "
        +gears6+"\n1st Gear Ratio    : "+gear27+"\n2nd Gear Ratio    : "+gear28+"\n3rd Gear Ratio    : "+gear29+"\n4th Gear Ratio    : "
        +gear30+"\n\n--------------------------------------------------------");
        break;
        case "AMTD5" :
        System.out.println("Transmission type : Automated Manual Transmission"+"\nModel number      : "+Num7+"\nForward Gears     : "
        +gears7+"\n1st Gear Ratio    : "+gear31+"\n2nd Gear Ratio    : "+gear32+"\n3rd Gear Ratio    : "+gear33+"\n4th Gear Ratio    : "
        +gear34+"\n5th Gear Ratio    : "+gear35+"\n\n--------------------------------------------------------");
        break;

    }
}
    }





    class cvtdct extends Transmission
    {



        public cvtdct()
        {


            if(Num8=="CVT6")
            {
               Num8="CVT6";
                gears8=6;
                gear36=2.631f;
                gear37=1.440f;
                gear38=1.165f;
                gear39=0.906f;
                gear40=0.680f;
                gear41=0.499f;
    
            }
            if(Num9=="DCT8")
            {
                Num9="DCT8";
            gears9=8;
                gear42=4.714f;
                gear43=3.143f;
                gear44=2.106f;
                gear45=1.667f;
               gear46=1.285f;
            gear47=1.000f;
            gear48=0.839f;
            gear49=0.667f;
            
    
            }

        }

        public void showSpec(String Num) 
        {

            switch(Num) 
            {
                case "CVT6" :
                 System.out.println("Transmission type : CVT "+"\nModel number      : "+Num8+"\nForward Gears     : "
            +gears8+"(Simulated)"+"\n1st Gear Ratio    : "+gear36+"\n2nd Gear Ratio    : "+gear37+"\n3rd Gear Ratio    : "+gear38+"\n4th Gear Ratio    : "
            +gear39+"\n5th Gear Ratio    : "+gear40+"\n6th Gear Ratio    : "+gear41+"\n\n--------------------------------------------------------");
            break;
            

            case "DCT8" :
            System.out.println("Transmission type : DCT "+"\nModel number      : "+Num9+"\nForward Gears     : "
            +gears9+"(Simulated)"+"\n1st Gear Ratio    : "+gear42+"\n2nd Gear Ratio    : "+gear43+"\n3rd Gear Ratio    : "+gear44+"\n4th Gear Ratio    : "
            +gear45+"\n5th Gear Ratio    : "+gear46+"\n6th Gear Ratio    : "+gear47+"\n7th Gear Ratio    : "+gear48+"\n8th Gear Ratio    : "
            +gear49+"\n\n--------------------------------------------------------");
            break;
           }









    }
}