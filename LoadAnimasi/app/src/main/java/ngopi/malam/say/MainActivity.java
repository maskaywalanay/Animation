package ngopi.malam.say;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.animation.*;
import android.view.*;

public class MainActivity extends Activity 
{
	// konstruktor
	Button btn;
	TextView txt;
	Animation aniz, anu;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		
		// Menemukan Objek layout 
        setContentView(R.layout.main);
		
		// Memuat animasi dari folder anim
		aniz = AnimationUtils.loadAnimation(this,R.anim.zoom_enter);
		aniz.setDuration(700);
		anu = AnimationUtils.loadAnimation(this,R.anim.zoom_exit);
		anu.setDuration(900);
		
		// Menemukan Objek Dengan ID 
		btn = (Button)findViewById(R.id.onclick);
		txt = (TextView)findViewById(R.id.targetnya);
		
		btn.setOnClickListener(new View.OnClickListener()
			{
				@Override
				public void onClick(View p1)
				{
					// text yang akan di beri animasi
					txt.setText("Animasi Zoom Enter Dari Folder Anim");
					txt.setSelected(true);
					txt.startAnimation(aniz);
					
				}
		});
		
		// Aksi dengan Menahan tombol 
		btn.setOnLongClickListener(new View.OnLongClickListener()
			{

				@Override
				public boolean onLongClick(View p1)
				{
					txt.setAnimation(anu);
					return true;
				}
				
			
		});
    }
}
