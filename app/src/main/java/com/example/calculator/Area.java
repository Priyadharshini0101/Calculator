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


public class Area extends Fragment implements AdapterView.OnItemSelectedListener {
    public String a, b;
    public String up;
    private Button a0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bdot;
    private TextView bclear;
    private ImageButton bBackspace;
    public TextView unit, unit1;
    public EditText result, result1;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragmentslist, container, false);

        Spinner spinner = (Spinner) rootView.findViewById(R.id.Spinner);
        Spinner spinner1 = (Spinner) rootView.findViewById(R.id.Spinner1);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(getActivity(), R.array.Ares, android.R.layout.simple_spinner_item);

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
        a0 = (Button) rootView.findViewById(R.id.zero);
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
                up = "1";
                return false;
            }
        });
        result1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                up = "2";
                return false;
            }
        });
        a0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (up == "1") {
                    updateText("0", result);
                    ans(result, result1);
                } else {
                    updateText("0", result1);
                    ans(result1, result);
                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (up == "1") {
                    updateText("1", result);
                    ans(result, result1);

                } else {
                    updateText("1", result1);
                    ans(result1, result);
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (up == "1") {
                    updateText("2", result);
                    ans(result, result1);
                } else {
                    updateText("2", result1);
                    ans(result1, result);
                }

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (up == "1") {
                    updateText("3", result);
                    ans(result, result1);
                } else {
                    updateText("3", result1);
                    ans(result1, result);
                }

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (up == "1") {
                    updateText("4", result);
                    ans(result, result1);
                } else {
                    updateText("4", result1);
                    ans(result1, result);
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (up == "1") {
                    updateText("5", result);
                    ans(result, result1);
                } else {
                    updateText("5", result1);
                    ans(result1, result);
                }
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (up == "1") {
                    updateText("6", result);
                    ans(result, result1);
                } else {
                    updateText("6", result1);
                    ans(result1, result);
                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (up == "1") {
                    updateText("7", result);
                    ans(result, result1);
                } else {
                    updateText("7", result1);
                    ans(result1, result);
                }

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (up == "1") {
                    updateText("8", result);
                    ans(result, result1);
                } else {
                    updateText("8", result1);
                    ans(result1, result);
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (up == "1") {
                    updateText("9", result);
                    ans(result, result1);
                } else {
                    updateText("9", result1);
                    ans(result1, result);
                }
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (up == "1") {
                    updateText(".", result);
                    ans(result, result1);
                } else {
                    updateText(".", result1);
                    ans(result1, result);
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
                    a = "Acres";
                    unit.setText("ac");
                    ans(result, result1);
                } else if (position == 1) {
                    a = "Ares";
                    unit.setText("a");
                    ans(result, result1);
                } else if (position == 2) {
                    a = "Hectares";
                    unit.setText("ha");
                    ans(result, result1);
                } else if (position == 3) {
                    a = "Square centimetres";
                    unit.setText("cm²");
                    ans(result, result1);
                } else if (position == 4) {
                    a = "Square feet";
                    unit.setText("ft²");
                    ans(result, result1);

                } else if (position == 5) {
                    a = "Square inches";
                    unit.setText("in²");
                    ans(result, result1);

                } else if (position == 6) {
                    a = "Square metres";
                    unit.setText("m²");
                    ans(result, result1);

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
                    b = "Acres";
                    unit1.setText("ac");
                    ans(result, result1);
                } else if (position == 1) {
                    b = "Ares";
                    unit1.setText("a");
                    ans(result, result1);
                } else if (position == 2) {
                    b = "Hectares";
                    unit1.setText("ha");
                    ans(result, result1);
                } else if (position == 3) {
                    b = "Square centimetres";
                    unit1.setText("cm²");
                    ans(result, result1);
                } else if (position == 4) {
                    b = "Square feet";
                    unit1.setText("ft²");
                    ans(result, result1);

                } else if (position == 5) {
                    b = "Square inches";
                    unit1.setText("in²");
                    ans(result, result1);

                } else if (position == 6) {
                    b = "Square metres";
                    unit1.setText("m²");
                    ans(result, result1);

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

    public void cont(String unit, EditText resultb) {
        if (unit.endsWith(".0")) {
            unit = unit.substring(0, unit.length() - 2);
        }
        resultb.setText(unit);
    }


    public void ans(EditText resulta, EditText resultb) {
        String text = a + b;
        Log.v("MainActivity", a + b);
        switch (text) {

            case "AcresAres":
                Double ans1 = Double.parseDouble(resulta.getText().toString());
                String cont1 = String.valueOf(ans1 * 40.468564224);
                cont(cont1, resultb);
                break;
            case "AcresHectares":
                Double ans2 = Double.parseDouble(resulta.getText().toString());
                String cont2 = String.valueOf(ans2 * 0.4046856422);
                cont(cont2, resultb);
                break;
            case "AcresSquare centimetres":
                Double ans3 = Double.parseDouble(resulta.getText().toString());
                String cont3 = String.valueOf(ans3 * 40468564.224);
                cont(cont3, resultb);
                break;
            case "AcresSquare feet":
                Double ans4 = Double.parseDouble(resulta.getText().toString());
                String cont4 = String.valueOf(ans4 * 43560);
                cont(cont4, resultb);
                break;
            case "AcresSquare inches":
                Double ans5 = Double.parseDouble(resulta.getText().toString());
                String cont5 = String.valueOf(ans5 * 6272640);
                cont(cont5, resultb);
                break;
            case "AcresSquare metres":
                Double ans11 = Double.parseDouble(resulta.getText().toString());
                String cont11 = String.valueOf(ans11 * 4046.8564224);
                cont(cont11, resultb);
                break;
            case "AresAcres":
                Double ans12 = Double.parseDouble(resulta.getText().toString());
                String cont12 = String.valueOf(ans12 * 0.0247105381);
                cont(cont12, resultb);
                break;
            case "AresHectares":
                Double ans13 = Double.parseDouble(resulta.getText().toString());
                String cont13 = String.valueOf(ans13 * 0.01);
                cont(cont13, resultb);
                break;
            case "AresSquare centimetres":
                Double ans14 = Double.parseDouble(resulta.getText().toString());
                String cont14 = String.valueOf(ans14 * 1000000);
                cont(cont14, resultb);
                break;
            case "AresSquare feet":
                Double ans15 = Double.parseDouble(resulta.getText().toString());
                String cont15 = String.valueOf(ans15 * 1076.391041671);
                cont(cont15, resultb);
                break;
            case "AresSquare inches":
                Double ans6 = Double.parseDouble(resulta.getText().toString());
                String cont6 = String.valueOf(ans6 * 155000.31000062);
                cont(cont6, resultb);
                break;
            case "AresSquare metres":
                Double ans7 = Double.parseDouble(resulta.getText().toString());
                String cont7 = String.valueOf(ans7 * 100);
                cont(cont7, resultb);
                break;
            case "HectaresAcres":
                Double ans8 = Double.parseDouble(resulta.getText().toString());
                String cont8 = String.valueOf(ans8 * 2.4710538147);
                cont(cont8, resultb);
                break;
            case "HectaresAres":
                Double ans9 = Double.parseDouble(resulta.getText().toString());
                String cont9 = String.valueOf(ans9 * 100);
                cont(cont9, resultb);
                break;
            case "HectaresSquare centimetres":
                Double ans10 = Double.parseDouble(resulta.getText().toString());
                String cont10 = String.valueOf(ans10 * 100000000);
                cont(cont10, resultb);
                break;
            case "HectaresSquare feet":
                Double ans16 = Double.parseDouble(resulta.getText().toString());
                String cont16 = String.valueOf(ans16 * 107639.10416709);
                cont(cont16, resultb);
                break;
            case "HectaresSquare inches":
                Double ans17 = Double.parseDouble(resulta.getText().toString());
                String cont17 = String.valueOf(ans17 * 15500031.000062);
                cont(cont17, resultb);
                break;
            case "HectaresSquare metres":
                Double ans18 = Double.parseDouble(resulta.getText().toString());
                String cont18 = String.valueOf(ans18 * 10000);
                cont(cont18, resultb);
                break;
            case "Square centimetresArces":
                Double ans19 = Double.parseDouble(resulta.getText().toString());
                String cont19 = String.valueOf(ans19 * 2.47105381E-8);
                cont(cont19, resultb);
                break;
            case "Square centimetresAres":
                Double ans20 = Double.parseDouble(resulta.getText().toString());
                String cont20 = String.valueOf(ans20 * 0.000001);
                cont(cont20, resultb);
                break;
            case "Square centimetresHectares":
                Double ans21 = Double.parseDouble(resulta.getText().toString());
                String cont21 = String.valueOf(ans21 * 0.00000001);
                cont(cont21, resultb);
                break;
            case "Square centimetresSquare feet":
                Double ans22 = Double.parseDouble(resulta.getText().toString());
                String cont22 = String.valueOf(ans22 * 0.001076391);
                cont(cont22, resultb);
                break;
            case "Square centimetresSquare inches":
                Double ans23 = Double.parseDouble(resulta.getText().toString());
                String cont23 = String.valueOf(ans23 * 0.15500031);
                cont(cont23, resultb);
                break;
            case "Square centimetresSquare metres":
                Double ans24 = Double.parseDouble(resulta.getText().toString());
                String cont24 = String.valueOf(ans24 * 0.0001);
                cont(cont24, resultb);
                break;
            case "Square feetAcres":
                Double ans25 = Double.parseDouble(resulta.getText().toString());
                String cont25 = String.valueOf(ans25 * 0.0000229568);
                cont(cont25, resultb);
                break;
            case "Square feetAres":
                Double ans26 = Double.parseDouble(resulta.getText().toString());
                String cont26 = String.valueOf(ans26 * 0.0009290304);
                cont(cont26, resultb);
                break;
            case "Square feetHectares":
                Double ans27 = Double.parseDouble(resulta.getText().toString());
                String cont27 = String.valueOf(ans27 * 0.0000092903);
                cont(cont27, resultb);
                break;
            case "Square feetSquare centimetres":
                Double ans28 = Double.parseDouble(resulta.getText().toString());
                String cont28 = String.valueOf(ans28 * 929.0304);
                cont(cont28, resultb);
                break;
            case "Square feetSquare inches":
                Double ans29 = Double.parseDouble(resulta.getText().toString());
                String cont29 = String.valueOf(ans29 * 144);
                cont(cont29, resultb);
                break;
            case "Square feetSquare metres":
                Double ans30 = Double.parseDouble(resulta.getText().toString());
                String cont30 = String.valueOf(ans30 * 0.09290304);
                cont(cont30, resultb);
                break;
            case "Square inchesAcres":
                Double ans31 = Double.parseDouble(resulta.getText().toString());
                String cont31 = String.valueOf(ans31 * 1.59422508E-7);
                cont(cont31, resultb);
                break;
            case "Square inchesAres":
                Double ans32 = Double.parseDouble(resulta.getText().toString());
                String cont32 = String.valueOf(ans32 * 0.0000064516);
                cont(cont32, resultb);
                break;
            case "Square inchesHectares":
                Double ans33 = Double.parseDouble(resulta.getText().toString());
                String cont33 = String.valueOf(ans33 * 0.0000000645);
                cont(cont33, resultb);
                break;
            case "Square inchesSquare centimetres":
                Double ans34 = Double.parseDouble(resulta.getText().toString());
                String cont34 = String.valueOf(ans34 * 6.4516);
                cont(cont34, resultb);
                break;
            case "Square inchesSquare feet":
                Double ans35 = Double.parseDouble(resulta.getText().toString());
                String cont35 = String.valueOf(ans35 * 0.0069444444);
                cont(cont35, resultb);
                break;

            case "Square inchesSquare metres":
                Double ans36 = Double.parseDouble(resulta.getText().toString());
                String cont36 = String.valueOf(ans36 * 0.00064516);
                cont(cont36, resultb);
                break;
            case "Square metresAcres":
                Double ans37 = Double.parseDouble(resulta.getText().toString());
                String cont37 = String.valueOf(ans37 * 0.0002471054);
                cont(cont37, resultb);
                break;
            case "Square metresAres":
                Double ans38 = Double.parseDouble(resulta.getText().toString());
                String cont38 = String.valueOf(ans38 * 0.01);
                cont(cont38, resultb);
                break;
            case "Square metresHectares":
                Double ans39 = Double.parseDouble(resulta.getText().toString());
                String cont39 = String.valueOf(ans39 * 0.0001);
                cont(cont39, resultb);
                break;
            case "Square metresSquare centimetres":
                Double ans40 = Double.parseDouble(resulta.getText().toString());
                String cont40 = String.valueOf(ans40 * 10000);
                cont(cont40, resultb);
                break;
            case "Square metresSquare feet":
                Double ans41 = Double.parseDouble(resulta.getText().toString());
                String cont41 = String.valueOf(ans41 * 10.7639104167);
                cont(cont41, resultb);
                break;
            case "Square metresSquare inches":
                Double ans42 = Double.parseDouble(resulta.getText().toString());
                String cont42 = String.valueOf(ans42 * 1550.0031000062);
                cont(cont42, resultb);
                break;


            case "AcresAcres":
            case "AresAres":
            case "HectaresHectares":
            case "Square centimetresSquare centimetres":
            case "Square feetSquare feet":
            case "Square inchesSquare inches":
            case "Square metresSquare metres":
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

