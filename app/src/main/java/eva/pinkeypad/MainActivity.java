package eva.pinkeypad;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.util.Log;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn[] = new Button[11];
    EditText edittext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn[0] = (Button)findViewById(R.id.btn1);
        btn[1] = (Button)findViewById(R.id.btn2);
        btn[2] = (Button)findViewById(R.id.btn3);
        btn[3] = (Button)findViewById(R.id.btn4);
        btn[4] = (Button)findViewById(R.id.btn5);
        btn[5] = (Button)findViewById(R.id.btn6);
        btn[6] = (Button)findViewById(R.id.btn7);
        btn[7] = (Button)findViewById(R.id.btn8);
        btn[8] = (Button)findViewById(R.id.btn9);
        btn[9] = (Button)findViewById(R.id.btn0);
        btn[10] = (Button)findViewById(R.id.btnclear);

       for(int i = 0; i < 11; i++){
           btn[i].setOnClickListener(this);
       }

    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btn1:
                addtoarray("1");
                break;
            case R.id.btn2:
                addtoarray("2");
                break;
            case R.id.btn3:
                addtoarray("3");
                break;
            case R.id.btn4:
                addtoarray("4");
                break;
            case R.id.btn5:
                addtoarray("5");
                break;
            case R.id.btn6:
                addtoarray("6");
                break;
            case R.id.btn7:
                addtoarray("7");
                break;
            case R.id.btn8:
                addtoarray("8");
                break;
            case R.id.btn9:
                addtoarray("9");
                break;
            case R.id.btn0:
                addtoarray("0");
                break;
            case R.id.btnclear:
                edittext = (EditText)findViewById(R.id.edittext);
                edittext.setText("");
                break;
        }
    }

    public void addtoarray(String nums){
        edittext = (EditText)findViewById(R.id.edittext);
        edittext.append(nums);
    }

    /**@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}
