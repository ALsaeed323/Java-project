package javafxapplication1;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class Main extends Application implements EventHandler<ActionEvent>{
	
	Admin admin=new Admin("admin33","abdo","alsaead","admin200","fgk",123);
	AdminProcess adminp =new AdminProcess();
        
	
	
	Trainer trainer;
	TrainerProcess trainerp =new TrainerProcess();
	
	Package packge=new Package();
	Supplement supp =new Supplement();
	
	Trainee trainee;
	Trainees trainees =new Trainees();
	
    String type_of_Login="";

	Label lin;
	
	Stage main ,Login , Sign_up,
	s_admin , s_manage_trainer , s_pac ,s_sup,info_trainer,info_admin; // stage for Main and Login and Sign up ...
	
	// buttons for AdminStage
	 // buttons for AdminStage

	
	
	
	
	
	////  Main Stage 
	Button bAdmin ,bTrainer ,bTrainee ,bTraineel ;// buttons for Main stage ... 
	public void main_Stage()
	{
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setPadding(new Insets(30));
		pane.setVgap(5);
		pane.setHgap(5);
		
		////////
		//////       Main Stage ....   
		///////
		Label l = relabel("Welcome To Mangement Gym",20,pane,0,20,0,20);
		Label l11 = relabel("Sign in",20,pane,15,0,10,110);
		Label l111 = relabel("Sign up",15,pane,10,0,5,110);
		//Label l1 = relabel("Trainer",15,pane,20,0,0,20);
		//Label l13 = relabel("Admin",15,pane,0,0,0,20);
		//Label l2 = relabel("Or",5,pane,15,0,15,115);
		bAdmin = rebutton("Admin",120,120,pane,0,0,0,75);
		bTrainer=rebutton("Trainer",120,120,pane,0,0,0,75);
		bTrainee =rebutton("Trainee",120,120,pane,0,0,0,75);
		bTraineel =rebutton("Trainee",120,120,pane,0,0,0,75);
		
		// action of Button in Main Stage ...
		bAdmin.setOnAction(this);
		bTrainer.setOnAction(this);
		bTraineel.setOnAction(this);
		bTrainee.setOnAction(this);
		
		pane.add(l,0,0);
		pane.add(l11, 0, 1);
		pane.add(bAdmin,0,2);
		pane.add(bTrainer,0,4);
		pane.add(bTraineel,0,5);
		pane.add(l111,0,6);
		pane.add(bTrainee,0,7);
		main=restage("Gym",pane);
	}

	Button bCancel ,bLogin; // buttons for Login  ...
	
	TextField t;
	PasswordField tt;
	////  Login Stage
	public void Login_Stage()
	{
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setPadding(new Insets (10));
		pane.setVgap(5);
		pane.setHgap(5);
		
		lin =relabel("",30,pane,10,50,10,50);
		
		HBox h11 =new HBox();
		h11.setSpacing(30);
		
		Label un =new Label("User Name  ");
		
	    t = new TextField();
	    //t.setMaxWidth(200);
	    //t.setMinWidth(200);
		
		h11.getChildren().addAll(un,t);
		
		HBox h21 =new HBox();
		h11.setSpacing(7);
		
		Label ps =new Label("Password       ");
		
	    tt = new PasswordField();
		
		h21.getChildren().addAll(ps,tt);
		
		HBox h3 =new HBox();
		h3.setSpacing(15);
		
		bLogin = rebutton("Login",54,54,pane,0,0,0,0);
		
		bLogin.setOnAction(this);
		
	    bCancel= rebutton("Cancel",64,64,pane,0,0,0,0);
		bCancel.setOnAction(this);
		h3.getChildren().addAll(bLogin,bCancel);
		
		pane.add(lin, 0, 0);
		pane.add(h11, 0, 1);
		pane.add(h21, 0, 2);
		pane.add(h3, 0, 3);
		
		Login =restage("Login",pane);
	}
	
	
	
	
	
	
	TextField us, tlName ,tfName ,add,ph;
	PasswordField ttp;
	Button bSign_up , bCancel2 ;// buttons for sign up ...
	////  Sign up Stage 
	public void Sign_up_Stage()
	{
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setPadding(new Insets (10));
		pane.setVgap(5);
		pane.setHgap(5);
		
		Label Si =new Label("Sign Up ");
		pane.setMargin(Si, new Insets(10,100,10,100));
		
		HBox hh1 =new HBox();
		hh1.setSpacing(10);
		
		Label fname =new Label("first name ");
		
	     tfName = new TextField();
		
		hh1.getChildren().addAll(fname,tfName);
		
		
		HBox hh2 =new HBox();
		hh2.setSpacing(10);
		
		Label lname =new Label("last name ");
		
	    tlName= new TextField();
		
		hh2.getChildren().addAll(lname,tlName);
		
		
		
		Label u =new Label("user name ");
		
		Label ph1 =new Label("phone ");
		Label add1 =new Label("address ");
		us= new TextField();
		
		
		HBox g =new HBox();
		  g.setSpacing(10);
		  g.getChildren().addAll(u,us);
		
		
		
		
		ph= new TextField();
		add = new TextField();
		 HBox hh7 =new HBox();
		hh7.setSpacing(10);
		hh7.getChildren().addAll(ph1,ph);
		
		
		 HBox hh8 =new HBox();
	   hh8.setSpacing(10);
	   hh8.getChildren().addAll(add1,add);	
			
			
		
		
		
		HBox hh4 =new HBox();
		
		
		Label pss =new Label("Password     ");
		
		 ttp = new PasswordField();
		
		hh4.getChildren().addAll(pss,ttp);
		
		
		
		HBox hh6 =new HBox();
		hh6.setSpacing(15);
		
	    bSign_up= new Button("Sign up");
		bSign_up.setMinWidth(74);
		bSign_up.setMaxWidth(74);
		
		bCancel2= new Button("Cancel");
		bCancel2.setMinWidth(64);
		bCancel2.setMaxWidth(64);
		
		hh6.getChildren().addAll(bSign_up,bCancel2);
		
		pane.add(Si, 0, 0);
		pane.add(hh1, 0, 1);
		pane.add(hh2, 0, 2);
		pane.add(g, 0, 3);
		pane.add(hh4, 0, 4);
		pane.add(hh7, 0, 5);
		pane.add(hh8, 0, 6);
		pane.add(hh6, 0, 7);
		
		bCancel2.setOnAction(this);
		bSign_up.setOnAction(this);
		Sign_up = restage("Sign up",pane);
	}
	
	
	
	Button pac ,sup , dis, b_mange_trainer ,exist,dis_inf_trainee;
	TextArea dis_ta_trainee;
	public void Admin()
	{
		GridPane pane =new GridPane();
		
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setPadding(new Insets (10));
		pane.setVgap(5);
		pane.setHgap(5);
		dis = rebutton("Display inf",64,64,pane,0,0,0,0);
		sup = rebutton("supplementaary",64,64,pane,0,0,0,0);
		pac = rebutton("packge",64,64,pane,0,0,0,0);
		b_mange_trainer= rebutton("Mange Trainer",64,64,pane,0,0,0,0);
		
		b_mange_trainer.setOnAction(this);
		pac.setOnAction(this);
		sup.setOnAction(this);
		
		pane.add(b_mange_trainer, 0, 0);
		pane.add(pac, 1, 0);
		pane.add(sup, 2, 0);
		pane.add(dis, 3, 0);
		
		GridPane pane1 =new GridPane();
		pane1.setAlignment(Pos.TOP_CENTER);
		pane1.setPadding(new Insets (50,10,10,10));
		pane1.setVgap(5);                           // dis_ta_trainee,dis_inf_trainee,exist
		pane1.setHgap(5);
		
		dis_ta_trainee =new TextArea();
		
		
		dis_inf_trainee =rebutton("Dispaly All Trainee",120,120,pane1,0,0,0,75);
		exist =rebutton("Exist",120,120,pane1,0,0,0,75);
		pane1.add(dis_inf_trainee, 0, 0);
		pane1.add(dis_ta_trainee, 1, 0);
		pane1.add(exist, 1, 1);
		GridPane pane2 =new GridPane();
		pane2.add(pane, 0, 0);
		pane2.add(pane1, 0, 1);
		
		
		s_admin=new Stage();
		s_admin.setTitle("admin");
		Scene scene =new Scene(pane2);
		s_admin.setScene(scene);
		
		exist.setOnAction(this);
		dis_inf_trainee.setOnAction(this);
	}
	
	
	
	
	
	TextField user_Trainer, tlName_Trainer ,tfName_Trainer,phone,address,delete;
	PasswordField ttp_Trainer;
	TextArea dis_ta_trainer;
	// buttons for Login and sign in stage ...
	Button add_Trainer,delet_Trainer ,dis_inf_Trainers,back_Trainer_manage;
	public void Manage_Trainer()
	{
		GridPane pane =new GridPane();
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setPadding(new Insets (10));
		pane.setVgap(5);
		pane.setHgap(5);
		
		
		
		phone =new TextField();
		address =new TextField();
	
		
		
		
		Label pho =new Label("Phone    ");
		Label addr  =new Label("Address    "); 
		
		
		delet_Trainer=rebutton("Delete",120,120,pane,0,0,0,75);
		add_Trainer =rebutton("ADD",120,120,pane,0,0,0,200);
		delete=new TextField();
		
		HBox hh1 =new HBox();
		HBox hh2 =new HBox();
		HBox hh3 =new HBox();
		HBox hh4 =new HBox();
		HBox hh5 =new HBox();
		HBox hh6 =new HBox();
		HBox hh7 =new HBox();
		HBox hh8 =new HBox();
		hh1.setSpacing(10);
		
		
		Label fname =new Label("first name ");
		
	     tfName_Trainer = new TextField();
		
		hh1.getChildren().addAll(fname,tfName_Trainer);
		
		
		
		hh2.setSpacing(10);
		
		Label lname =new Label("last name ");
		
	    tlName_Trainer= new TextField();
		
		hh2.getChildren().addAll(lname,tlName_Trainer);
		
		hh3.setSpacing(10);
		
		Label us1 =new Label("user name ");
		
		 user_Trainer = new TextField();
		
		hh3.getChildren().addAll(us1,user_Trainer);
		
		
		
		Label pss =new Label("Password     ");
		
		 ttp_Trainer = new PasswordField();
		
		hh4.getChildren().addAll(pss,ttp_Trainer);
		
		hh6.setSpacing(15);
		
		
		hh5.getChildren().addAll(pho,phone);
		hh7.getChildren().addAll(addr,address);
		Label ll1=new Label("Add Or Delete Trainer");
		pane.setMargin(ll1, new Insets(10,100,10,100));
		Label ll2 =new Label("User name ");
		hh8.setSpacing(22);
		hh8.getChildren().addAll(ll2,delete,delet_Trainer);
		
		
		
		pane.add(ll1, 0, 0);
		pane.add(hh1, 0, 1);
		pane.add(hh2, 1, 1);
		pane.add(hh3, 0, 2);
		pane.add(hh4, 1, 2);
		pane.add(hh5, 0, 3);
		pane.add(hh7, 1, 3);
		pane.add(add_Trainer, 1, 4);
		//pane5.getChildren().add(hh8);
		
		pane.add(hh8, 0, 5);
		
		
		
		GridPane pane1 =new GridPane();
		pane1.setAlignment(Pos.TOP_CENTER);
		pane1.setPadding(new Insets (50,10,10,10));
		pane1.setVgap(5);
		pane1.setHgap(5);
		
		dis_ta_trainer =new TextArea();
		
		
		dis_inf_Trainers =rebutton("Dispaly Ifo",120,120,pane1,0,0,0,75);
		back_Trainer_manage =rebutton("Back",120,120,pane1,0,0,0,75);
		pane1.add(dis_inf_Trainers, 0, 0);
		pane1.add(dis_ta_trainer, 1, 0);
		pane1.add(back_Trainer_manage, 1, 1);
		GridPane pane2 =new GridPane();
		pane2.add(pane, 0, 0);
		pane2.add(pane1, 0, 1);
		//pane5.add(delet_Trainer, 1, 5);
		add_Trainer.setOnAction(this);
		dis_inf_Trainers.setOnAction(this);
		//pane5.add(hh6, 0, 5);
		s_manage_trainer= restage("Manager Trainer",pane2);
		
		back_Trainer_manage.setOnAction(this);
		delet_Trainer.setOnAction(this);
		
	}
	
	
	
	TextField t_id_add_pac ,t_dis_add_pac ,t_cost_add_pac ,t_re_add_pac ,
	     t_id_up_pac ,t_dis_up_pac ,
	     t_id1_up_pac ,t_cost_up_pac,
	     t_id2_up_pac,t_re_up_pac,
	     t_id_delete_pac;
	Button  add_pac ,update_dis_pac, update_cost_pac , update_re_pac , delete_pac,
	   dis_inf_pac,back_pac_manage;
	TextArea dis_ta_pac;
	public void Manage_pac()
	{
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.TOP_CENTER);
		pane.setPadding(new Insets(30));
		pane.setVgap(15);
		pane.setHgap(5);
		Label id =relabel("ID",15,pane,0,0,0,0);
		Label id1 =relabel("ID",15,pane,0,0,0,0);
		Label id2 =relabel("ID",15,pane,0,0,0,0);
		Label id3 =relabel("ID",15,pane,0,0,0,0);
		Label id4 =relabel("ID",15,pane,0,0,0,0);
		
		Label dis =relabel("  Discription",15,pane,0,0,0,0);
		Label dis1 =relabel("  Discription",15,pane,0,0,0,0);
		
		Label cost =relabel("   Cost",15,pane,0,0,0,0);
		Label cost1 =relabel("   cost",15,pane,0,0,0,0);
		
		Label re =relabel("  recommmm",15,pane,0,0,0,0);
		Label re1 =relabel("  recommmm",15,pane,0,0,0,0);
		
		t_id_add_pac = new TextField();
		t_dis_add_pac = new TextField();
		t_cost_add_pac = new TextField();
		t_re_add_pac = new TextField();
	
		t_id_up_pac =new TextField();
		t_dis_up_pac =new TextField();
		t_cost_up_pac =new TextField();
		t_re_up_pac =new TextField();
		
		t_id1_up_pac=new TextField();
		t_id2_up_pac=new TextField();
		t_id_delete_pac=new TextField();
		
		
		add_pac = rebutton("Add PAc",30,30,pane,0,0,0,0);
		update_dis_pac = rebutton("update Discription",30,30,pane,0,0,0,0);
		update_cost_pac = rebutton("update Cost",30,30,pane,0,0,0,0);
		update_re_pac = rebutton("update recommmmmm",30,30,pane,0,0,0,0);
		delete_pac = rebutton("Delete",30,30,pane,0,0,0,0);
	
		
		add_pac.setOnAction(this);

		
		pane.add(id, 0, 0);
		pane.add(t_id_add_pac, 1, 0);
		pane.add(dis, 2, 0);
		pane.add(t_dis_add_pac, 3, 0);
		pane.add(cost, 4, 0);
		pane.add(t_cost_add_pac, 5, 0);
		pane.add(re, 6, 0);
		pane.add(t_re_add_pac, 7, 0);
		pane.add(add_pac, 8, 0);
		
		pane.add(id1, 0, 1);
		pane.add(t_id_up_pac, 1, 1);
		pane.add(dis1, 2, 1);
		pane.add(t_dis_up_pac, 3, 1);
		pane.add(update_dis_pac, 4, 1);
		update_dis_pac.setOnAction(this);
		pane.add(id2, 0, 2);
		pane.add(t_id1_up_pac, 1, 2);
		pane.add(cost1, 2, 2);
		pane.add(t_cost_up_pac, 3, 2);
		pane.add(update_cost_pac, 4, 2);
		update_cost_pac.setOnAction(this);
		pane.add(id3, 0, 3);
		pane.add(t_id2_up_pac, 1, 3);
		pane.add(re1, 2, 3);
		pane.add(t_re_up_pac, 3, 3);
		pane.add(update_re_pac, 4, 3);
		update_re_pac.setOnAction(this);
		pane.add(id4, 0, 4);
		pane.add(t_id_delete_pac, 1, 4);
		pane.add(delete_pac, 2, 4);
		//pane.add(vbox, 0, 5);
		delete_pac.setOnAction(this);
		
		
		
		GridPane pane1 =new GridPane();
		pane1.setAlignment(Pos.TOP_CENTER);
		pane1.setPadding(new Insets (50,10,10,10));
		pane1.setVgap(5);                           // dis_ta_packge,dis_inf_packge,back_packge_manage
		pane1.setHgap(5);
		
		dis_ta_pac =new TextArea();
		
		
		dis_inf_pac =rebutton("Dispaly Ifo",120,120,pane1,0,0,0,75);
		back_pac_manage =rebutton("Back",120,120,pane1,0,0,0,75);
		pane1.add(dis_inf_pac, 0, 0);
		pane1.add(dis_ta_pac, 1, 0);
		pane1.add(back_pac_manage, 1, 1);
		GridPane pane2 =new GridPane();
		pane2.add(pane, 0, 0);
		pane2.add(pane1, 0, 1);
		
		dis_inf_pac.setOnAction(this);
		
		
		s_pac =new Stage();
		s_pac.setTitle("Manage Package");
		Scene scene =new Scene(pane2);
		s_pac.setScene(scene);
		s_pac.setFullScreen(false);
		
		/*
		 * ScrollPane scrollPane = new ScrollPane();
		 * 
		 * scrollPane.setContent(p); scrollPane.fitToWidthProperty().set(true);
		 * scrollPane.fitToHeightProperty().set(true);
		 * scrollPane.hbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);
		 * scrollPane.vbarPolicyProperty().setValue(ScrollPane.ScrollBarPolicy.NEVER);
		 */
		back_pac_manage.setOnAction(this);
	}
	
	
	
	
	////   manage supplementary 
	TextField t_id_add_sup ,t_dis_add_sup ,t_cost_add_sup ,t_re_add_sup ,
    t_id_up_sup ,t_dis_up_sup ,
    t_id1_up_sup ,t_cost_up_sup,
    t_id2_up_sup,t_re_up_sup,
    t_id_delete_sup;
     Button  add_sup ,update_dis_sup, update_cost_sup , update_re_sup , delete_sup,
          dis_inf_sup,back_sup_manage;
    TextArea  dis_ta_sup;
public void Manage_sup()
{
	GridPane pane = new GridPane();
	pane.setAlignment(Pos.TOP_CENTER);
	pane.setPadding(new Insets(30));
	pane.setVgap(15);
	pane.setHgap(5);
	Label id =relabel("ID",15,pane,0,0,0,0);
	Label id1 =relabel("ID",15,pane,0,0,0,0);
	Label id2 =relabel("ID",15,pane,0,0,0,0);
	Label id3 =relabel("ID",15,pane,0,0,0,0);
	Label id4 =relabel("ID",15,pane,0,0,0,0);
	
	Label dis =relabel("  Discription",15,pane,0,0,0,0);
	Label dis1 =relabel("  Discription",15,pane,0,0,0,0);
	
	Label cost =relabel("   Cost",15,pane,0,0,0,0);
	Label cost1 =relabel("   cost",15,pane,0,0,0,0);
	
	Label re =relabel("  recommmm",15,pane,0,0,0,0);
	Label re1 =relabel("  recommmm",15,pane,0,0,0,0);
	
	t_id_add_sup = new TextField();
	t_dis_add_sup = new TextField();
	t_cost_add_sup = new TextField();
	t_re_add_sup = new TextField();

	t_id_up_sup =new TextField();
	t_dis_up_sup =new TextField();
	t_cost_up_sup =new TextField();
	t_re_up_sup =new TextField();
	
	t_id1_up_sup=new TextField();
	t_id2_up_sup=new TextField();
	t_id_delete_sup=new TextField();
	
	
	add_sup = rebutton("Add PAc",30,30,pane,0,0,0,0);
	update_dis_sup = rebutton("update Discription",30,30,pane,0,0,0,0);
	update_cost_sup = rebutton("update Cost",30,30,pane,0,0,0,0);
	update_re_sup = rebutton("update recommmmmm",30,30,pane,0,0,0,0);
	delete_sup = rebutton("Delete",30,30,pane,0,0,0,0);

	
	add_sup.setOnAction(this);
	update_dis_sup.setOnAction(this);
	update_cost_sup.setOnAction(this);
	update_re_sup.setOnAction(this);
	delete_sup.setOnAction(this);

	
	pane.add(id, 0, 0);
	pane.add(t_id_add_sup, 1, 0);
	pane.add(dis, 2, 0);
	pane.add(t_dis_add_sup, 3, 0);
	pane.add(cost, 4, 0);
	pane.add(t_cost_add_sup, 5, 0);
	pane.add(re, 6, 0);
	pane.add(t_re_add_sup, 7, 0);
	pane.add(add_sup, 8, 0);
	
	pane.add(id1, 0, 1);
	pane.add(t_id_up_sup, 1, 1);
	pane.add(dis1, 2, 1);
	pane.add(t_dis_up_sup, 3, 1);
	pane.add(update_dis_sup, 4, 1);
	
	pane.add(id2, 0, 2);
	pane.add(t_id1_up_sup, 1, 2);
	pane.add(cost1, 2, 2);
	pane.add(t_cost_up_sup, 3, 2);
	pane.add(update_cost_sup, 4, 2);
	
	pane.add(id3, 0, 3);
	pane.add(t_id2_up_sup, 1, 3);
	pane.add(re1, 2, 3);
	pane.add(t_re_up_sup, 3, 3);
	pane.add(update_re_sup, 4, 3);
	
	pane.add(id4, 0, 4);
	pane.add(t_id_delete_sup, 1, 4);
	pane.add(delete_sup, 2, 4);
	//pane.add(vbox, 0, 5);
	
	
	
	GridPane pane1 =new GridPane();
	pane1.setAlignment(Pos.TOP_CENTER);
	pane1.setPadding(new Insets (50,10,10,10));
	pane1.setVgap(5);                           // dis_ta_packge,dis_inf_packge,back_packge_manage
	pane1.setHgap(5);
	
	dis_ta_sup =new TextArea();
	
	
	dis_inf_sup =rebutton("Dispaly Ifo",120,120,pane1,0,0,0,75);
	back_sup_manage =rebutton("Back",120,120,pane1,0,0,0,75);
	pane1.add(dis_inf_sup, 0, 0);
	pane1.add(dis_ta_sup, 1, 0);
	pane1.add(back_sup_manage, 1, 1);
	GridPane pane2 =new GridPane();
	pane2.add(pane, 0, 0);
	pane2.add(pane1, 0, 1);
	
	dis_inf_sup.setOnAction(this);
	back_sup_manage.setOnAction(this);
	
	s_sup =new Stage();
	s_sup.setTitle("Manage supplymentary");
	Scene scene =new Scene(pane2);
	s_sup.setScene(scene);
	
}
	
	
	


public void trainreeStage(){
	GridPane pane =new GridPane();
	
	pane.setAlignment(Pos.TOP_CENTER);
	pane.setPadding(new Insets (10));
	pane.setVgap(5);
	pane.setHgap(5);
	dis = rebutton("Display inf",64,64,pane,0,0,0,0);
	sup = rebutton("supplementaary",64,64,pane,0,0,0,0);
	pac = rebutton("packge",64,64,pane,0,0,0,0);
	b_mange_trainer= rebutton("Mange",64,64,pane,0,0,0,0);
	
	b_mange_trainer.setOnAction(this);
	pac.setOnAction(this);
	sup.setOnAction(this);
	
	pane.add(b_mange_trainer, 0, 0);
	pane.add(pac, 1, 0);
	pane.add(sup, 2, 0);
	pane.add(dis, 3, 0);
	
	s_admin=restage("Admin",pane);
}

	
	@Override
	public void start(Stage primaryStage) throws IOException {
		try {
                    trainees.readFromFile();
		adminp.readFromFile_Admin();
		trainerp.readFromFile_Trainer();
                //System.out.print("dfghj");
		
                // System.out.print("tt");
		supp.readFromFile_supp();
                 packge.readFromFile_pack();
		//adminp.addAdmin(admin);
		
		}catch(NullPointerException e)
		{
			System.out.print("qqqq");
		}
	    // adminp.addAdmin(admin);
		try {
			main_Stage();
			Login_Stage();
			Sign_up_Stage();
			Admin();
			Manage_Trainer();
			Manage_pac();
			Manage_sup();
			main.show();
                        fName();
		      lName();
		      Adress();
		      Phone();
		      pass ();
		      displayinfo();
		        HBox root = new HBox(20);
		        root.getChildren().addAll(btn, btn2, btn3, btn4, btn5,btn6);

		        Scene scene = new Scene(root, 900, 300);
		        
		        info_trainer =new Stage();
		        info_trainer.setTitle("update trainer profile");
		        info_trainer.setScene(scene);
		        
		
		        fName1();
		        lName1();
		        Adress1();
		        Phone1();
		        pass1();
		        displayinfo1();
		          HBox root1 = new HBox(20);
		          root1.getChildren().addAll(btn1, btn21, btn31, btn41, btn51,btn61); 
		          
		          
		          Scene scene1 = new Scene(root1, 900, 300);
			        
			        info_admin =new Stage();
			        info_admin.setTitle("update Admin profile");
			        info_admin.setScene(scene1);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//// create Stage 
	Stage restage(String s,GridPane pane)
	{
		Stage stage = new Stage();
		stage.setTitle(s);
		Scene scene =new Scene(pane);
		stage.setScene(scene);
		return stage;
	}
	
	//// create Button 
	Button rebutton (String s ,int max ,int min ,GridPane pane,
			int t,int l,int b,int r)
	{
		Button button =new Button(s);
		pane.setMargin (button,new Insets(t,l,b,r));
		//Font font1=Font.font("Arial",20);
		//button.setFont(font1);
		button.setMinWidth(120);
		button.setMaxWidth(120);
		
		return button;
	}
	
	//// create Label
	Label relabel(String s,int num ,GridPane pane ,int t,int l,int b,int r)
	{
		Label label =new Label(s);
		Font font=Font.font("Arial",num);
		label.setFont(font);
		pane.setMargin (label,new Insets(t,l,b,r));
		return label;
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	//// Button Action 
	@Override
	//
	// Buttons Action 
	//
	public void handle(ActionEvent e) {
		
		// to appear login admin
		// and close interface
		if(e.getSource()==bAdmin)
		{
			type_of_Login="Admin";
			lin.setText("Sign In Admin");
			Login.show();
			main.close();
		}
		
                else if(e.getSource()==dis)
		{
			info_admin.show();
		}
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//////
		else if(e.getSource()==back_sup_manage)
		{
			s_sup.close();
			s_admin.show();
		}
		else if(e.getSource()==back_pac_manage)
		{
			s_pac.close();
			s_admin.show();
		}
		else if(e.getSource()==back_Trainer_manage)
		{
			s_manage_trainer.close();
			s_admin.show();
		}
		/////
		////
		///
		////
		///
		else if(e.getSource()==exist)
		{
			s_admin.close();
			main.show();
		}
		else if (e.getSource()== add_sup)
		{ 
			boolean id= true,cost = true;
			int xid=0,xcost=0 ;
			try {
			xid =Integer.parseInt(t_id_add_sup.getText());  
			System.out.println( xid);
	        }
	        catch (NumberFormatException ex){
	        	System.out.println(ex);	            id=false;
	        }catch(Exception e1)
			{
	        	 id=false;
			}
			try {
				xcost =Integer.parseInt(t_cost_add_sup.getText());  
				System.out.println( xcost);
		        }
		        catch (NumberFormatException ex){
		        	System.out.println(ex);
		            cost=false;
		        }catch(Exception e1)
				{
		        	cost=false;
				}
			if(id==false&&cost == false)
			{
				Alert al =new Alert(AlertType.ERROR);
				al.setTitle("error404");
				al.setHeaderText(null);
				al.setContentText("id and cost must be integer only");
				al.showAndWait();
			}
			else if(id==false)
			{
				Alert al =new Alert(AlertType.ERROR);
				al.setTitle("error404");
				al.setHeaderText(null);
				al.setContentText("id must be integer only");
				al.showAndWait();
				
			}
			else if(cost == false)
			{
				Alert al =new Alert(AlertType.ERROR);
				al.setTitle("error404");
				al.setHeaderText(null);
				al.setContentText("cost must be integer only");
				al.showAndWait();
				
			}
			else
			{
				int x=0;
				supp= new Supplement(xid ,
						t_dis_add_sup.getText() ,
						xcost ,
						t_re_add_sup.getText() );
				try {
					x= adminp.add_supp(supp);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(x==1)
				{
					//"package alredy exists"
					Alert al =new Alert(AlertType.INFORMATION);
					al.setTitle("Success");
					al.setHeaderText(null);
					al.setContentText("add supplement Successfuly");
					al.showAndWait();
				}else if(x==2)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("supplement alredy exists\n add new");
					al.showAndWait();
				}
			}
			
			
			
		}
		else if(e.getSource()==dis_inf_sup)
		{
		
		   String x = adminp.display_allsupp().toString();
		   if(x.equals(""))
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("no data show");
				al.showAndWait();
			}
			else
			{
				dis_ta_sup.setText(x);
			}
		}
		//
		//update discreption package
		//
		//
		else if(e.getSource()==update_dis_sup)
		{
			System.out.println("hello");
			boolean id= true;
			int xid=0;
			try {
			xid =Integer.parseInt(t_id_up_sup.getText());  
			System.out.println( xid);
	        }
	        catch (NumberFormatException ex){
	        	System.out.println(ex);
	            id=false;
	        }catch(Exception e1)
			{
	        	 id=false;
			}
			 if(id==false)
			{
				Alert al =new Alert(AlertType.ERROR);
				al.setTitle("error404");
				al.setHeaderText(null);
				al.setContentText("id must be integer only");
				al.showAndWait();
			}
			 else {
				int x=0;
				
				try {
					x= adminp.update_suppdisc(supp, xid,t_dis_up_sup.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(x==1)
				{
					//"package alredy exists"
					Alert al =new Alert(AlertType.INFORMATION);
					al.setTitle("Success");
					al.setHeaderText(null);
					al.setContentText("update discreption Successfuly");
					al.showAndWait();
				}else if(x==2)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("id is not exist");
					al.showAndWait();
				}
				}
			
			 
			}
		//  t_id1_up_pac ,t_cost_up_pac,
		 else if(e.getSource()==update_cost_sup)
		 {
			 boolean id= true,cost = true;
				int xid=0,xcost=0 ;
				try {
				xid =Integer.parseInt(t_id1_up_sup.getText());  
				System.out.println( xid);
		        }
		        catch (NumberFormatException ex){
		        	System.out.println(ex);
		            id=false;
		        }catch(Exception e1)
				{
		        	 id=false;
				}
				try {
					xcost =Integer.parseInt(t_cost_up_sup.getText());  
					System.out.println( xcost);
			        }
			        catch (NumberFormatException ex){
			        	System.out.println(ex);
			            cost=false;
			        }catch(Exception e1)
					{
			        	cost=false;
					}
				if(id==false&&cost == false)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("id and cost must be integer only");
					al.showAndWait();
				}
				else if(id==false)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("id must be integer only");
					al.showAndWait();
					
				}
				else if(cost == false)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("cost must be integer only");
					al.showAndWait();
					
				}
				else
				{
					int x=0;
					try {
						x= adminp.update_suppcost(supp, xid, xcost);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(x==1)
					{
						//"package alredy exists"
						Alert al =new Alert(AlertType.INFORMATION);
						al.setTitle("Success");
						al.setHeaderText(null);
						al.setContentText("update cost Successfuly");
						al.showAndWait();
					}else if(x==2)
					{
						Alert al =new Alert(AlertType.ERROR);
						al.setTitle("error404");
						al.setHeaderText(null);
						al.setContentText("id not exsit ");
						al.showAndWait();
					}
				}
		 }
		//
		 else if(e.getSource()==update_re_sup)
		 {
			 System.out.println("hello");
				boolean id= true;
				int xid=0;
				try {
				xid =Integer.parseInt(t_id2_up_sup.getText());  
				System.out.println( xid);
		        }
		        catch (NumberFormatException ex){
		        	System.out.println(ex);
		            id=false;
		        }catch(Exception e1)
				{
		        	 id=false;
				}
				 if(id==false)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("id must be integer only");
					al.showAndWait();
				}
				 else {
					int x=0;
					
					try {
						x= adminp.update_suppRecomm(supp, xid,t_re_up_sup.getText());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(x==1)
					{
						//"package alredy exists"
						Alert al =new Alert(AlertType.INFORMATION);
						al.setTitle("Success");
						al.setHeaderText(null);
						al.setContentText("update recomandation Successfuly");
						al.showAndWait();
					}else if(x==2)
					{
						Alert al =new Alert(AlertType.ERROR);
						al.setTitle("error404");
						al.setHeaderText(null);
						al.setContentText("id is not exist");
						al.showAndWait();
					}
					}	 
		 }else if(e.getSource()==delete_sup)
		 {
			 System.out.println("hello");
				boolean id= true;
				int xid=0;
				try {
				xid =Integer.parseInt(t_id_delete_sup.getText());  
				System.out.println( xid);
		        }
		        catch (NumberFormatException ex){
		        	System.out.println(ex);
		            id=false;
		        }catch(Exception e1)
				{
		        	 id=false;
				}
				 if(id==false)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("id must be integer only");
					al.showAndWait();
				}else 
				{
					int x=0;
					
					try {
						x= adminp.delete_supp(supp, xid);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(x==1)
					{
						//"package alredy exists"
						Alert al =new Alert(AlertType.INFORMATION);
						al.setTitle("Success");
						al.setHeaderText(null);
						al.setContentText("the supplement is deleted ");
						al.showAndWait();
					}else if(x==2)
					{
						Alert al =new Alert(AlertType.ERROR);
						al.setTitle("error404");
						al.setHeaderText(null);
						al.setContentText("id is not exist");
						al.showAndWait();
					}
					}
		 }
		
		
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		//
		
		// to appear login Trainer
	    // and close interface
		else if (e.getSource()==bTrainer)
		{
			type_of_Login= "Trainer";
			lin.setText("Sign In Trainer");
			main.close();
			Login.show();
			
		}
		// to appear login Trainee
	    // and close interface
		else if (e.getSource()==bTraineel)
		{
			type_of_Login="Trainee";
			lin.setText("Sign In Trainee");
			main.close();
			Login.show();
			
		}
		// button login ,  check if user name and password is correct
		// then transaction from stage login
		// to stage ( admin || Trainer|| Trainee)
		else if (e.getSource()==bLogin)
		{
			
			if(type_of_Login.equals("Admin"))
			{
				
				
                            
                           int x = adminp.LogIn(t.getText(),tt.getText());
                            //System.out.println(x);
                            switch (x) {
                                case 1:
                                    {
                                        Alert al =new Alert(AlertType.INFORMATION);
                                        al.setTitle("Success");
                                        al.setHeaderText(null);
                                        al.setContentText("welcome");
                                        al.showAndWait();
                                        Login.close();
                                        s_admin.show();
                                        break;
                                    }
                                case 2:
                                    {
                                        Alert al =new Alert(AlertType.ERROR);
                                        al.setTitle("error404");
                                        al.setHeaderText(null);
                                        al.setContentText("Password Incorrect");
                                        al.showAndWait();
                                        tt.setText("");
                                        break;
                                    }
                                case 3:
                                    {
                                        Alert al =new Alert(AlertType.ERROR);
                                        al.setTitle("error405");
                                        al.setHeaderText(null);
                                        al.setContentText("UserName Incorrect");
                                        al.showAndWait();
                                        t.setText("");
                                        tt.setText("");
                                        break;
                                    }
                                default:
                                    break;
                            }
			}
			else if(type_of_Login.equals("Trainer"))
			{
				System.out.println("er");
				int x = trainerp.LogIn(t.getText(), 	tt.getText());
				if(x==1)
				{
					Alert al =new Alert(AlertType.INFORMATION);
					al.setTitle("Success");
					al.setHeaderText(null);
					al.setContentText("login success");
					al.showAndWait();
                                        info_trainer.show();
					//Login.close();
					//s_admin.show();
				}
				else if(x==2)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("Password Incorrect");
					al.showAndWait();
					tt.setText("");
				}
				else if(x==3)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error405");
					al.setHeaderText(null);
					al.setContentText("UserName Incorrect");
					al.showAndWait();
					t.setText("");
					tt.setText("");
				}
				
			}
			else if(type_of_Login.equals("Trainee"))
			{
				System.out.println("ee");
			}
		}
		// to close the stage of login 
		// and display the main stage 
		else if (e.getSource()==bCancel)
		{
			System.out.println("hello Cancel");
			Login.close();
			main.show();
			t.setText("");
			tt.setText("");
		}
		// to appear Sign up Trainee
	    // and close interface
		else if (e.getSource()==bTrainee)
		{
			main.close();
			Sign_up.show();
		}
		else if (e.getSource()==bCancel)
		{
			System.out.println("hello Cancel");
			Login.close();
			main.show();
			t.setText("");
			tt.setText("");
		}
		
		
//		TextField us, tlName ,tfName ,add,ph;
//		PasswordField ttp;
//		Button bSign_up ,
		else if (e.getSource()==bSign_up)
		{   int k=0;
			boolean id= true;
			int xid=0;
			try {
			xid =Integer.parseInt(ph.getText());  
			System.out.println( xid);
	        }
	        catch (NumberFormatException ex){
	           System.out.println(ex);
	            id=false;
	        }catch(Exception ex)
			{
	        	System.out.println(ex);
	        	 id=false;
			}
			
			if(us.getText().equals(""))
			{
				k++;
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("user name invalid");
				al.showAndWait();
				
			}
			else if(tfName.getText().equals(""))
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("first name invalid");
				al.showAndWait();
				k++;
			}
			else if(tlName.getText().equals(""))
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("last name invalid");
				al.showAndWait();
				k++;
			}
			else if(ttp.getText().equals(""))
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("password invalid");
				al.showAndWait();
				k++;
			}
			else if(add.getText().equals(""))
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("address invalid");
				al.showAndWait();
				k++;
			}
			else if(ph.getText().equals("")||phone.getText().length()!=11||id==false)
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				
				
				if(ph.getText().equals(""))
				{
					al.setContentText("pho invalid");
				al.showAndWait();k++;
				}
				else if (ph.getText().length()!=11)
				{
					al.setContentText("number mustbe 11 integer");
					al.showAndWait();
					ph.setText("");k++;
				}else if(id==false)
				{
					al.setContentText("phone must be integer only ");
					al.showAndWait();
					ph.setText("");k++;
				}
				else 
				{
					System.out.println( "asdasdasdasdasdasdasdas");
					System.out.println(k);
					trainee =new Trainee(us.getText(), tfName.getText(),
							  tlName.getText(), xid,
							 add.getText(),ttp.getText());
							int x =0;
							try {
								x=trainees.addTrainee(trainee);
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						if (x==2)
							{
							System.out.println( 852);
								Alert all =new Alert(AlertType.ERROR);
								all.setTitle("error405");
							    all.setHeaderText(null);
						        all.setContentText("user name already exist\n\ntry enter new user name");			
						        all.showAndWait();
								us.setText("");
							}
						else if(x==1)
							{
							System.out.println( "zdcd");

								Alert all =new Alert(AlertType.CONFIRMATION);
								all.setTitle("success");
								all.setHeaderText(null);
								all.setContentText("add success");
								all.showAndWait();
								us.setText(""); tfName.setText("");
								  tlName.setText(""); ttp.setText("");
								 add.setText("");ph.setText("");
							
						}
				}
				
			}
			
			
			
		}
		else if (e.getSource()==bCancel2)
		{
			System.out.println("hello Trainer");
			Sign_up.close();
			main.show();
			tfName.setText("");
			tlName.setText("");
			ttp.setText("");
			//user.setText("");
		}
		
		//  stage for management trainer in admin stage
		else if (e.getSource()==b_mange_trainer)
		{
			s_admin.close();
			s_manage_trainer.showAndWait();
		}
		else if (e.getSource()==pac)
		{
			s_admin.close();
			s_pac.showAndWait();
		}
		else if (e.getSource()==sup)
		{
			s_admin.close();
			s_sup.showAndWait();
		}
		
//		TextField user_Trainer, tlName_Trainer ,tfName_Trainer;
//		PasswordField ttp_Trainer;
//		TextArea dis_ta_trainer;
//		// buttons for Login and sign in stage ...
//		Button add_Trainer,delet_Trainer ,dis_inf_Trainers,back_Trainer_manage;
		//phone,address ,delete;int x=0;
		else if(e.getSource()==add_Trainer)
		{	
			
			boolean id= true;
			int xid=0;
			try {
			xid =Integer.parseInt(phone.getText());  
			System.out.println( xid);
	        }
	        catch (NumberFormatException ex){
	           System.out.println(ex);
	            id=false;
	        }catch(Exception ex)
			{
	        	System.out.println(ex);
	        	 id=false;
			}
			int y=0;
			if(user_Trainer.getText().equals(""))
			{
				y++;
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("user name invalid");
				al.showAndWait();
				
			}
			else if(tfName_Trainer.getText().equals(""))
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("first name invalid");
				al.showAndWait();
				y++;
			}
			else if(tlName_Trainer.getText().equals(""))
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("last name invalid");
				al.showAndWait();
				y++;
			}
			else if(ttp_Trainer.getText().equals(""))
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("password invalid");
				al.showAndWait();
				y++;
			}
			else if(address.getText().equals(""))
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("address invalid");
				al.showAndWait();
				y++;
			}
			else if(phone.getText().equals("")||phone.getText().length()!=11||id==false)
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				if(phone.getText().equals(""))
				{
					al.setContentText("pho invalid");
				al.showAndWait();
				}
				else if (phone.getText().length()!=11)
				{
					al.setContentText("number mustbe 11 integer");
					al.showAndWait();
					phone.setText("");
				}else if(id==false)
				{
					al.setContentText("phone must be integer only ");
					al.showAndWait();
					phone.setText("");
				}
				y++;
			}
			else if(y==0)
			{
				System.out.println(y);
				trainer =new Trainer(user_Trainer.getText(), tfName_Trainer.getText(),
						  tlName_Trainer.getText(), ttp_Trainer.getText().toString(),
						 address.getText(),xid);
						int x =0;
						try {
							x=adminp.addTrainer(trainer,trainerp );
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					if (x==2)
						{
						
							Alert al =new Alert(AlertType.ERROR);
							al.setTitle("error405");
						    al.setHeaderText(null);
					        al.setContentText("user name already exist\n\ntry enter new user name");			
					        al.showAndWait();
							user_Trainer.setText("");
						}
					else if(x==1)
						{

							Alert al =new Alert(AlertType.CONFIRMATION);
							al.setTitle("success");
							al.setHeaderText(null);
							al.setContentText("add success");
							al.showAndWait();
							user_Trainer.setText(""); tfName_Trainer.setText("");
							  tlName_Trainer.setText(""); ttp_Trainer.setText("");
							 address.setText("");phone.setText("");
						
					}
			}
		}
		
		else if (e.getSource()==delet_Trainer)
		{
			int x=0;
			try {
			  x = adminp.delete_Trainer(trainer, trainerp, delete.getText());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			if (x==1)
			{
				Alert al =new Alert(AlertType.INFORMATION);
				al.setTitle("success");
				al.setHeaderText(null);
				al.setContentText("delete Trainer Succesfuly");
				al.showAndWait();
				delete.setText("");
			}
			else if(x==2)
			{
				Alert al =new Alert(AlertType.INFORMATION);
				al.setTitle("error404");
				al.setHeaderText(null);
				al.setContentText("user name incorrect \n\ntry again");
				al.showAndWait();
				delete.setText("");
			}
		}
		else if (e.getSource()==dis_inf_Trainers)
		{
			
			String x= adminp.display_all_trainers().toString();
			if(x.equals(""))
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("error404");
				al.setHeaderText(null);
				al.setContentText("no data show");
				al.showAndWait();
			}
			else
			{
				dis_ta_trainer.setText(x);
			}
		}
		
		
		
//		TextField t_id_add_pac ,t_dis_add_pac ,t_cost_add_pac ,t_re_add_pac ,
//	     t_id_up_pac ,t_dis_up_pac ,
//	     t_id1_up_pac ,t_cost_up_pac,
//	     t_id2_up_pac,t_re_up_pac,
//	     t_id_delete_pac;
//	Button  add_pac ,update_dis_pac, update_cost_pac , update_re_pac , delete_pac,
//	   dis_inf_pac,back_pac_manage;
//	TextArea dis_ta_pac;
//		
		
		else if (e.getSource()== add_pac)
		{ 
			boolean id= true,cost = true;
			int xid=0,xcost=0 ;
			try {
			xid =Integer.parseInt(t_id_add_pac.getText());  
			System.out.println( xid);
	        }
	        catch (NumberFormatException ex){
	        	System.out.println(ex);
	            id=false;
	        }catch(Exception ex)
			{
	        	System.out.println(ex);
	        	 id=false;
			}
			try {
				xcost =Integer.parseInt(t_cost_add_pac.getText());  
				System.out.println( xcost);
		        }
		        catch (NumberFormatException ex){
		        	System.out.println(ex);
		            cost=false;
		        }catch(Exception ex)
				{
		        	System.out.println(ex);
		        	cost=false;
				}
			if(id==false&&cost == false)
			{
				Alert al =new Alert(AlertType.ERROR);
				al.setTitle("error404");
				al.setHeaderText(null);
				al.setContentText("id and cost must be integer only");
				al.showAndWait();
			}
			else if(id==false)
			{
				Alert al =new Alert(AlertType.ERROR);
				al.setTitle("error404");
				al.setHeaderText(null);
				al.setContentText("id must be integer only");
				al.showAndWait();
				
			}
			else if(cost == false)
			{
				Alert al =new Alert(AlertType.ERROR);
				al.setTitle("error404");
				al.setHeaderText(null);
				al.setContentText("cost must be integer only");
				al.showAndWait();
				
			}
			else
			{
				int x=0;
				packge= new Package(xid ,
						t_dis_add_pac.getText() ,
						xcost ,
						t_re_add_pac.getText() );
                               // packge.readFromFile_pack();
				try {
					x= adminp.add_pak(packge);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(x==1)
				{
					//"package alredy exists"
					Alert al =new Alert(AlertType.INFORMATION);
					al.setTitle("Success");
					al.setHeaderText(null);
					al.setContentText("add package Successfuly");
					al.showAndWait();
				}else if(x==2)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("package alredy exists\n add new");
					al.showAndWait();
				}
			}
			
			
			
		}
		else if(e.getSource()==dis_inf_trainee)
		{
		
		   String x = adminp.display_all_trainees().toString();
		   if(x.equals(""))
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("no data show");
				al.showAndWait();
			}
			else
			{
				dis_ta_trainee.setText(x);
			}
		}
		//
		//update discreption package
		//
		//
		else if(e.getSource()==update_dis_pac)
		{
			System.out.println("hello");
			boolean id= true;
			int xid=0;
			try {
			xid =Integer.parseInt(t_id_up_pac.getText());  
			System.out.println( xid);
	        }
	        catch (NumberFormatException ex){
	        	System.out.println(ex);
	            id=false;
	        }catch(Exception ex)
			{
	        	System.out.println(ex);
	        	 id=false;
			}
			 if(id==false)
			{
				Alert al =new Alert(AlertType.ERROR);
				al.setTitle("error404");
				al.setHeaderText(null);
				al.setContentText("id must be integer only");
				al.showAndWait();
			}
			 else {
				int x=0;
				
				try {
					x= adminp.update_pakdisc(packge, xid,t_dis_up_pac.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(x==1)
				{
					//"package alredy exists"
					Alert al =new Alert(AlertType.INFORMATION);
					al.setTitle("Success");
					al.setHeaderText(null);
					al.setContentText("update discreption Successfuly");
					al.showAndWait();
				}else if(x==2)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("id is not exist");
					al.showAndWait();
				}
				}
			
			 
			}
		//  t_id1_up_pac ,t_cost_up_pac,
		 else if(e.getSource()==update_cost_pac)
		 {
			 boolean id= true,cost = true;
				int xid=0,xcost=0 ;
				try {
				xid =Integer.parseInt(t_id1_up_pac.getText());  
				System.out.println( xid);
		        }
		        catch (NumberFormatException ex){
		        	System.out.println(ex);
		            id=false;
		        }catch(Exception ex)
				{
		        	System.out.println(ex);
		        	 id=false;
				}
				try {
					xcost =Integer.parseInt(t_cost_up_pac.getText());  
					System.out.println( xcost);
			        }
			        catch (NumberFormatException ex){
			        	System.out.println(ex);
			            cost=false;
			        }catch(Exception ex)
					{
			        	System.out.println(ex);
			        	cost=false;
					}
				if(id==false&&cost == false)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("id and cost must be integer only");
					al.showAndWait();
				}
				else if(id==false)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("id must be integer only");
					al.showAndWait();
					
				}
				else if(cost == false)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("cost must be integer only");
					al.showAndWait();
					
				}
				else
				{
					int x=0;
					try {
						x= adminp.update_pakcost(packge, xid, xcost);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(x==1)
					{
						//"package alredy exists"
						Alert al =new Alert(AlertType.INFORMATION);
						al.setTitle("Success");
						al.setHeaderText(null);
						al.setContentText("update cost Successfuly");
						al.showAndWait();
					}else if(x==2)
					{
						Alert al =new Alert(AlertType.ERROR);
						al.setTitle("error404");
						al.setHeaderText(null);
						al.setContentText("id not exsit ");
						al.showAndWait();
					}
				}
		 }
		//
		 else if(e.getSource()==update_re_pac)
		 {
			 System.out.println("hello");
				boolean id= true;
				int xid=0;
				try {
				xid =Integer.parseInt(t_id2_up_pac.getText());  
				System.out.println( xid);
		        }
		        catch (NumberFormatException ex){
		        	System.out.println(ex);
		            id=false;
		        }catch(Exception e1)
				{
		        	 id=false;
				}
				 if(id==false)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("id must be integer only");
					al.showAndWait();
				}
				 else {
					int x=0;
					
					try {
						x= adminp.update_pakrcomm(packge, xid,t_re_up_pac.getText());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(x==1)
					{
						//"package alredy exists"
						Alert al =new Alert(AlertType.INFORMATION);
						al.setTitle("Success");
						al.setHeaderText(null);
						al.setContentText("update discreption Successfuly");
						al.showAndWait();
					}else if(x==2)
					{
						Alert al =new Alert(AlertType.ERROR);
						al.setTitle("error404");
						al.setHeaderText(null);
						al.setContentText("id is not exist");
						al.showAndWait();
					}
					}	 
		 }else if(e.getSource()==delete_pac)
		 {
			 System.out.println("hello");
				boolean id= true;
				int xid=0;
				try {
				xid =Integer.parseInt(t_id_delete_pac.getText());  
				System.out.println( xid);
		        }
		        catch (NumberFormatException ex){
		        	System.out.println(ex);
		            id=false;
		        }catch(Exception e1)
				{
		        	 id=false;
				}
				 if(id==false)
				{
					Alert al =new Alert(AlertType.ERROR);
					al.setTitle("error404");
					al.setHeaderText(null);
					al.setContentText("id must be integer only");
					al.showAndWait();
				}else 
				{
					int x=0;
					
					try {
						x= adminp.delete_pak(packge, xid);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if(x==1)
					{
						//"package alredy exists"
						Alert al =new Alert(AlertType.INFORMATION);
						al.setTitle("Success");
						al.setHeaderText(null);
						al.setContentText("the package is deleted ");
						al.showAndWait();
					}else if(x==2)
					{
						Alert al =new Alert(AlertType.ERROR);
						al.setTitle("error404");
						al.setHeaderText(null);
						al.setContentText("id is not exist");
						al.showAndWait();
					}
					}
		 }
		
		
		
//		 else if (e.getSource()==dis_inf_trainee)
//		 {
//			 System.out.println("5");
//			String x= adminp.display_all_trainees().toString();
//			if(x.equals(""))
//			{
//				Alert al =new Alert(AlertType.WARNING);
//				al.setTitle("warning");
//				al.setHeaderText(null);
//				al.setContentText("no data show");
//				al.showAndWait();
//			}
//			else
//			{
//				dis_ta_trainee.setText(x);
//			}
//		 }
		 else if (e.getSource()==dis_inf_pac)
		 {
			 System.out.println("5");
			String x= adminp.display_allpak().toString();
			System.out.println(x);
			if(x.equals(""))
			{
				Alert al =new Alert(AlertType.WARNING);
				al.setTitle("warning");
				al.setHeaderText(null);
				al.setContentText("no data show");
			
				
				al.showAndWait();
			}
			else
			{
				dis_ta_pac.setText(x);
			}
		 }
		}
	
	//
	//
	//
	//\
	//
	///
	///
	///
	///
	///
	///
	///
	///
	////
	////
	////
	
	Button o,os,oa,op,ow,od,btn,btn2,btn3,btn4,btn5,btn6;
    TextField ft,ft2,st,st2,at,at2,pt,pt2,wt,wt2,dt;
     Text text;
 
public void fName(){ 
Stage fstage = new Stage();
 ft = new TextField("username");
 ft2 = new TextField("new name");
 o = new Button();
o.setText("OK");
HBox froot = new HBox(20);
froot.getChildren().addAll(ft, ft2, o);
Scene fs = new Scene(froot, 500, 250);
o.setOnAction(new EventHandler<ActionEvent>() {

   @Override
   public void handle(ActionEvent event) {
       try {
                       System.out.println("eeeejjjjjjjjjjjeeeeeeeeeeeeeeee");

           trainerp.Update_first_name(trainer, ft.getText(), ft2.getText());
       } catch (IOException ex) {
       }
   }
});
fstage.setScene(fs);
fstage.setTitle("Update firstNam'");

/////////////////////////////////////
btn = new Button();
btn.setText("Update firstNam'");
btn.setOnAction(new EventHandler<ActionEvent>() {

   @Override
   public void handle(ActionEvent event) {
       fstage.show();
   }
});
}
public void lName(){
Stage sstage = new Stage();
  st = new TextField("username");
  st2 = new TextField("new Lname");
os = new Button();
os.setText("OK");
HBox sroot = new HBox(20);
sroot.getChildren().addAll(st, st2, os);
Scene sfs = new Scene(sroot, 500, 250);
os.setOnAction(new EventHandler<ActionEvent>() {

   @Override
   public void handle(ActionEvent event) {
       try {
    	   trainerp.Update_second_name(trainer, st.getText(), st2.getText());
       } catch (IOException ex) {
          
       }
   }
});
sstage.setScene(sfs);
sstage.setTitle("Update LastName'");

/////////////////////////////////////////////////////////////////////////////////////////////////////
btn2 = new Button();
btn2.setText("Update LastNam'");
btn2.setOnAction(new EventHandler<ActionEvent>() {

   @Override
   public void handle(ActionEvent event) {
       sstage.show();
   }
});
}
public void Adress(){
Stage astage = new Stage();
at = new TextField("username");
at2 = new TextField("new Adress");
oa = new Button();
oa.setText("OK");
HBox aroot = new HBox(20);
aroot.getChildren().addAll(at, at2, oa);
Scene afs = new Scene(aroot, 500, 250);
oa.setOnAction(new EventHandler<ActionEvent>() {

   @Override
   public void handle(ActionEvent event) {
       try {
    	   trainerp.Update_address(trainer, at.getText(), at2.getText());
       } catch (IOException ex) {
          
       }
   }
});
astage.setScene(afs);
astage.setTitle("Update Adresse'");

///////////////////////////////////////////////////////////////////////////////////////
btn3 = new Button();
btn3.setText("Update Adress'");
btn3.setOnAction(new EventHandler<ActionEvent>() {

   @Override
   public void handle(ActionEvent event) {
      astage.show();
   }
});
}
public void Phone(){
Stage pstage = new Stage();
pt = new TextField("username");
pt2 = new TextField("new Phone");
op = new Button();
op.setText("OK");
HBox proot = new HBox(20);
proot.getChildren().addAll(pt, pt2, op);
Scene pfs = new Scene(proot, 500, 250);
op.setOnAction(new EventHandler<ActionEvent>() {

   @Override
   public void handle(ActionEvent event) {
       try {
    	   trainerp.Update_phone(trainer, pt.getText(), Integer.parseInt(pt2.getText()));;
       } catch (IOException ex) {
           
       }
   }
});
pstage.setScene(pfs);
pstage.setTitle("Update Phone'");

////////////////////////////////////////////////////////////////////////////////////////
btn4 = new Button();
btn4.setText("Update Phone'");
btn4.setOnAction(new EventHandler<ActionEvent>() {

   @Override
   public void handle(ActionEvent event) {
       pstage.show();
   }
});
}
public void pass (){
Stage wstage = new Stage();
wt = new TextField("username");
wt2 = new TextField("new pass");
ow = new Button();
ow.setText("OK");
HBox wroot = new HBox(20);
wroot.getChildren().addAll(wt, wt2, ow);
Scene wfs = new Scene(wroot, 500, 250);
ow.setOnAction(new EventHandler<ActionEvent>() {

   @Override
   public void handle(ActionEvent event) {
       try {
    	   trainerp.Update_password(trainer, wt.getText(), wt2.getText());
       } catch (IOException ex) {
           
       }
   }
});
wstage.setScene(wfs);
wstage.setTitle("Update Password'");
///////////////////////////////////////////////////////////////////////////////////////////////
btn5 = new Button();
btn5.setText("Update Password'");
btn5.setOnAction(new EventHandler<ActionEvent>() {

   @Override
   public void handle(ActionEvent event) {
       wstage.show();
   }
});
}
public void displayinfo(){
Stage dstage = new Stage();
dt = new TextField("username");
od = new Button();
od.setText("OK");
HBox droot = new HBox(20);
droot.getChildren().addAll(dt, od);
Scene dfs = new Scene(droot, 500, 250);

od.setOnAction(new EventHandler<ActionEvent>() {

   @Override
   public void handle(ActionEvent event) {
       Text text = new Text(20, 20, trainerp.display_info( dt.getText(),trainer).toString());
       //System.out.println(te.display_info( dt.getText(),t).toString());
        droot.getChildren().add(text);
   }
});

dstage.setScene(dfs);
dstage.setTitle("Display InFo'");
////////////////////////////////////////////////////////////////////////
btn6 = new Button();
btn6.setText("Display InFo'");
btn6.setOnAction(new EventHandler<ActionEvent>() {

   @Override
   public void handle(ActionEvent event) {
       dstage.show();
   }
});
}
Button o1,os1,oa1,op1,ow1,od1,btn1,btn21,btn31,btn41,btn51,btn61;
TextField ft1,ft21,st1,st21,at1,at21,pt1,pt21,wt1,wt21,dt1;
 Text text1;

public void fName1(){ 
Stage fstage = new Stage();
ft1 = new TextField("username");
ft21 = new TextField("new name");
o1 = new Button();
o1.setText("OK");
HBox froot = new HBox(20);
froot.getChildren().addAll(ft1, ft21, o1);
Scene fs = new Scene(froot, 500, 250);
o1.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
   try {
       adminp.Update_first_name(admin, ft1.getText(), ft21.getText());
   } catch (IOException ex) {
        
   }
}
});
fstage.setScene(fs);
fstage.setTitle("Update firstNam'");

/////////////////////////////////////
btn1 = new Button();
btn1.setText("Update firstNam'");
btn1.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
   fstage.show();
}
});
}
public void lName1(){
Stage sstage = new Stage();
st1 = new TextField("username");
st21 = new TextField("new Lname");
os1 = new Button();
os1.setText("OK");
HBox sroot = new HBox(20);
sroot.getChildren().addAll(st1, st21, os1);
Scene sfs = new Scene(sroot, 500, 250);
os1.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
   try {
	   adminp.Update_second_name(admin, st1.getText(), st21.getText());
   } catch (IOException ex) {
      
   }
}
});
sstage.setScene(sfs);
sstage.setTitle("Update LastName'");

/////////////////////////////////////////////////////////////////////////////////////////////////////
btn21 = new Button();
btn21.setText("Update LastNam'");
btn21.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
   sstage.show();
}
});
}
public void Adress1(){
Stage astage = new Stage();
at1 = new TextField("username");
at21 = new TextField("new Adress");
oa1 = new Button();
oa1.setText("OK");
HBox aroot = new HBox(20);
aroot.getChildren().addAll(at1, at21, oa1);
Scene afs = new Scene(aroot, 500, 250);
oa1.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
   try {
	   adminp.Update_address(admin, at1.getText(), at21.getText());
   } catch (IOException ex) {
      
   }
}
});
astage.setScene(afs);
astage.setTitle("Update Adresse'");

///////////////////////////////////////////////////////////////////////////////////////
btn31 = new Button();
btn31.setText("Update Adress'");
btn31.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
  astage.show();
}
});
}
public void Phone1(){
Stage pstage = new Stage();
pt1 = new TextField("username");
pt21 = new TextField("new Phone");
op1 = new Button();
op1.setText("OK");
HBox proot = new HBox(20);
proot.getChildren().addAll(pt1, pt21, op1);
Scene pfs = new Scene(proot, 500, 250);
op1.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
   try {
	   adminp.Update_phone(admin, pt1.getText(), Integer.parseInt(pt1.getText()));;
   } catch (IOException ex) {
       
   }
}
});
pstage.setScene(pfs);
pstage.setTitle("Update Phone'");

////////////////////////////////////////////////////////////////////////////////////////
btn41 = new Button();
btn41.setText("Update Phone'");
btn41.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
   pstage.show();
}
});
}
public void pass1 (){
Stage wstage = new Stage();
wt1 = new TextField("username");
wt21 = new TextField("new pass");
ow1 = new Button();
ow1.setText("OK");
HBox wroot = new HBox(20);
wroot.getChildren().addAll(wt1, wt21, ow1);
Scene wfs = new Scene(wroot, 500, 250);
ow1.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
   try {
	   adminp.Update_password(admin, wt1.getText(), wt21.getText());
   } catch (IOException ex) {
       
   }
}
});
wstage.setScene(wfs);
wstage.setTitle("Update Password'");
///////////////////////////////////////////////////////////////////////////////////////////////
btn51 = new Button();
btn51.setText("Update Password'");
btn51.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
   wstage.show();
}
});
}
public void displayinfo1(){
Stage dstage = new Stage();
dt1 = new TextField("username");
od1 = new Button();
od1.setText("OK");
HBox droot = new HBox(20);
droot.getChildren().addAll(dt1, od1);
Scene dfs = new Scene(droot, 500, 250);

od1.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
   Text text1 = new Text(20, 20, adminp.display_info( dt1.getText(),admin).toString());
   //System.out.println(te.display_info( dt.getText(),t).toString());
    droot.getChildren().add(text1);
}
});

dstage.setScene(dfs);
dstage.setTitle("Display InFo'");
////////////////////////////////////////////////////////////////////////
btn61 = new Button();
btn61.setText("Display InFo'");
btn61.setOnAction(new EventHandler<ActionEvent>() {

@Override
public void handle(ActionEvent event) {
   dstage.show();
}
});
}
	}

