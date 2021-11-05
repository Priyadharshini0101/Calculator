package com.example.calculator;


import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;


public class Length extends Fragment implements AdapterView.OnItemSelectedListener {

    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdot;
    private TextView bclear;
    private ImageButton bBackspace;
    public TextView unit, unit1;
    public EditText result, result1;
    public String a, b;
    public String up;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragmentslist, container, false);
        Spinner spinner = (Spinner) rootView.findViewById(R.id.Spinner);
        Spinner spinner1 = (Spinner) rootView.findViewById(R.id.Spinner1);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Length, android.R.layout.simple_spinner_item);

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);


        result = (EditText) rootView.findViewById(R.id.EditText);
        result.setShowSoftInputOnFocus(false);
        unit = (TextView) rootView.findViewById(R.id.Text);
        result1 = (EditText) rootView.findViewById(R.id.EditText1);
        result1.setShowSoftInputOnFocus(false);
        unit1 = (TextView) rootView.findViewById(R.id.Text1);
        b0 = (Button) rootView.findViewById(R.id.zero);
        b1 = (Button) rootView.findViewById(R.id.one);
        b2 = (Button) rootView.findViewById(R.id.two);
        b3 = (Button) rootView.findViewById(R.id.three);
        b4 = (Button) rootView.findViewById(R.id.four);
        b5 = (Button) rootView.findViewById(R.id.five);
        b6 = (Button) rootView.findViewById(R.id.six);
        b7 = (Button) rootView.findViewById(R.id.seven);
        b8 = (Button) rootView.findViewById(R.id.eight);
        b9 = (Button) rootView.findViewById(R.id.nine);
        bdot = (Button) rootView.findViewById(R.id.dot);
        bclear = (TextView) rootView.findViewById(R.id.TextView3);
        bBackspace = (ImageButton) rootView.findViewById(R.id.BackSpace);


        result.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                up="1";
                return false;
            }
        });
        result1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                up="2";
                return false;
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("0",result);
                    ans(result,result1);
                }else{
                    updateText("0",result1);
                    ans(result1,result);
                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("1",result);
                    ans(result,result1);

                }else{
                    updateText("1",result1);
                    ans(result1,result);
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("2",result);
                    ans(result,result1);
                }else{
                    updateText("2",result1);
                    ans(result1,result);
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("3",result);
                    ans(result,result1);
                }else{
                    updateText("3",result1);
                    ans(result1,result);
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("4",result);
                    ans(result,result1);
                }else{
                    updateText("4",result1);
                    ans(result1,result);
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("5",result);
                    ans(result,result1);
                }else{
                    updateText("5",result1);
                    ans(result1,result);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("6",result);
                    ans(result,result1);
                }else{
                    updateText("6",result1);
                    ans(result1,result);
                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("7",result);
                    ans(result,result1);
                }else{
                    updateText("7",result1);
                    ans(result1,result);
                }

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("8",result);
                    ans(result,result1);
                }else{
                    updateText("8",result1);
                    ans(result1,result);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText("9",result);
                    ans(result,result1);
                }else{
                    updateText("9",result1);
                    ans(result1,result);
                }
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(up=="1")
                {
                    updateText(".",result);
                    ans(result,result1);
                }else{
                    updateText(".",result1);
                    ans(result1,result);
                }

            }
        });


        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                result1.setText("");
            }
        });

        bBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cursorPos = result.getSelectionStart();
                int texlen = result.getText().length();
                int cursorPos1 = result1.getSelectionStart();
                int texlen1 = result1.getText().length();
                if (texlen != 0 && cursorPos != 0) {
                    SpannableStringBuilder selection = (SpannableStringBuilder) result.getText();
                    selection.replace(cursorPos - 1, cursorPos, "");
                    result.setText(selection);
                    result.setSelection(cursorPos - 1);

                }
                if (texlen1 != 0 && cursorPos != 0) {
                    SpannableStringBuilder selection1 = (SpannableStringBuilder) result1.getText();
                    selection1.replace(cursorPos - 1, cursorPos, "");
                    result1.setText(selection1);
                    result1.setSelection(cursorPos - 1);
                }
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    a = "Millimetres";
                    unit.setText("mm");
                    ans(result,result1);
                } else if (position == 1) {
                    a = "Centimetres";
                    unit.setText("cm");
                    ans(result,result1);
                } else if (position == 2) {
                    a = "Metres";
                    unit.setText("m");
                    ans(result,result1);
                } else if (position == 3) {
                    a = "Kilometres";
                    unit.setText("km");
                    ans(result,result1);
                } else if (position == 4) {
                    a = "Inches";
                    unit.setText("in");
                    ans(result,result1);
                } else if (position == 5) {
                    a = "Feet";
                    unit.setText("ft");
                    ans(result,result1);
                } else if (position == 6) {
                    a = "Yards";
                    unit.setText("yd");
                    ans(result,result1);
                }else if(position==7){
                    a= "Miles";
                    unit.setText("mi");
                    ans(result,result1);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        spinner1.setAdapter(adapter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    b= "Millimetres";
                    unit1.setText("mm");
                    ans(result,result1);
                } else if (position == 1) {
                    b = "Centimetres";
                    unit1.setText("cm");
                    ans(result,result1);
                } else if (position == 2) {
                    b = "Metres";
                    unit1.setText("m");
                    ans(result,result1);
                } else if (position == 3) {
                    b = "Kilometres";
                    unit1.setText("km");
                    ans(result,result1);
                } else if (position == 4) {
                    b = "Inches";
                    unit1.setText("in");
                    ans(result,result1);
                } else if (position == 5) {
                    b = "Feet";
                    unit1.setText("ft");
                    ans(result,result1);
                } else if (position == 6) {
                    b = "Yards";
                    unit1.setText("yd");
                    ans(result,result1);
                }else if(position==7){
                    b= "Miles";
                    unit1.setText("mi");
                    ans(result,result1);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        return rootView;
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        //nothing
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //nothing
    }
    public void cont(String unit,EditText resultb){
        if(unit.endsWith(".0")){
            unit= unit.substring(0,unit.length()-2);
        }
        resultb.setText(unit);
    }


    public void ans(EditText resulta,EditText resultb) {
        String text = a + b;
        Log.v("MainActivity", a + b);
        switch (text) {

            case "MillimetresCentimetres":
                Double ans1 = Double.parseDouble(resulta.getText().toString());
                String cont1=String.valueOf(ans1/10);
                cont(cont1,resultb);
                break;
            case "MillimetresMetres":
                Double ans2 = Double.parseDouble(resulta.getText().toString());
                String cont2=String.valueOf(ans2/1000);
                cont(cont2,resultb);
                break;
            case "MillimetresKilometres":
                Double ans3 = Double.parseDouble(resulta.getText().toString());
                String cont3=String.valueOf(ans3/1000000);
                cont(cont3,resultb);
                break;
            case "MillimetresInches":
                Double ans4 = Double.parseDouble(resulta.getText().toString());
                String cont4=String.valueOf(ans4/25.4);
                cont(cont4,resultb);
                break;
            case "MillimetresFeet":
                Double ans5 = Double.parseDouble(resulta.getText().toString());
                String cont5=String.valueOf(ans5/304.8);
                cont(cont5,resultb);
                break;
            case "MillimetresYards":
                Double ans11 = Double.parseDouble(resulta.getText().toString());
                String cont11=String.valueOf(ans11/914.4);
                cont(cont11,resultb);
                break;
            case "MillimetresMiles":
                Double ans12 = Double.parseDouble(resulta.getText().toString());
                String cont12=String.valueOf(ans12/1609344);
                cont(cont12,resultb);
                break;
            case "CentimetresMillimetres":
                Double ans13 = Double.parseDouble(resulta.getText().toString());
                String cont13=String.valueOf(ans13*10);
                cont(cont13,resultb);
                break;
            case "CentimetresMetres":
                Double ans14 = Double.parseDouble(resulta.getText().toString());
                String cont14=String.valueOf(ans14/100);
                cont(cont14,resultb);
                break;
            case "CentimetresKilometres":
                Double ans15 = Double.parseDouble(resulta.getText().toString());
                String cont15=String.valueOf(ans15/100000);
                cont(cont15,resultb);
                break;
            case "CentimetresInches":
                Double ans6 = Double.parseDouble(resulta.getText().toString());
                String cont6=String.valueOf(ans6/(24.5/10));
                cont(cont6,resultb);
                break;
            case "CentimetresFeet":
                Double ans7 = Double.parseDouble(resulta.getText().toString());
                String cont7=String.valueOf(ans7/(304.8/10));
                cont(cont7,resultb);
                break;
            case "CentimetresYards":
                Double ans8 = Double.parseDouble(resulta.getText().toString());
                String cont8=String.valueOf(ans8/=(914.4/10));
                cont(cont8,resultb);
                break;
            case "CentimetresMiles":
                Double ans9= Double.parseDouble(resulta.getText().toString());
                String cont9=String.valueOf(ans9/(1609344/10));
                cont(cont9,resultb);
                break;
            case "MetresMillimetres":
                Double ans10 = Double.parseDouble(resulta.getText().toString());
                String cont10=String.valueOf(ans10*1000);
                cont(cont10,resultb);
                break;
            case "MetresCentimetres":
                Double ans16 = Double.parseDouble(resulta.getText().toString());
                String cont16=String.valueOf(ans16*100);
                cont(cont16,resultb);
                break;
            case "MetresKilometres":
                Double ans17 = Double.parseDouble(resulta.getText().toString());
                String cont17=String.valueOf(ans17/1000);
                cont(cont17,resultb);
                break;
            case "MetresInches":
                Double ans18 = Double.parseDouble(resulta.getText().toString());
                String cont18=String.valueOf(ans18/(25.4/1000));
                cont(cont18,resultb);
                break;
            case "MetresFeet":
                Double ans19= Double.parseDouble(resulta.getText().toString());
                String cont19=String.valueOf(ans19/(304.8/1000));
                cont(cont19,resultb);
                break;
            case "MetresYards":
                Double ans20 = Double.parseDouble(resulta.getText().toString());
                String cont20=String.valueOf(ans20/(914.4/1000));
                cont(cont20,resultb);
                break;
            case "MetresMiles":
                Double ans21 = Double.parseDouble(resulta.getText().toString());
                String cont21=String.valueOf(ans21/(1609344/1000));
                cont(cont21,resultb);
                break;
            case "KilometresMillimetres":
                Double ans22 = Double.parseDouble(resulta.getText().toString());
                String cont22=String.valueOf(ans22*1000000);
                cont(cont22,resultb);
                break;
            case "KilometresCentimetres":
                Double ans23 = Double.parseDouble(resulta.getText().toString());
                String cont23=String.valueOf(ans23*100000);
                cont(cont23,resultb);
                break;
            case "KilometresMetres":
                Double ans24= Double.parseDouble(resulta.getText().toString());
                String cont24=String.valueOf(ans24*1000);
                cont(cont24,resultb);
                break;
            case "KilometresInches":
                Double ans25 = Double.parseDouble(resulta.getText().toString());
                String cont25=String.valueOf(ans25/(25.4/1000000));
                cont(cont25,resultb);
                break;
            case "KilometresFeet":
                Double ans26 = Double.parseDouble(resulta.getText().toString());
                String cont26=String.valueOf(ans26/(304.8/1000000));
                cont(cont26,resultb);
                break;
            case "KilometresYards":
                Double ans27 = Double.parseDouble(resulta.getText().toString());
                String cont27=String.valueOf(ans27/(914.4/1000000));
                cont(cont27,resultb);
                break;
            case "KilometresMiles":
                Double ans28 = Double.parseDouble(resulta.getText().toString());
                String cont28=String.valueOf(ans28/1.609344);
                cont(cont28,resultb);
                break;

            case "InchesMillimetres":
                Double ans29 = Double.parseDouble(resulta.getText().toString());
                String cont29=String.valueOf(ans29*25.4);
                cont(cont29,resultb);
                break;
            case "InchesCentimetres":
                Double ans30 = Double.parseDouble(resulta.getText().toString());
                String cont30=String.valueOf(ans30*(25.4/10));
                cont(cont30,resultb);
                break;
            case "InchesMetres":
                Double ans31= Double.parseDouble(resulta.getText().toString());
                String cont31=String.valueOf(ans31*(25.4/1000));
                cont(cont31,resultb);
                break;
            case "InchesKilometres":
                Double ans32 = Double.parseDouble(resulta.getText().toString());
                String cont32=String.valueOf(ans32*(0.0000254));
                cont(cont32,resultb);
                break;
            case "InchesFeet":
                Double ans33 = Double.parseDouble(resulta.getText().toString());
                String cont33=String.valueOf(ans33/(304.8/25.4));
                cont(cont33,resultb);
                break;
            case "InchesYards":
                Double ans34 = Double.parseDouble(resulta.getText().toString());
                String cont34=String.valueOf(ans34/(914.4/25.4));
                cont(cont34,resultb);
                break;
            case "InchesMiles":
                Double ans35 = Double.parseDouble(resulta.getText().toString());
                String cont35=String.valueOf(ans35/(1609344/25.4));
                cont(cont35,resultb);
                break;

            case "FeetMillimetres":
                Double ans36 = Double.parseDouble(resulta.getText().toString());
                String cont36=String.valueOf(ans36*304.8);
                cont(cont36,resultb);
                break;
            case "FeetCentimetres":
                Double ans37 = Double.parseDouble(resulta.getText().toString());
                String cont37=String.valueOf(ans37*(304.8/10));
                cont(cont37,resultb);
                break;
            case "FeetMetres":
                Double ans38= Double.parseDouble(resulta.getText().toString());
                String cont38=String.valueOf(ans38*(304.8/1000));
                cont(cont38,resultb);
                break;
            case "FeetKilometres":
                Double ans39 = Double.parseDouble(resulta.getText().toString());
                String cont39=String.valueOf(ans39*0.0003048);
                cont(cont39,resultb);
                break;
            case "FeetInches":
                Double ans40 = Double.parseDouble(resulta.getText().toString());
                String cont40=String.valueOf(ans40*12);
                cont(cont40,resultb);
                break;
            case "FeetYards":
                Double ans41 = Double.parseDouble(resulta.getText().toString());
                String cont41=String.valueOf(ans41/(914.4/304.8));
                cont(cont41,resultb);
                break;
            case "FeetMiles":
                Double ans42 = Double.parseDouble(resulta.getText().toString());
                String cont42=String.valueOf(ans42/(1609344/304.8));
                cont(cont42,resultb);
                break;




            case "YardsMillimetres":
                Double ans43 = Double.parseDouble(resulta.getText().toString());
                String cont43=String.valueOf(ans43*914.4);
                cont(cont43,resultb);
                break;
            case "YardsCentimetres":
                Double ans44 = Double.parseDouble(resulta.getText().toString());
                String cont44=String.valueOf(ans44*(914.4/10));
                cont(cont44,resultb);
                break;
            case "YardsMetres":
                Double ans45= Double.parseDouble(resulta.getText().toString());
                String cont45=String.valueOf(ans45*(914.4/1000));
                cont(cont45,resultb);
                break;
            case "YardsKilometres":
                Double ans46 = Double.parseDouble(resulta.getText().toString());
                String cont46=String.valueOf(ans46*(914.4/1000000));
                cont(cont46,resultb);
                break;
            case "YardsInches":
                Double ans47 = Double.parseDouble(resulta.getText().toString());
                String cont47=String.valueOf(ans47*36);
                cont(cont47,resultb);
                break;
            case "YardsFeet":
                Double ans48 = Double.parseDouble(resulta.getText().toString());
                String cont48=String.valueOf(ans48*3);
                cont(cont48,resultb);
                break;
            case "YardsMiles":
                Double ans49 = Double.parseDouble(resulta.getText().toString());
                String cont49=String.valueOf(ans49/(1609344/914.4));
                cont(cont49,resultb);
                break;




            case "MilesMillimetres":
                Double ans50 = Double.parseDouble(resulta.getText().toString());
                String cont50=String.valueOf(ans50*1609344);
                cont(cont50,resultb);
                break;
            case "MilesCentimetres":
                Double ans51 = Double.parseDouble(resulta.getText().toString());
                String cont51=String.valueOf(ans51*160934.4);
                cont(cont51,resultb);
                break;
            case "MilesMetres":
                Double ans52= Double.parseDouble(resulta.getText().toString());
                String cont52=String.valueOf(ans52*1609.344);
                cont(cont52,resultb);
                break;
            case "MilesKilometres":
                Double ans53 = Double.parseDouble(resulta.getText().toString());
                String cont53=String.valueOf(ans53*1.609344);
                cont(cont53,resultb);
                break;
            case "MilesInches":
                Double ans54 = Double.parseDouble(resulta.getText().toString());
                String cont54=String.valueOf(ans54*63360);
                cont(cont54,resultb);
                break;
            case "MilesFeet":
                Double ans55 = Double.parseDouble(resulta.getText().toString());
                String cont55=String.valueOf(ans55*5280);
                cont(cont55,resultb);
                break;
            case "MilesYards":
                Double ans56 = Double.parseDouble(resulta.getText().toString());
                String cont56=String.valueOf(ans56*1760);
                cont(cont56,resultb);
                break;











            case "MillimetresMillimetres":
            case "CentimetresCentimetres":
            case "MetresMetres":
            case "KilometresKilometres":
            case "InchesInches":
            case "FeetFeet":
            case "YardsYards":
            case "MilesMiles":
                resultb.setText(resulta.getText().toString());




        }
    }


    void updateText(String str, EditText resulta) {

        String oldStr = resulta.getText().toString();
        int cursorPos = resulta.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        resulta.setText(String.format("%s%s%s", leftStr, str, rightStr));
        resulta.setSelection(cursorPos + str.length());
    }









}

