package com.CgpaCalculator.TasnimAnas;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import com.CgpaCalculator.TasnimAnas.NumToCG;
import java.lang.String;

public class MainActivity extends Activity 
{
	private EditText MatMM;
	private EditText MatI;
	private EditText MatE;
	private EditText BioM;
	private EditText BioI;
	private EditText BioE;
	private EditText ChemM;
	private EditText ChemI;
	private EditText ChemE;
	private EditText PcomM;
	private EditText PcomE;
	private EditText PcomI;
	private EditText LlabE;
	private EditText LlabI;
	private EditText ChemlabE;
	private EditText ChemlabI;
	private EditText BMSE;
	private EditText BMSI;
	private EditText EVSE;
	private EditText EVSI;
	private EditText EgraphE;
	private EditText EgraphI;
	
	private TextView CGPAtext;
	private Button Calculatee;
	
	private TextView MAT;
	private TextView BIO;
	private TextView CHEM;
	private TextView PCOM;
	private TextView LLAB;
	private TextView EGRAPH;
	private TextView CHEMLAB;
	private TextView BMSS;
	private TextView EVSS;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		ActionBar ab = getActionBar();
		ab.hide();
		
		MatMM= findViewById(R.id.MatM);
		MatI = 	(EditText)findViewById(R.id.MatI);
		MatE = 	(EditText)findViewById(R.id.MatE);
		BioM = 	(EditText)findViewById(R.id.BioM);
		BioI = 	(EditText)findViewById(R.id.BioI);
		BioE = 	(EditText)findViewById(R.id.BioE);
		ChemM = 	(EditText)findViewById(R.id.ChemM);
		ChemI = 	(EditText)findViewById(R.id.ChemI);
		ChemE = 	(EditText)findViewById(R.id.ChemE);
        PcomM = 	(EditText)findViewById(R.id.PcomM);
		PcomE = 	(EditText)findViewById(R.id.PcomE);
		PcomI = 	(EditText)findViewById(R.id.PcomI);
		LlabE =	(EditText) findViewById(R.id.LlabE);
		LlabI = 	(EditText)findViewById(R.id.LlabI);
		ChemlabE = (EditText)	findViewById(R.id.ChemLabE);
		ChemlabI = (EditText)	findViewById(R.id.ChemLabI);
		BMSE = (EditText)	findViewById(R.id.BMSE);
		BMSI = (EditText)	findViewById(R.id.BMSI);
		EVSE = 	(EditText)findViewById(R.id.EVSE);
		EVSI = (EditText)	findViewById(R.id.EVSI);
		EgraphE = 	(EditText)findViewById(R.id.EgraphE);
		EgraphI = 	(EditText)findViewById(R.id.EgraphI);
		
		CGPAtext = findViewById(R.id.CGPA);
		Calculatee = findViewById(R.id.Calculate);
		
		MAT = (TextView)	findViewById(R.id.MatT);
		BIO = 	(TextView)findViewById(R.id.BioT);
		CHEM = (TextView)	findViewById(R.id.ChemT);
		PCOM = (TextView)	findViewById(R.id.PcomT);
		LLAB = (TextView)	findViewById(R.id.LlabT);
        EGRAPH = 	(TextView)findViewById(R.id.EgraphT);
		CHEMLAB = 	(TextView)findViewById(R.id.ChemlabT);
		BMSS =(TextView)	 findViewById(R.id.BMST);
        EVSS = (TextView)	findViewById(R.id.EVST);
		
		
		Calculatee.setOnClickListener(new View.OnClickListener(){

				@Override
				public void onClick(View v)
				{
					if(MatMM.getText().toString().length() == 0){
						MatMM.setText("0");
					}
					if(MatI.getText().toString().length() == 0){
						MatI.setText("0");
					}
					if(MatE.getText().toString().length() == 0){
						MatE.setText("0");
					}
					if(BioM.getText().toString().length() == 0){
						BioM.setText("0");
					}
					if(BioI.getText().toString().length() == 0){
						BioI.setText("0");
					}
					if(BioE.getText().toString().length() == 0){
						BioE.setText("0");
					}
					if(ChemM.getText().toString().length() == 0){
						ChemM.setText("0");
					}
					if(ChemI.getText().toString().length() == 0){
						ChemI.setText("0");
					}
					if(ChemE.getText().toString().length() == 0){
						ChemE.setText("0");
					}
					if(PcomM.getText().toString().length() == 0){
						PcomM.setText("0");
					}
					if(PcomE.getText().toString().length() == 0){
						PcomE.setText("0");
					}
					if(PcomI.getText().toString().length() == 0){
						PcomI.setText("0");
					}
					if(LlabE.getText().toString().length() == 0){
						LlabE.setText("0");
					}
					if(LlabI.getText().toString().length() == 0){
						LlabI.setText("0");
					}
					if(ChemlabE.getText().toString().length() == 0){
						ChemlabE.setText("0");
					}
					if(ChemlabI.getText().toString().length() == 0){
						ChemlabI.setText("0");
					}
					if(BMSI.getText().toString().length() == 0){
						BMSI.setText("0");
					}
					if(BMSE.getText().toString().length() == 0){
						BMSE.setText("0");
					}
					if(EVSI.getText().toString().length() == 0){
						EVSI.setText("0");
					}
					if(EVSE.getText().toString().length() == 0){
						EVSE.setText("0");
					}
					if(EgraphE.getText().toString().length() == 0){
						EgraphE.setText("0");
					}
					if(EgraphI.getText().toString().length() == 0){
						EgraphI.setText("0");
					}
					
					NumToCG CG = new NumToCG();

					int matm = Integer.parseInt(MatMM.getText().toString());
					int mati = Integer.parseInt(MatI.getText().toString());
					int mate = Integer.parseInt(MatE.getText().toString());
					int MatT = matm+mati+mate;
					int BioT = Integer.parseInt(BioM.getText().toString()) + Integer.parseInt(BioE.getText().toString()) + Integer.parseInt(BioI.getText().toString());
					int ChemT = Integer.parseInt(ChemM.getText().toString()) + Integer.parseInt(ChemE.getText().toString()) + Integer.parseInt(ChemI.getText().toString());
					int PcomT = Integer.parseInt(PcomM.getText().toString()) + Integer.parseInt(PcomE.getText().toString()) + Integer.parseInt(PcomI.getText().toString());
					int LlabT = Integer.parseInt(LlabE.getText().toString()) + Integer.parseInt(LlabI.getText().toString());
					int EgraphT = Integer.parseInt(EgraphE.getText().toString()) + Integer.parseInt(EgraphI.getText().toString());
					int ChemLabT = Integer.parseInt(ChemlabE.getText().toString()) + Integer.parseInt(ChemlabI.getText().toString());
					int BMST = Integer.parseInt(BMSE.getText().toString()) + Integer.parseInt(BMSI.getText().toString());
					int EVST = Integer.parseInt(EVSE.getText().toString()) + Integer.parseInt(EVSI.getText().toString());
					

					int mat = CG.CG(MatT);
					int bio = CG.CG(BioT);
					int chem = CG.CG(ChemT);
					int pcom = CG.CG(PcomT);
					int llab = CG.CG(LlabT);
					int egraph = CG.CG(EgraphT);
					int chemlab = CG.CG(ChemLabT);
					int bms = CG.CG(BMST);
					int evs = CG.CG(EVST);

					double out = ((chemlab*1.5)+(egraph*2)+(bms*2)+(evs*1)+(llab*1)+(pcom*2)+(chem*3)+(bio*2)+(mat*4))/18.5;
					
					String mm = String.format("%.2f",out);
					CGPAtext.setText(mm);
					

					
					MAT.setText(String.valueOf(MatT)+" ("+String.valueOf(mat)+")");
					BIO.setText(String.valueOf(BioT)+" ("+String.valueOf(bio)+")");
					CHEM.setText(String.valueOf(ChemT)+" ("+String.valueOf(chem)+")");
					PCOM.setText(String.valueOf(PcomT)+" ("+String.valueOf(pcom)+")");
					LLAB.setText(String.valueOf(LlabT)+" ("+String.valueOf(llab)+")");
					EGRAPH.setText(String.valueOf(EgraphT)+" ("+String.valueOf(egraph)+")");
					CHEMLAB.setText(String.valueOf(ChemLabT)+" ("+String.valueOf(chemlab)+")");
					BMSS.setText(String.valueOf(BMST)+" ("+String.valueOf(bms)+")");
					EVSS.setText(String.valueOf(EVST)+" ("+String.valueOf(evs)+")");
				}
			});
		
		
    }
}
