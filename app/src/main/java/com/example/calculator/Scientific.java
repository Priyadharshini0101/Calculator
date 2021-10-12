package com.example.calculator;


import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

//Scientific class extends to fragment
public class Scientific extends Fragment {
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bplus, bminus, bmul, bdiv, bmod, bequal, bdot, bclear, bneg, bBracket, bsin, bcos, btan, bsquare, btenpowerx, bExp, blog, be, bxpowery, bmodulo, broot, bpi, bfactorial;
    private ImageButton bBackspace;
    private ImageButton bswap;
    private boolean negative = true;
    private boolean bracket = true;
    private String text, text1;
    private boolean val = true, val1;
    private String string;
    private static double end;
    private String finalResult = "";
    String pi = "3.14159265";
    boolean rad = true;
    private boolean isReached = false, checked = true;
    private Object strTo;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)//For hide the keyboard code the required api
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {//Create view of  fragment lifecycle
        View rootView = inflater.inflate(R.layout.scientific, container, false);
        EditText result = (EditText) rootView.findViewById(R.id.EditView);
        result.setShowSoftInputOnFocus(false);
        TextView result1 = (TextView) rootView.findViewById(R.id.TextView);
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
        bplus = (Button) rootView.findViewById(R.id.plus);
        bminus = (Button) rootView.findViewById(R.id.minus);
        bmul = (Button) rootView.findViewById(R.id.multiply);
        bdiv = (Button) rootView.findViewById(R.id.divide);
        bmod = (Button) rootView.findViewById(R.id.modulus);
        bequal = (Button) rootView.findViewById(R.id.equal);
        bdot = (Button) rootView.findViewById(R.id.dot);
        bclear = (Button) rootView.findViewById(R.id.C);
        bBracket = (Button) rootView.findViewById(R.id.bracket);
        bneg = (Button) rootView.findViewById(R.id.negative);
        bBackspace = (ImageButton) rootView.findViewById(R.id.BackSpace);
        bsin = (Button) rootView.findViewById(R.id.sin);
        bcos = (Button) rootView.findViewById(R.id.cos);
        btan = (Button) rootView.findViewById(R.id.tan);
        blog = (Button) rootView.findViewById(R.id.log);
        be = (Button) rootView.findViewById(R.id.e);
        bxpowery = (Button) rootView.findViewById(R.id.xpowery);
        bsquare = ((Button) rootView.findViewById(R.id.square));
        bpi = (Button) rootView.findViewById(R.id.pi);
        bmodulo = (Button) rootView.findViewById(R.id.modulo);
        broot = (Button) rootView.findViewById(R.id.root);
        TextView brad = (TextView) rootView.findViewById(R.id.Radian);
        bswap = (ImageButton) rootView.findViewById(R.id.swap);

        // in onCreate method
        result.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Nothing
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //nothing
            }

            @Override
            public void afterTextChanged(Editable s) {
                // if edittext has 10chars & this is not called yet, add new line
                if(result.getText().length() == 15 && !isReached) {
                    Toast.makeText(getActivity(),"Cannot enter more 15 digits",Toast.LENGTH_SHORT).show();
                    isReached = true;
                }
                // if edittext has less than 10chars & boolean has changed, reset
                if(result.getText().length() < 15 && isReached) isReached = false;
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("0", result);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateText("1", result);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("2", result);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("3", result);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("4", result);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("5", result);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("6", result);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("7", result);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("8", result);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("9", result);
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("+", result);
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("-", result);
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("*", result);
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("/", result);
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText(".", result);
            }
        });
        bneg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text = result.getText().toString();

                if (negative) {
                    result.setText("-" + text);
                    negative = false;
                } else {
                    text = text.substring(1, text.length());
                    result.setText(text);
                    negative = true;
                }
            }
        });
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateText("%", result);
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                result1.setText("");
            }
        });
        bBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bracket) {
                    updateText("(", result);
                    bracket = false;
                } else {
                    updateText(")", result);
                    bracket = true;
                }
            }
        });
        bBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int cursorPos = result.getSelectionStart();
                int texlen = result.getText().length();
                if (texlen != 0 && cursorPos != 0) {
                    SpannableStringBuilder selection = (SpannableStringBuilder) result.getText();
                    selection.replace(cursorPos - 1, cursorPos, "");
                    result.setText(selection);
                    result.setSelection(cursorPos - 1);
                }
            }
        });
        brad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rad) {
                    brad.setText("Deg");
                    rad = false;
                } else {
                    brad.setText("Rad");
                    rad = true;
                }
            }
        });


        bswap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val) {
                    blog.setText("ln");
                    be.setText("e^x");
                    bsquare.setText("x³");
                    bxpowery.setText("y√x");
                    bpi.setText("1/x");
                    broot.setText("10^x");
                    bmodulo.setText("x!");
                    bsin.setText("sin-1");
                    bcos.setText("cos-1");
                    btan.setText("tan-1");
                    val = false;
                } else {
                    blog.setText("log");
                    be.setText("e");
                    bsquare.setText("x²");
                    bxpowery.setText("x^y");
                    bpi.setText("π");
                    broot.setText("√");
                    bmodulo.setText("|x|");
                    bsin.setText("sin");
                    bcos.setText("cos");
                    btan.setText("tan");
                    val = true;

                }
            }

        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val) {
                    updateText("sin(", result);
                } else {
                    updateText("asin(", result);
                }

            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val) {
                    updateText("cos(", result);
                } else {
                    updateText("acos(", result);
                }
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val) {
                    updateText("tan(", result);
                } else {
                    updateText("atan(", result);
                }
            }
        });
        bsquare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String end = (result.getText().toString());
                if (val) {
                    updateText("^(2)", result);
                } else {
                    updateText("^(3)", result);
                }
            }

        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val) {
                    updateText("log(", result);
                } else {
                    updateText("ln(", result);
                }

            }
        });
        bxpowery.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val) {
                    updateText("^", result);
                } else {
                    updateText("*sqrt(", result);
                }

            }
        }));
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val) {
                    updateText("e", result);
                } else {
                    updateText("e^(", result);
                }
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val) {
                    updateText("π", result);
                } else {
                    updateText("1/", result);
                }
            }
        });
        broot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val) {
                    updateText("sqrt(", result);
                } else {
                    updateText("10^(", result);
                }
            }
        });

        bmodulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (val) {
                    updateText("abs(", result);
                } else {
                    int d = Integer.parseInt(result.getText().toString());
                    Log.v("Scientific","Done1");
                    updateText("!",result);
                    Log.v("Scientific","Done3");
                    int ans=factorial(d);
                    Log.v("Scientific","Done2");
                    result1.setText(ans+"");




                }

            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                String userExp = result.getText().toString();
//                Expression exp = new Expression(userExp);
//                String resultd = String.valueOf(exp.calculate());
//                if (resultd.endsWith(".0"))
//                    resultd = resultd.substring(0, resultd.length() - 2);
//                }
//                result1.setText(resultd);
//                result.setSelection(result.length());
                String val1 = result.getText().toString();//getting value 5+5
                String replacedstr = val1.replace("÷", "/").replace("×", "*").replace("π","pi");//change divide and multiply symbols
                double resulta = eval(replacedstr);//passing "string" to eval function
                String resultb = String.valueOf(resulta);
                if (resultb == "0") {
                    result1.setText(" ");
                    result.setText(val1);
                } else if (resultb.endsWith(".0")) {
                    resultb = resultb.substring(0, resultb.length() - 2);
                    result1.setText(String.valueOf(resultb));
                    result.setText(val1);
                } else {
                    result1.setText(resultb);
                    result.setText(val1);
                }
            }
        });

        result.setSelection(result.getText().length());
        return rootView;
    }

    void updateText(String str, EditText resulta) {
        if(!isReached) {
            String oldStr = resulta.getText().toString();
            int cursorPos = resulta.getSelectionStart();
            String leftStr = oldStr.substring(0, cursorPos);
            String rightStr = oldStr.substring(cursorPos);
            resulta.setText(String.format("%s%s%s", leftStr, str, rightStr));
            resulta.setSelection(cursorPos + str.length());
        }

    }


    public int factorial(int n) {
        Log.v("Scientific","Done");
        return (n == 1 || n == 0) ? 1 : n*factorial(n - 1);

    }

    public double eval(final String str) {//passed stirng is the final one to start eval
        return new Object() {//
            int pos = -1, ch;//pos(current) ch(current char)

            //current position is less than the strlenght check and assign ch =charAtpos or return -1
            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();//call to parseExpression
                if (pos < str.length()) x = 0;//out of range
                return x;
            }
            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor
//by bodmas
            double parseExpression() {
                double x = parseTerm();//call to parseTerm
                for (; ; ) {//infinte loop
                    if (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();//call to parseFactor
                for (; ; ) {//infinite loop
                    if (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    if(eat('%')) x%=parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus

                double x = 0;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { //values
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();//values on which the operator
                    x = Double.parseDouble(str.substring(startPos, this.pos));//parsing to double type
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();//function that is operator on which the operands are to be performed
                    String func = str.substring(startPos, this.pos);//assigning it to the String
                    x = parseFactor();
                    if (rad) {
                        if (func.equals("sqrt")) x = Math.sqrt(x);
                        else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                        else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                        else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                        else if (func.equals("log")) x = Math.log10(x);
                        else if (func.equals("ln")) x = Math.log(x);
                        else if (func.equals("asin")) x = Math.asin(x);
                        else if (func.equals("acos")) x = Math.acos(x);
                        else if (func.equals("atan")) x = Math.atan(x);
                        else if (func.equals("abs")) x = Math.abs(x);
                        else if (func.equals("10^")) x = Math.exp(x);
                        else if (func.equals("e")) x = Math.E;
                        else if (func.equals("pi")) x = Math.PI;
                        else x = 0;

                    } else {
                        if (func.equals("sqrt")) x = Math.sqrt(x);
                        else if (func.equals("sin")) x = Math.sin(x);
                        else if (func.equals("cos")) x = Math.cos(x);
                        else if (func.equals("tan")) x = Math.tan(x);
                        else if (func.equals("log")) x = Math.log10(x);
                        else if (func.equals("ln")) x = Math.log(x);
                        else if (func.equals("asin")) x = Math.asin(Math.toDegrees(x));
                        else if (func.equals("acos")) x = Math.acos(Math.toDegrees(x));
                        else if (func.equals("atan")) x = Math.atan(Math.toDegrees(x));
                        else if (func.equals("abs")) x = Math.abs(x);
                        else if (func.equals("10^")) x = Math.exp(x);
                        else if (func.equals("e")) x = Math.E;
                        else if(func.equals("pi")) x=Math.PI;
                        else if (func.equals(" ")) x = 0;
                        else x = 0;
                    }
                }
                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation

                return x;
            }


        }.parse();

    }
}




