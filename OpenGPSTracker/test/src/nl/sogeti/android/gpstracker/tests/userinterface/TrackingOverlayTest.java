package nl.sogeti.android.gpstracker.tests.userinterface;

import junit.framework.Assert;
import nl.sogeti.android.gpstracker.viewer.map.overlay.SegmentRendering;
import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;

public class TrackingOverlayTest extends AndroidTestCase
{


   @Override
   protected void setUp()
   {
//      mTrackingOverlay = new SegmentOverlay( getContext(), null, SegmentOverlay.DRAW_CALCULATED, 36d, null );
   }
   
   @SmallTest
   public void testExtendDoubleNegative()
   {
      int extention = SegmentRendering.extendPoint(-9, -4 );
      Assert.assertEquals( "Extension should be", 1, extention);
   }
   
   @SmallTest
   public void testExtendDoubleFirstNegative()
   {
      int extention = SegmentRendering.extendPoint(-4, 9 );
      Assert.assertEquals( "Extension should be", 22, extention);
   }

   
   @SmallTest
   public void testExtendDoublePositive()
   {
      int extention = SegmentRendering.extendPoint(9, 16 );
      Assert.assertEquals( "Extension should be", 23, extention);
   }
   
   @SmallTest
   public void testExtendDoublePositiveBack()
   {
      int extention = SegmentRendering.extendPoint(16, 9 );
      Assert.assertEquals( "Extension should be", 2, extention);
   }
   
   @SmallTest
   public void testExtendDoubleSecondNegativeBack()
   {
      int extention = SegmentRendering.extendPoint(9, -4 );
      Assert.assertEquals( "Extension should be", -17, extention);
   }
   
   @SmallTest
   public void testExtendDoubleNegativeBack()
   {
      int extention = SegmentRendering.extendPoint(-4, -16 );
      Assert.assertEquals( "Extension should be", -28, extention);
   }
   
}
