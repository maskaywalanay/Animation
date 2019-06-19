package rehat.malam.vroh;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.animation.*;
import android.view.*;
import android.view.View.*;

public class MainActivity extends Activity 
{
	// konstruktor
	Button btn;
	TextView txt;
	Animation anims;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		// Menemukan objek text dan tombol dengan id
		btn = (Button)findViewById(R.id.btnClick);
		txt = (TextView)findViewById(R.id.txt);
		
		btn.setOnClickListener(new View.OnClickListener()
			{

				@Override
				public void onClick(View p1)
				{
					// Membuat animasi jatuh atu drag
					TranslateAnimation animz = new TranslateAnimation(0, 0, 0, 1000);
					animz.setDuration(1000);
					txt.startAnimation(animz);
				}
				
			
		});
		
		
		
    }
}
