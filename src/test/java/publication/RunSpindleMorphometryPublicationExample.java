package publication;

import de.embl.cba.spindle3d.command.Spindle3DProcessFileCommand;
import net.imagej.ImageJ;
import net.imglib2.type.numeric.RealType;

import java.io.File;

public class RunSpindleMorphometryPublicationExample
{
	public static < R extends RealType< R > > void main( String[] args )
	{
		final ImageJ ij = new ImageJ();
		ij.ui().showUI();

		final Spindle3DProcessFileCommand< R > command = new Spindle3DProcessFileCommand<>();
		command.opService = ij.op();
		command.scriptService = ij.script();

		// Spindle touching objects
		command.inputImageFile = new File("/Users/tischer/Documents/spindle3d/src/test/resources/publication/20201209_R1E309_TubGFP_DM1a_KATNA1_D0_011-3.tif" );

		command.outputDirectory = new File( "/Users/tischer/Desktop/Desktop/kletter" );
		command.spindleChannelIndexOneBased = 1;
		command.dnaChannelIndexOneBased = 2;
		command.showIntermediateImages = false;
		command.showIntermediatePlots = false;
		command.saveResults = true;
		command.run();
	}
}
