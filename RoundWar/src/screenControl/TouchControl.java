package screenControl;

import Entities.MainCharacter;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad;
import com.badlogic.gdx.scenes.scene2d.ui.Touchpad.TouchpadStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Widget;

public class TouchControl extends Touchpad{

    private static TouchpadStyle touchpadStyle;
    private static Skin touchpadSkin;
    MainCharacter mainpj;
 
    public TouchControl(MainCharacter mainpj){//, Stage hudStage) {
    	super(10, TouchControl.getTouchPadStyle());
    	this.mainpj = mainpj;
    	
        setBounds(0, 0, 128, 128);
        
        //Add TouchPad to stage
        //hudStage.addActor(touchpad);
    }
    
    private static TouchpadStyle getTouchPadStyle(){
    	touchpadSkin = new Skin();
        touchpadSkin.add("touchBackground", new Texture("skin/touchBackground.png"));
        touchpadSkin.add("touchKnob", new Texture("skin/touchKnob.png"));
        
        touchpadStyle = new TouchpadStyle();
        touchpadStyle.background = touchpadSkin.getDrawable("touchBackground");
        touchpadStyle.knob = touchpadSkin.getDrawable("touchKnob");
        
        return touchpadStyle;
    }
    
    public void dispose() {
    	touchpadSkin.dispose();
    }
    
    @Override
	public void draw(SpriteBatch batch, float parentAlpha) {
    	super.draw(batch, parentAlpha);
	}
    
    @Override
    public void act (float delta) {
    	super.act(delta);
    	if(isTouched())
    		mainpj.move(getKnobPercentX(), getKnobPercentY());
    }
    
    public void setPosition(float posX, float posY){
    	super.setPosition(posX, posY);
    }
}