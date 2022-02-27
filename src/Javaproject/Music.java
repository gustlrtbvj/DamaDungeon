package Javaproject;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class Music {
	File bgm, abs;
	AudioInputStream stream;
	AudioFormat format;
	DataLine.Info info;
	Clip clip;
	
	public void ASingularStrike() {
	
//		bgm = new File("music/miniStrike.wav");
		bgm = new File("music");
		abs = new File(bgm.getAbsoluteFile()+"/miniStrike.wav");
		
		try {
			stream = AudioSystem.getAudioInputStream(abs.getAbsoluteFile());
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public Clip BattleBrothers() {
//		bgm = new File("music/BattleBrotherswav.wav");
		
		bgm = new File("music");
		abs = new File(bgm.getAbsoluteFile()+"/BattleBrotherswav.wav");
		
		try {
			stream = AudioSystem.getAudioInputStream(abs.getAbsoluteFile());
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.loop(10);
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
		return clip;
	}

	public void AirCut() {

//		bgm = new File("music/AirCut.wav");

		bgm = new File("music");
		abs = new File(bgm.getAbsoluteFile()+"/AirCut.wav");
	
		try {
			stream = AudioSystem.getAudioInputStream(abs.getAbsoluteFile());
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void Bloody() {
	
//		bgm = new File("music/Bloody.wav");
		
		bgm = new File("music");
		abs = new File(bgm.getAbsoluteFile()+"/Bloody.wav");
	
		try {
			stream = AudioSystem.getAudioInputStream(abs.getAbsoluteFile());
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void Fireball() {

		bgm = new File("music");
		abs = new File(bgm.getAbsoluteFile()+"/fireBall.wav");

		try {
			stream = AudioSystem.getAudioInputStream(abs.getAbsoluteFile());
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void Determination() {

		bgm = new File("music");
		abs = new File(bgm.getAbsoluteFile()+"/shrineofenirhs.wav");

		try {
			stream = AudioSystem.getAudioInputStream(abs.getAbsoluteFile());
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void gunshot1() {

		bgm = new File("music");
		abs = new File(bgm.getAbsoluteFile()+"/gunshot.wav");


		try {
			stream = AudioSystem.getAudioInputStream(abs.getAbsoluteFile());
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void gunshot2() {

		bgm = new File("music");
		abs = new File(bgm.getAbsoluteFile()+"/524912__andrest2003__gunshot-pitch-a.wav");

		try {
			stream = AudioSystem.getAudioInputStream(abs.getAbsoluteFile());
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void ice() {

		bgm = new File("music");
		abs = new File(bgm.getAbsoluteFile()+"/ice.wav");

		try {
			stream = AudioSystem.getAudioInputStream(abs.getAbsoluteFile());
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void warcry() {

		bgm = new File("music");
		abs = new File(bgm.getAbsoluteFile()+"/shout1.wav");
		
		try {
			stream = AudioSystem.getAudioInputStream(abs.getAbsoluteFile());
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void enemyDeath() {

		bgm = new File("music");
		abs = new File(bgm.getAbsoluteFile()+"/death1.wav");

		try {
			stream = AudioSystem.getAudioInputStream(abs.getAbsoluteFile());
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}
	}

	public void Heal() {

	
		bgm = new File("music");
		abs = new File(bgm.getAbsoluteFile()+"/refill.wav");

		try {
			stream = AudioSystem.getAudioInputStream(abs.getAbsoluteFile());
			format = stream.getFormat();
			info = new DataLine.Info(Clip.class, format);
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(stream);
			clip.start();
		} catch (Exception e) {
			System.out.println("err : " + e);
		}

	}

}