import java.applet.Applet;
import java.awt.Button;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DateFormat;




public class TravelSalesManProblem extends Applet implements Runnable, ActionListener 
{	int dayNo=1;
static float distance;
String Grid="";
static float t_distance=0;
static  int time;
boolean day1=false;
static  int t_time=0;

static int fuel;
static int t_fuel=0;
static int td_fuel=0;
static int chemical;
static int t_chemical=0;
static int td_chemcial=0;
static int f_1=0;

static int cost;
static int t_cost=0;
Font d_font1 = new Font("Arial", Font.BOLD, 4);

int f_x;
int f_y;
int s_x;
int s_y;
Label distance_l = new Label("Distance");//at Point label
Label grid_l = new Label("Grid");
Label time_l = new Label("Time");
Label fuel_l = new Label("Fuel");
Label chemical_l = new Label("Chemical");
Label cost_l = new Label("Cost");
Label cost_f_sum = new Label("Total Fuel ");
Label cost_c_sum = new Label("Total Chemical ");
Label cost_d_sum = new Label("Total Distance(miles) ");
Label cost_t_sum = new Label("Total Time of Flight(hours) ");



Label points = new Label("Each Stops");
Label hour_l=new Label("Time");
Label C=new Label("C");
Label C1=new Label("Chemical");


TextField distance_tf = new TextField(5);//at Point text
TextField grid_tf = new TextField(5);
TextField time_tf = new TextField(5);
TextField fuel_tf = new TextField(5);
TextField chemical_tf =new TextField(5);
TextField cost_tf =new TextField(5);
TextField cost_f_s =new TextField(5);
TextField cost_c_s =new TextField(5);
TextField cost_d_s =new TextField(5);
TextField cost_t_s =new TextField(5);


Label Day1=new Label("Monday");
Label Total_d_1=new Label("Distance");

Label Total_t_1=new Label("Time(flight)");
Label Total_f_1=new Label("Fuel(gallon)");
Label Total_f_1d=new Label("Fuel(dollar)");
Label Total_c_1=new Label("C(gallon)");
Label Total_c_1d=new Label("C($)");
Label tc_c_1=new Label("Cost");
Label index=new Label("INDEX");
Label base=new Label("BASE");
Label Field=new Label("Crop Field");
Label Trail=new Label("Trail");
Label Trail1=new Label("__");
Label day=new Label("TUESDAY");


TextField Total_d_1_tf=new TextField(5);
TextField Total_t_1_tf=new TextField(5);
TextField Total_f_1_tf=new TextField(5);
TextField Total_f_1_tfd=new TextField(5);
TextField Total_c_1_tf=new TextField(5);
TextField Total_c_1_tfd=new TextField(5);
TextField tc_c_1_tf=new TextField(5);




Font e_font1 = new Font("Arial", Font.BOLD, 36);
Label Day2=new Label("Tuesday");
Label Total_d_2=new Label("Distance");
Label Total_t_2=new Label("Time(flight)");
Label Total_f_2=new Label("Fuel(gallon)");
Label Total_f_2d=new Label("Fuel(dollar)");
Label Total_c_2=new Label("C(gallon)");
Label Total_c_2d=new Label("C($)");
Label tc_c_2=new Label("Cost");

TextField Total_d_2_tf=new TextField(5);
TextField Total_t_2_tf=new TextField(5);
TextField Total_f_2_tf=new TextField(5);
TextField Total_f_2_tfd=new TextField(5);
TextField Total_c_2_tf=new TextField(5);
TextField Total_c_2_tfd=new TextField(5);
TextField tc_c_2_tf=new TextField(5);



int apointx[]={20,51,43,20,50,78,70,84,95,70,34,20,70,1,20};
int bpointy[]={25,31,43,25,67,88,80,94,64,80,89,79,80,71,25};
int pointx[]={200,355,315,200,350,495,450,520,575,450,270,200,450,105,200};
int pointy[]={415,385,325,415,205,90,140,70,220,140, 95, 145,140,185,415};



int tpointx[]={20,25,6,20,30,36,70,89,87,70,72,72,70,29,70};
int tpointy[]={25,12,27,25,38,72,80,76,94,80,59,48,80,80,80};

int tpx[]={200,225,130,200,250,280,450,545,535,450,460,460,450,245,450};
int tpy[]={415,480,405,415,350,180,140,160,70,140,245,300,140,140,140};

static int counter=0;
boolean flag=false;
Distance d;
	
	int Totaltime;
	int HM;
	int HS;
	protected Thread clockThread = null;
	CheckboxGroup lngGrp = null;
	DateFormat dateFormat ;


	Button b10 =new Button("Stimulate");
	
	

	
	
	Color c=new Color(18, 146, 235);
	protected Color color = c;
	
	
	protected Font font = new Font("DS-Digital", Font.BOLD, 20);
	protected Font d_font = new Font("Arial", Font.BOLD, 12);
	protected Font e_font = new Font("Arial", Font.BOLD, 16);
	



public void init()
{	
	
	setSize(800,800);
	this.setBackground(Color.WHITE);

	add(day);
	add(distance_l);
	add(points);
	add(time_l);
	add(grid_l);
	add(fuel_l);
	add(chemical_l);
	add(cost_l);
	add(base);
	add(index);
	add(Field);
	add(C);
	add(C1);
	add(Trail);
	add(Trail1);
	add(cost_c_s);
	add(cost_f_s);
	add(cost_t_s);
	add(cost_d_s);
	add(cost_t_sum);
	add(cost_d_sum);
	
	add(cost_f_sum);
	add(cost_c_sum);
	
	
	add(distance_tf);
	add(time_tf);
	add(grid_tf);
	add(fuel_tf);
	add(chemical_tf);
	add(cost_tf);
	
	
	add(Day1);//Label Day1
	add(Total_d_1);
	add(Total_t_1);
	add(Total_f_1);
	add(Total_f_1d);
	add(Total_c_1);
	add(Total_c_1d);
	add(tc_c_1);
	
	add(Day2);//Label Day2
	add(Total_d_2);
	add(Total_t_2);
	add(Total_f_2);
	add(Total_f_2d);
	add(Total_c_2);
	add(Total_c_2d);
	add(tc_c_2);
	
	add(Total_d_1_tf);//text Day 1
	add(Total_t_1_tf);
	add(Total_f_1_tf);
	add(Total_f_1_tfd);
	add(Total_c_1_tf);
	add(Total_c_1_tfd);
	add(tc_c_1_tf);
	
	add(Total_d_2_tf);//text Day 2
	add(Total_t_2_tf);
	add(Total_f_2_tf);
	add(Total_f_2_tfd);
	add(Total_c_2_tf);
	add(Total_c_2_tfd);
	add(tc_c_2_tf);
	

	
	
	add(b10);
	
 
	b10.addActionListener(this); 
	
	
	if(clockThread == null)
	{
	clockThread = new Thread(this);
	clockThread.start();
	}

}

public void run()
{
	while(Thread.currentThread() == clockThread)
	{
		repaint();
		try{
		Thread.currentThread().sleep(1000);
		}
		catch(InterruptedException e)
		{
		
	}
	}
}

public void paint(Graphics g)
{		
		
		
		g.setColor(Color.BLACK);
    	g.fillRect(100, 40, 500, 500);
	
		
		g.setColor(Color.RED);
		g.fillRect(200, 405, 10, 10);
		
		g.setColor(Color.RED);
		g.fillRect(450, 130, 10, 10);
		if(day1==true)
		{
		
		g.setColor(Color.GREEN);
		g.fillRect(520,60, 10, 10);
		g.setColor(Color.GREEN);
		g.fillRect(200,135, 10, 10);
		
		g.setColor(Color.GREEN);
		g.fillRect(270,85, 10, 10);
		
		g.setColor(Color.GREEN);
		g.fillRect(350,195, 10, 10);
		
		g.setColor(Color.GREEN);
		g.fillRect(575,210, 10, 10);
		
		g.setColor(Color.GREEN);
		g.fillRect(355,375, 10, 10);
		
		g.setColor(Color.GREEN);
		g.fillRect(105,175, 10, 10);
		
		g.setColor(Color.GREEN);
		g.fillRect(315,315, 10, 10);
		
		g.setColor(Color.GREEN);
		g.fillRect(495,80, 10, 10);
		System.out.println(counter);
		
		
		}
		else{
			g.setColor(Color.GREEN);
			g.fillRect(225,480, 10, 10);
			g.setColor(Color.GREEN);
			g.fillRect(460,290, 10, 10);
			g.setColor(Color.GREEN);
			g.fillRect(535,60, 10, 10);
			
			g.setColor(Color.GREEN);
			g.fillRect(545,150, 10, 10);
			
			g.setColor(Color.GREEN);
			g.fillRect(130,395, 10, 10);
			
			g.setColor(Color.GREEN);
			g.fillRect(280,170, 10, 10);
			
			g.setColor(Color.GREEN);
			g.fillRect(250,340, 10, 10);
			
			g.setColor(Color.GREEN);
			g.fillRect(460,235, 10, 10);
			
			g.setColor(Color.GREEN);
			g.fillRect(245,130, 10, 10);
			
			g.setColor(Color.GREEN);
			
			
		}
		this.points.setLocation(620, 40);
		this.distance_l.setLocation(620, 80);
	
		this.distance_tf.setLocation(700, 80);
		
		this.grid_l.setLocation(620, 120);
		this.grid_tf.setLocation(700, 120);
		
		this.time_l.setLocation(620, 160);
		this.time_tf.setLocation(700, 160);
		
		
		this.fuel_l.setLocation(620, 200);
		this.fuel_tf.setLocation(700, 200);
		
		this.chemical_l.setLocation(620, 240);
		this.chemical_tf.setLocation(700, 240);
		
		this.cost_l.setLocation(620, 280);
		this.cost_tf.setLocation(700, 280);
		
		g.setColor(Color.BLACK);
		g.drawRect(620, 320, 150, 150);
		this.index.setLocation(660, 310);
		
		g.setColor(Color.GREEN);
		g.fillRect(640, 340, 10, 10);
		this.Field.setLocation(660,334);
		
		g.setColor(Color.RED);
		g.fillRect(640, 360, 10, 10);
		this.base.setLocation(660,354);
		
		this.C.setLocation(640,374);
		this.C1.setLocation(660, 374);
		
		this.Trail1.setLocation(640,389);
		this.Trail.setLocation(660, 394);
		
		
		
		this.b10.setLocation(660, 490);
		
		
		
		this.Day1.setLocation( 850, 80);
		
		this.Total_d_1.setLocation(850, 120);
		this.Total_d_1_tf.setLocation(930, 120);
		
		this.Total_t_1.setLocation(850, 160);
		this.Total_t_1_tf.setLocation(930, 160);
		
		this.Total_f_1.setLocation(850, 200);
		this.Total_f_1_tf.setLocation(930, 200);
		
		this.Total_f_1d.setLocation(850, 240);
		this.Total_f_1_tfd.setLocation(930, 240);
		
		this.Total_c_1.setLocation(850, 280);
		this.Total_c_1_tf.setLocation(930, 280);
		
		this.Total_c_1d.setLocation(850, 320);
		this.Total_c_1_tfd.setLocation(930, 320);
		
		this.tc_c_1.setLocation(850, 360);
		this.tc_c_1_tf.setLocation(930, 360);
		
		
		
		this.Day2.setLocation( 1050, 80);
		
		this.Total_d_2.setLocation(1050, 120);
		this.Total_d_2_tf.setLocation(1130, 120);
		
		this.Total_t_2.setLocation(1050, 160);
		this.Total_t_2_tf.setLocation(1130, 160);
		
		this.Total_f_2.setLocation(1050, 200);
		this.Total_f_2_tf.setLocation(1130, 200);
		
		this.Total_f_2d.setLocation(1050, 240);
		this.Total_f_2_tfd.setLocation(1130, 240);
		
		this.Total_c_2.setLocation(1050, 280);
		this.Total_c_2_tf.setLocation(1130, 280);
		
		this.Total_c_2d.setLocation(1050, 320);
		this.Total_c_2_tfd.setLocation(1130, 320);
		
		this.tc_c_2.setLocation(1050, 360);
		this.tc_c_2_tf.setLocation(1130, 360);
		if(flag)
		{
			if(day1==true)
		{
				for(int i=0 ;i<counter;i++)
				{	if(counter<15)
					{g.setColor(c);
					g.drawLine(pointx[i], pointy[i], pointx[i+1],pointy[i+1]);
					}
				}
				grid_tf.setText("("+apointx[counter]+","+bpointy[counter]+")");
		}
		else{
				//grid_tf.setText("("+tpointx[counter]+","+tpointy[counter]+")");
			for(int i=0 ;i<counter;i++)
			{	if(counter<15)
				{
				g.setColor(c);
				g.drawLine(tpx[i], tpy[i], tpx[i+1],tpy[i+1]);
				}
			}
			System.out.println("::::TUES");
			
		}
		
		
		}
		grid_tf.setText("("+apointx[counter]+","+bpointy[counter]+")");
		this.day.setLocation(345,15);
		
		this.cost_f_sum.setLocation(840, 420);
		this.cost_f_s.setLocation(1100, 420);
		
		this.cost_c_sum.setLocation(840, 460);
		this.cost_c_s.setLocation(1100, 460);
		
		this.cost_d_sum.setLocation(840, 500);
		this.cost_d_s.setLocation(1100, 500);
		
		this.cost_t_sum.setLocation(840, 540);
		this.cost_t_s.setLocation(1100, 540);
		
	
	}



public void actionPerformed(ActionEvent e) {
	
	if(e.getSource()==b10)
	{	d=new Distance();
	if(day1!=true)
	{	flag=true;
		if(counter<15)
		{
		distance=d.computeDistance(tpointx[counter], tpointy[counter], tpointx[counter+1],tpointy[counter+1]);
		distance=round(distance, 2); 
		
		distance_tf.setText(""+distance);
		t_distance+=distance;
		t_distance=round(t_distance, 2); 
		Total_d_2_tf.setText(""+t_distance);
		grid_tf.setText("("+tpointx[counter]+","+tpointx[counter]+")");
		
		if(counter==14)
		{
			time=d.computeTimeLast(distance);
			time_tf.setText(""+time+"min");
			t_time=time+t_time;
			Total_t_2_tf.setText(""+t_time+"hr");
		}
		else{
		time=d.computeTime(distance,apointx[counter]);
		
	
		time_tf.setText(""+time+"min");
		t_time=time+t_time;
		Total_t_2_tf.setText(""+t_time);
		}
		fuel=d.computeFuel(time);
		fuel_tf.setText(""+fuel);
		t_fuel=fuel+t_fuel;
		Total_f_2_tf.setText(""+t_fuel);
		
		if(counter<6)
		{
		td_fuel=td_fuel+fuel*5;
		System.out.println("::::$5");
		Total_f_2_tfd.setText(""+td_fuel);
		}
		else if(counter==14)
		{
			td_fuel=td_fuel+fuel*5;
			Total_f_2_tfd.setText(""+td_fuel);
		}
		else{
			td_fuel=td_fuel+fuel*6;
			System.out.println("::$6");
			Total_f_2_tfd.setText(""+td_fuel);
		}
		
		if(apointx[counter+1]==20||apointx[counter+1]==70)
		{
			chemical_tf.setText("");
		}
		else{
			if(counter==13){
				t_chemical=250;
				chemical=25;
				Total_c_2_tf.setText(""+t_chemical);
			}
			else{
			chemical=25;	
		chemical_tf.setText(""+chemical);
		t_chemical=t_chemical+25;
		Total_c_2_tf.setText(""+t_chemical);
		}
		
		}
		if(counter<6)
		{td_chemcial=25*16+td_chemcial;
		System.out.println("::$16");
		Total_c_2_tfd.setText(""+td_chemcial);
		}
		else if(apointx[counter]==20||apointx[counter]==70)
		{
			Total_c_2_tfd.setText(""+td_chemcial);
			System.out.println("::$NONE");;
		}
		else{
			td_chemcial=25*25+td_chemcial;
			System.out.println("::$25");
			Total_c_2_tfd.setText(""+td_chemcial);
		}
		
		
	if(f_1==0)
	{
		cost=d.firstcost(t_fuel,t_chemical, time);
		cost_tf.setText(""+cost);
		t_cost=t_cost+cost;
		tc_c_2_tf.setText(""+t_cost);
		f_1=2;
	}else
	{
		cost=d.cost(t_fuel,t_chemical, time);
		cost_tf.setText(""+cost);
		t_cost=t_cost+cost;
		tc_c_2_tf.setText(""+t_cost);
		}
		
		counter++;
	}
		cost_t_s.setText(""+Integer.parseInt(Total_t_1_tf.getText())+Integer.parseInt(Total_t_2_tf.getText()));
		cost_d_s.setText(""+Integer.parseInt(Total_d_1_tf.getText())+Integer.parseInt(Total_d_2_tf.getText()));
		cost_f_s.setText(""+((Integer.parseInt(Total_f_1_tf.getText())+Integer.parseInt(Total_f_2_tf.getText())/60)));
		cost_c_s.setText(""+Integer.parseInt(Total_c_1_tfd.getText())+Integer.parseInt(Total_c_2_tfd.getText()));
}
	else{
		flag=true;
		
		if(counter<15)
		{
		distance=d.computeDistance(apointx[counter], bpointy[counter], apointx[counter+1],bpointy[counter+1]);
		distance=round(distance, 2); 
		
		}
		
		grid_tf.setText("("+apointx[counter]+","+bpointy[counter]+")");
		
		distance_tf.setText(""+distance);
		t_distance+=distance;
		t_distance=round(t_distance, 2); 
		Total_d_1_tf.setText(""+t_distance);
		
		
		
		if(counter==14)
		{
			time=d.computeTimeLast(distance);
			time_tf.setText(""+time+"min");
			t_time=time+t_time;
			Total_t_1_tf.setText(""+t_time);
		}
		else{
		time=d.computeTime(distance,apointx[counter]);
		
	
		time_tf.setText(""+time+"min");
		t_time=time+t_time;
		Total_t_1_tf.setText(""+t_time);
		}
		
		
		fuel=d.computeFuel(time);
		fuel_tf.setText(""+fuel);
		t_fuel=fuel+t_fuel;
		Total_f_1_tf.setText(""+t_fuel);
		
		if(counter<6)
		{
		td_fuel=td_fuel+fuel*5;
		System.out.println("::::$5");
		Total_f_1_tfd.setText(""+td_fuel);
		}
		else if(counter==14)
		{
			td_fuel=td_fuel+fuel*5;
			Total_f_1_tfd.setText(""+td_fuel);
		}
		else{
			td_fuel=td_fuel+fuel*6;
			System.out.println("::$6");
			Total_f_1_tfd.setText(""+td_fuel);
		}
		
		if(apointx[counter+1]==20||apointx[counter+1]==70)
		{
			chemical_tf.setText("");
		}
		else{
			if(counter==13){
				t_chemical=150;
				chemical=25;
				Total_c_1_tf.setText(""+t_chemical);
			}
			else{
			chemical=25;	
		chemical_tf.setText(""+chemical);
		t_chemical=t_chemical+25;
		Total_c_1_tf.setText(""+t_chemical);
		}
		
		}
		if(counter<6)
		{td_chemcial=25*16+td_chemcial;
		System.out.println("::$16");
		Total_c_1_tfd.setText(""+td_chemcial);
		}
		else if(apointx[counter]==20||apointx[counter]==70)
		{
			Total_c_1_tfd.setText(""+td_chemcial);
			System.out.println("::$NONE");;
		}
		else{
			td_chemcial=25*15+td_chemcial;
			System.out.println("::$15");
			Total_c_1_tfd.setText(""+td_chemcial);
		}
		
		
	if(f_1==0)
	{
		cost=d.firstcost(t_fuel,t_chemical, time);
		cost_tf.setText(""+cost);
		t_cost=t_cost+cost;
		tc_c_1_tf.setText(""+t_cost);
		f_1=1;
	}else{
		cost=d.cost(t_fuel,t_chemical, time);
		cost_tf.setText(""+cost);
		t_cost=t_cost+cost;
		tc_c_1_tf.setText(""+t_cost);}
		
		//int distance=d.computeDistance(x1, y1, x2, y2)
		
	counter++;	
	}
	
	}
	
	
}
public  float round(float d, int decimalPlace) {
    BigDecimal bd = new BigDecimal(Float.toString(d));
    bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
    return bd.floatValue();
}

}
