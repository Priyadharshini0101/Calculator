package com.example.calculator;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.Log;
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


public class Temperature extends Fragment implements AdapterView.OnItemSelectedListener{
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
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Temperature, android.R.layout.simple_spinner_item);

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
                    a = "Celsius";
                    unit.setText("°C");
                    ans(result,result1);
                } else if (position == 1) {
                    a = "Fahrenheit";
                    unit.setText("°F");
                    ans(result,result1);
                } else if (position == 2) {
                    a = "Kelvin";
                    unit.setText("K");
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
                     b= "Celsius";
                    unit1.setText("°C");
                    ans(result,result1);
                } else if (position == 1) {
                    b = "Fahrenheit";
                    unit1.setText("°F");
                    ans(result,result1);
                } else if (position == 2) {
                    b = "Kelvin";
                    unit1.setText("K");
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

            case "CelsiusFahrenheit":
                Double ans1 = Double.parseDouble(resulta.getText().toString());
                String cont1=String.valueOf((ans1*9/5)+32);
                Log.v("MainActivity","Done");
                cont(cont1,resultb);
                break;
            case "CelsiusKelvin":
                Double ans2 = Double.parseDouble(resulta.getText().toString());
                String cont2=String.valueOf(ans2+273.15);
                cont(cont2,resultb);
                Log.v("MainActivity","Done");
                break;
            case "FahrenheitCelsius":
                Double ans3 = Double.parseDouble(resulta.getText().toString());
                String cont3=String.valueOf((ans3-32)*5/9);
                cont(cont3,resultb);
                Log.v("MainActivity","Done");
                break;
            case "FahrenheitKelvin":
                Double ans4 = Double.parseDouble(resulta.getText().toString());
                String cont4=String.valueOf((ans4-32)*5/9+273.15);
                cont(cont4,resultb);
                break;
            case "KelvinCelsius":
                Double ans5 = Double.parseDouble(resulta.getText().toString());
                String cont5=String.valueOf(ans5-273.15);
                cont(cont5,resultb);
                break;
            case "KelvinFahrenheit":
                Double ans6 = Double.parseDouble(resulta.getText().toString());
                String cont6=String.valueOf((ans6-273.15)*9/5+32);
                cont(cont6,resultb);
                break;

            case "CelsiusCelsius":
            case "FahrenheitFahrenheit":
            case "KelvinKelvin":
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

