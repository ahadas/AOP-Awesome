package cool;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class transform  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constMarkerAnno2;

  protected static IStrategoTerm constTypeName14;

  protected static IStrategoTerm constId38;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm constCons26;

  protected static IStrategoTerm constCons25;

  protected static IStrategoTerm constMarkerAnno1;

  protected static IStrategoTerm constTypeName13;

  protected static IStrategoTerm constId37;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constId36;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm constCons24;

  protected static IStrategoTerm constTry0;

  protected static IStrategoTerm constCons23;

  protected static IStrategoTerm constCatch0;

  protected static IStrategoTerm constBlock2;

  protected static IStrategoTerm constParam1;

  protected static IStrategoTerm constId35;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm constClassOrInterfaceType3;

  protected static IStrategoTerm constTypeName12;

  protected static IStrategoTerm constId34;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm constBlock1;

  protected static IStrategoTerm constCons22;

  protected static IStrategoTerm constExprStm1;

  protected static IStrategoTerm constInvoke4;

  protected static IStrategoTerm constMethod5;

  protected static IStrategoTerm constMethodName5;

  protected static IStrategoTerm constId33;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm constMethod4;

  protected static IStrategoTerm constMethodName4;

  protected static IStrategoTerm constTypeName11;

  protected static IStrategoTerm constId32;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constCons21;

  protected static IStrategoTerm constExprStm0;

  protected static IStrategoTerm constInvoke3;

  protected static IStrategoTerm constMethod3;

  protected static IStrategoTerm constMethodName3;

  protected static IStrategoTerm constId31;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constId30;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm constTypeName10;

  protected static IStrategoTerm constId29;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm constCons20;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constCons19;

  protected static IStrategoTerm constTypeImportOnDemandDec1;

  protected static IStrategoTerm constPackageName1;

  protected static IStrategoTerm constCons18;

  protected static IStrategoTerm constId28;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constCons17;

  protected static IStrategoTerm constId27;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constCons16;

  protected static IStrategoTerm constTypeImportOnDemandDec0;

  protected static IStrategoTerm constPackageName0;

  protected static IStrategoTerm constCons15;

  protected static IStrategoTerm constId26;

  protected static IStrategoTerm constCons14;

  protected static IStrategoTerm constId25;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constCons13;

  protected static IStrategoTerm constTypeImportDec0;

  protected static IStrategoTerm constTypeName9;

  protected static IStrategoTerm constPackageOrTypeName3;

  protected static IStrategoTerm constId24;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constPackageOrTypeName2;

  protected static IStrategoTerm constId23;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm constPackageOrTypeName1;

  protected static IStrategoTerm constId22;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm constPackageOrTypeName0;

  protected static IStrategoTerm constId21;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm constTypeName8;

  protected static IStrategoTerm constId20;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm constVoid0;

  protected static IStrategoTerm constTypeName7;

  protected static IStrategoTerm constId19;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm constId18;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constElemValPair0;

  protected static IStrategoTerm constLit4;

  protected static IStrategoTerm constString0;

  protected static IStrategoTerm constId17;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm constTypeName6;

  protected static IStrategoTerm constId16;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constId15;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constTypeName5;

  protected static IStrategoTerm constId14;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm constCons12;

  protected static IStrategoTerm constMarkerAnno0;

  protected static IStrategoTerm constTypeName4;

  protected static IStrategoTerm constId13;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm constCons11;

  protected static IStrategoTerm constPublic0;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm constCons10;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm constNewInstance0;

  protected static IStrategoTerm constClassOrInterfaceType2;

  protected static IStrategoTerm constTypeName3;

  protected static IStrategoTerm constId12;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constClassOrInterfaceType1;

  protected static IStrategoTerm constMethodDec0;

  protected static IStrategoTerm constBlock0;

  protected static IStrategoTerm constCons9;

  protected static IStrategoTerm constReturn0;

  protected static IStrategoTerm constSome0;

  protected static IStrategoTerm constLazyAnd0;

  protected static IStrategoTerm constNot0;

  protected static IStrategoTerm constInvoke2;

  protected static IStrategoTerm constCons8;

  protected static IStrategoTerm constInvoke1;

  protected static IStrategoTerm constMethod2;

  protected static IStrategoTerm constMethodName2;

  protected static IStrategoTerm constId11;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constAmbName1;

  protected static IStrategoTerm constId10;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm constMethod1;

  protected static IStrategoTerm constMethodName1;

  protected static IStrategoTerm constId9;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm constGt0;

  protected static IStrategoTerm constInvoke0;

  protected static IStrategoTerm constMethod0;

  protected static IStrategoTerm constMethodName0;

  protected static IStrategoTerm constId8;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm constAmbName0;

  protected static IStrategoTerm constMethodDecHead0;

  protected static IStrategoTerm constCons7;

  protected static IStrategoTerm constParam0;

  protected static IStrategoTerm constId7;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constTypeName2;

  protected static IStrategoTerm constId6;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm constId5;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm constCons6;

  protected static IStrategoTerm constCons5;

  protected static IStrategoTerm constStatic0;

  protected static IStrategoTerm constCons4;

  protected static IStrategoTerm constSynchronized0;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm const27;

  protected static IStrategoTerm constCons3;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm constId4;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm constId3;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm constTypeName1;

  protected static IStrategoTerm constId2;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm constCons2;

  protected static IStrategoTerm constPrivate0;

  protected static IStrategoTerm constLit3;

  protected static IStrategoTerm constNull0;

  protected static IStrategoTerm constClassOrInterfaceType0;

  protected static IStrategoTerm constTypeName0;

  protected static IStrategoTerm constId1;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm constLit2;

  protected static IStrategoTerm constDeci1;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm constLit1;

  protected static IStrategoTerm constBool0;

  protected static IStrategoTerm constLit0;

  protected static IStrategoTerm constDeci0;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm constCons1;

  protected static IStrategoTerm constExprName0;

  protected static IStrategoTerm constId0;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm constShort0;

  protected static IStrategoTerm constChar0;

  protected static IStrategoTerm constByte0;

  protected static IStrategoTerm constFloat0;

  protected static IStrategoTerm constInt0;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm constBoolean0;

  protected static IStrategoTerm constLong0;

  protected static IStrategoTerm constDouble0;

  protected static IStrategoTerm constTrue0;

  protected static IStrategoTerm constFalse0;

  protected static IStrategoTerm constNone0;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm constCons0;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm const6;

  protected static IStrategoTerm const5;

  protected static IStrategoTerm const4;

  protected static IStrategoTerm const3;

  protected static IStrategoTerm const2;

  protected static IStrategoTerm const1;

  protected static IStrategoTerm const0;

  protected static IStrategoTerm constNil0;

  public static IStrategoConstructor _consConc_2;

  protected static IStrategoConstructor _consCatch_2;

  protected static IStrategoConstructor _consTry_2;

  protected static IStrategoConstructor _consExprStm_1;

  protected static IStrategoConstructor _consClassDec_2;

  protected static IStrategoConstructor _consPackageName_1;

  protected static IStrategoConstructor _consTypeImportOnDemandDec_1;

  protected static IStrategoConstructor _consTypeImportDec_1;

  protected static IStrategoConstructor _consCompilationUnit_3;

  protected static IStrategoConstructor _consVoid_0;

  protected static IStrategoConstructor _consElemValArrayInit_1;

  protected static IStrategoConstructor _consClassDecHead_5;

  protected static IStrategoConstructor _consMarkerAnno_1;

  protected static IStrategoConstructor _consPublic_0;

  protected static IStrategoConstructor _consNewInstance_4;

  protected static IStrategoConstructor _consMethodName_2;

  protected static IStrategoConstructor _consStatic_0;

  protected static IStrategoConstructor _consSynchronized_0;

  protected static IStrategoConstructor _consAmbName_1;

  protected static IStrategoConstructor _consAmbName_2;

  protected static IStrategoConstructor _consSome_1;

  protected static IStrategoConstructor _consReturn_1;

  protected static IStrategoConstructor _consChars_1;

  protected static IStrategoConstructor _consString_1;

  protected static IStrategoConstructor _consElemValPair_2;

  protected static IStrategoConstructor _consPrivate_0;

  protected static IStrategoConstructor _consNull_0;

  protected static IStrategoConstructor _consLit_1;

  protected static IStrategoConstructor _consMethodName_1;

  protected static IStrategoConstructor _consMethod_1;

  protected static IStrategoConstructor _consInvoke_2;

  protected static IStrategoConstructor _consBool_1;

  protected static IStrategoConstructor _consDeci_1;

  protected static IStrategoConstructor _consFloat_1;

  protected static IStrategoConstructor _consChar_1;

  protected static IStrategoConstructor _consVarArityParam_3;

  protected static IStrategoConstructor _consParam_3;

  protected static IStrategoConstructor _consAnno_2;

  protected static IStrategoConstructor _consDeprMethodDecHead_7;

  protected static IStrategoConstructor _consMethodDecHead_6;

  protected static IStrategoConstructor _consCastRef_2;

  protected static IStrategoConstructor _consCastPrim_2;

  protected static IStrategoConstructor _consForEach_3;

  protected static IStrategoConstructor _consFor_4;

  protected static IStrategoConstructor _consDoWhile_2;

  protected static IStrategoConstructor _consWhile_2;

  protected static IStrategoConstructor _consAssertStm_2;

  protected static IStrategoConstructor _consAssertStm_1;

  protected static IStrategoConstructor _consIf_3;

  protected static IStrategoConstructor _consIf_2;

  protected static IStrategoConstructor _consLazyOr_2;

  protected static IStrategoConstructor _consLazyAnd_2;

  protected static IStrategoConstructor _consAssignOr_2;

  protected static IStrategoConstructor _consAssignExcOr_2;

  protected static IStrategoConstructor _consAssignAnd_2;

  protected static IStrategoConstructor _consAssignURightShift_2;

  protected static IStrategoConstructor _consAssignRightShift_2;

  protected static IStrategoConstructor _consAssignLeftShift_2;

  protected static IStrategoConstructor _consAssignMinus_2;

  protected static IStrategoConstructor _consAssignPlus_2;

  protected static IStrategoConstructor _consAssignRemain_2;

  protected static IStrategoConstructor _consAssignDiv_2;

  protected static IStrategoConstructor _consAssignMul_2;

  protected static IStrategoConstructor _consAssign_2;

  protected static IStrategoConstructor _consComplement_1;

  protected static IStrategoConstructor _consPlus_1;

  protected static IStrategoConstructor _consMinus_1;

  protected static IStrategoConstructor _consNot_1;

  protected static IStrategoConstructor _consPostDecr_1;

  protected static IStrategoConstructor _consPreDecr_1;

  protected static IStrategoConstructor _consPostIncr_1;

  protected static IStrategoConstructor _consPreIncr_1;

  protected static IStrategoConstructor _consURightShift_2;

  protected static IStrategoConstructor _consRightShift_2;

  protected static IStrategoConstructor _consLeftShift_2;

  protected static IStrategoConstructor _consRemain_2;

  protected static IStrategoConstructor _consDiv_2;

  protected static IStrategoConstructor _consMul_2;

  protected static IStrategoConstructor _consMinus_2;

  protected static IStrategoConstructor _consPlus_2;

  protected static IStrategoConstructor _consGtEq_2;

  protected static IStrategoConstructor _consGt_2;

  protected static IStrategoConstructor _consLtEq_2;

  protected static IStrategoConstructor _consLt_2;

  protected static IStrategoConstructor _consAnd_2;

  protected static IStrategoConstructor _consExcOr_2;

  protected static IStrategoConstructor _consOr_2;

  protected static IStrategoConstructor _consNotEq_2;

  protected static IStrategoConstructor _consEq_2;

  protected static IStrategoConstructor _consLocalVarDec_3;

  protected static IStrategoConstructor _consFieldDec_3;

  protected static IStrategoConstructor _consVarDec_2;

  protected static IStrategoConstructor _consVarDec_1;

  protected static IStrategoConstructor _consExprName_2;

  protected static IStrategoConstructor _consExprName_1;

  protected static IStrategoConstructor _consTrue_0;

  protected static IStrategoConstructor _consMethodDec_2;

  protected static IStrategoConstructor _consBlock_1;

  protected static IStrategoConstructor _consFalse_0;

  protected static IStrategoConstructor _consNone_0;

  protected static IStrategoConstructor _consClassBody_1;

  protected static IStrategoConstructor _consClassOrInterfaceType_2;

  protected static IStrategoConstructor _consArrayType_1;

  protected static IStrategoConstructor _consDouble_0;

  protected static IStrategoConstructor _consFloat_0;

  protected static IStrategoConstructor _consLong_0;

  protected static IStrategoConstructor _consInt_0;

  protected static IStrategoConstructor _consShort_0;

  protected static IStrategoConstructor _consBoolean_0;

  protected static IStrategoConstructor _consChar_0;

  protected static IStrategoConstructor _consByte_0;

  protected static IStrategoConstructor _consPackageOrTypeName_2;

  protected static IStrategoConstructor _consPackageOrTypeName_1;

  protected static IStrategoConstructor _consTypeName_1;

  protected static IStrategoConstructor _consId_1;

  protected static IStrategoConstructor _consTypeName_2;

  public static IStrategoConstructor _consMethodSignature_2;

  public static IStrategoConstructor _consSelfex_1;

  public static IStrategoConstructor _consMutex_1;

  public static IStrategoConstructor _consConditionDec_1;

  public static IStrategoConstructor _consMethodAdditions_4;

  public static IStrategoConstructor _consRequires_1;

  public static IStrategoConstructor _consOnEntry_1;

  public static IStrategoConstructor _consOnExit_1;

  public static IStrategoConstructor _consCoordinatorDec_2;

  public static IStrategoConstructor _consCoordinatorDecHead_1;

  public static IStrategoConstructor _consCoordinatorBody_1;

  public static Context init(Context context)
  { 
    synchronized(transform.class)
    { 
      if(isIniting)
        return null;
      try
      { 
        isIniting = true;
        ITermFactory termFactory = context.getFactory();
        if(constantFactory == null)
        { 
          initConstructors(termFactory);
          initConstants(termFactory);
        }
        if(initedContext == null || initedContext.get() != context)
        { 
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.java_front.Main.init(context);
          context.registerComponent("transform");
        }
        initedContext = new WeakReference<Context>(context);
        constantFactory = termFactory;
      }
      finally
      { 
        isIniting = false;
      }
      return context;
    }
  }

  public static Context init()
  { 
    return init(new Context());
  }

  public static void main(String args[])
  { 
    Context context = init();
    context.setStandAlone(true);
    try
    { 
      IStrategoTerm result;
      try
      { 
        result = context.invokeStrategyCLI(main_0_0.instance, "transform", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("transform" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
        context.printStackTrace();
        context.setStandAlone(false);
        System.exit(1);
      }
      else
      { 
        System.out.println(result);
        context.setStandAlone(false);
        System.exit(0);
      }
    }
    catch(StrategoExit exit)
    { 
      context.setStandAlone(false);
      System.exit(exit.getValue());
    }
  }

  public static IStrategoTerm mainNoExit(String ... args) throws StrategoExit
  { 
    return mainNoExit(new Context(), args);
  }

  public static IStrategoTerm mainNoExit(Context context, String ... args) throws StrategoExit
  { 
    try
    { 
      init(context);
      return context.invokeStrategyCLI(main_0_0.instance, "transform", args);
    }
    finally
    { 
      context.getIOAgent().closeAllFiles();
    }
  }

  public static Strategy getMainStrategy()
  { 
    return main_0_0.instance;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consCatch_2 = termFactory.makeConstructor("Catch", 2);
    _consTry_2 = termFactory.makeConstructor("Try", 2);
    _consExprStm_1 = termFactory.makeConstructor("ExprStm", 1);
    _consClassDec_2 = termFactory.makeConstructor("ClassDec", 2);
    _consPackageName_1 = termFactory.makeConstructor("PackageName", 1);
    _consTypeImportOnDemandDec_1 = termFactory.makeConstructor("TypeImportOnDemandDec", 1);
    _consTypeImportDec_1 = termFactory.makeConstructor("TypeImportDec", 1);
    _consCompilationUnit_3 = termFactory.makeConstructor("CompilationUnit", 3);
    _consVoid_0 = termFactory.makeConstructor("Void", 0);
    _consElemValArrayInit_1 = termFactory.makeConstructor("ElemValArrayInit", 1);
    _consClassDecHead_5 = termFactory.makeConstructor("ClassDecHead", 5);
    _consMarkerAnno_1 = termFactory.makeConstructor("MarkerAnno", 1);
    _consPublic_0 = termFactory.makeConstructor("Public", 0);
    _consNewInstance_4 = termFactory.makeConstructor("NewInstance", 4);
    _consMethodName_2 = termFactory.makeConstructor("MethodName", 2);
    _consStatic_0 = termFactory.makeConstructor("Static", 0);
    _consSynchronized_0 = termFactory.makeConstructor("Synchronized", 0);
    _consAmbName_1 = termFactory.makeConstructor("AmbName", 1);
    _consAmbName_2 = termFactory.makeConstructor("AmbName", 2);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consReturn_1 = termFactory.makeConstructor("Return", 1);
    _consChars_1 = termFactory.makeConstructor("Chars", 1);
    _consString_1 = termFactory.makeConstructor("String", 1);
    _consElemValPair_2 = termFactory.makeConstructor("ElemValPair", 2);
    _consPrivate_0 = termFactory.makeConstructor("Private", 0);
    _consNull_0 = termFactory.makeConstructor("Null", 0);
    _consLit_1 = termFactory.makeConstructor("Lit", 1);
    _consMethodName_1 = termFactory.makeConstructor("MethodName", 1);
    _consMethod_1 = termFactory.makeConstructor("Method", 1);
    _consInvoke_2 = termFactory.makeConstructor("Invoke", 2);
    _consBool_1 = termFactory.makeConstructor("Bool", 1);
    _consDeci_1 = termFactory.makeConstructor("Deci", 1);
    _consFloat_1 = termFactory.makeConstructor("Float", 1);
    _consChar_1 = termFactory.makeConstructor("Char", 1);
    _consVarArityParam_3 = termFactory.makeConstructor("VarArityParam", 3);
    _consParam_3 = termFactory.makeConstructor("Param", 3);
    _consAnno_2 = termFactory.makeConstructor("Anno", 2);
    _consDeprMethodDecHead_7 = termFactory.makeConstructor("DeprMethodDecHead", 7);
    _consMethodDecHead_6 = termFactory.makeConstructor("MethodDecHead", 6);
    _consCastRef_2 = termFactory.makeConstructor("CastRef", 2);
    _consCastPrim_2 = termFactory.makeConstructor("CastPrim", 2);
    _consForEach_3 = termFactory.makeConstructor("ForEach", 3);
    _consFor_4 = termFactory.makeConstructor("For", 4);
    _consDoWhile_2 = termFactory.makeConstructor("DoWhile", 2);
    _consWhile_2 = termFactory.makeConstructor("While", 2);
    _consAssertStm_2 = termFactory.makeConstructor("AssertStm", 2);
    _consAssertStm_1 = termFactory.makeConstructor("AssertStm", 1);
    _consIf_3 = termFactory.makeConstructor("If", 3);
    _consIf_2 = termFactory.makeConstructor("If", 2);
    _consLazyOr_2 = termFactory.makeConstructor("LazyOr", 2);
    _consLazyAnd_2 = termFactory.makeConstructor("LazyAnd", 2);
    _consAssignOr_2 = termFactory.makeConstructor("AssignOr", 2);
    _consAssignExcOr_2 = termFactory.makeConstructor("AssignExcOr", 2);
    _consAssignAnd_2 = termFactory.makeConstructor("AssignAnd", 2);
    _consAssignURightShift_2 = termFactory.makeConstructor("AssignURightShift", 2);
    _consAssignRightShift_2 = termFactory.makeConstructor("AssignRightShift", 2);
    _consAssignLeftShift_2 = termFactory.makeConstructor("AssignLeftShift", 2);
    _consAssignMinus_2 = termFactory.makeConstructor("AssignMinus", 2);
    _consAssignPlus_2 = termFactory.makeConstructor("AssignPlus", 2);
    _consAssignRemain_2 = termFactory.makeConstructor("AssignRemain", 2);
    _consAssignDiv_2 = termFactory.makeConstructor("AssignDiv", 2);
    _consAssignMul_2 = termFactory.makeConstructor("AssignMul", 2);
    _consAssign_2 = termFactory.makeConstructor("Assign", 2);
    _consComplement_1 = termFactory.makeConstructor("Complement", 1);
    _consPlus_1 = termFactory.makeConstructor("Plus", 1);
    _consMinus_1 = termFactory.makeConstructor("Minus", 1);
    _consNot_1 = termFactory.makeConstructor("Not", 1);
    _consPostDecr_1 = termFactory.makeConstructor("PostDecr", 1);
    _consPreDecr_1 = termFactory.makeConstructor("PreDecr", 1);
    _consPostIncr_1 = termFactory.makeConstructor("PostIncr", 1);
    _consPreIncr_1 = termFactory.makeConstructor("PreIncr", 1);
    _consURightShift_2 = termFactory.makeConstructor("URightShift", 2);
    _consRightShift_2 = termFactory.makeConstructor("RightShift", 2);
    _consLeftShift_2 = termFactory.makeConstructor("LeftShift", 2);
    _consRemain_2 = termFactory.makeConstructor("Remain", 2);
    _consDiv_2 = termFactory.makeConstructor("Div", 2);
    _consMul_2 = termFactory.makeConstructor("Mul", 2);
    _consMinus_2 = termFactory.makeConstructor("Minus", 2);
    _consPlus_2 = termFactory.makeConstructor("Plus", 2);
    _consGtEq_2 = termFactory.makeConstructor("GtEq", 2);
    _consGt_2 = termFactory.makeConstructor("Gt", 2);
    _consLtEq_2 = termFactory.makeConstructor("LtEq", 2);
    _consLt_2 = termFactory.makeConstructor("Lt", 2);
    _consAnd_2 = termFactory.makeConstructor("And", 2);
    _consExcOr_2 = termFactory.makeConstructor("ExcOr", 2);
    _consOr_2 = termFactory.makeConstructor("Or", 2);
    _consNotEq_2 = termFactory.makeConstructor("NotEq", 2);
    _consEq_2 = termFactory.makeConstructor("Eq", 2);
    _consLocalVarDec_3 = termFactory.makeConstructor("LocalVarDec", 3);
    _consFieldDec_3 = termFactory.makeConstructor("FieldDec", 3);
    _consVarDec_2 = termFactory.makeConstructor("VarDec", 2);
    _consVarDec_1 = termFactory.makeConstructor("VarDec", 1);
    _consExprName_2 = termFactory.makeConstructor("ExprName", 2);
    _consExprName_1 = termFactory.makeConstructor("ExprName", 1);
    _consTrue_0 = termFactory.makeConstructor("True", 0);
    _consMethodDec_2 = termFactory.makeConstructor("MethodDec", 2);
    _consBlock_1 = termFactory.makeConstructor("Block", 1);
    _consFalse_0 = termFactory.makeConstructor("False", 0);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consClassBody_1 = termFactory.makeConstructor("ClassBody", 1);
    _consClassOrInterfaceType_2 = termFactory.makeConstructor("ClassOrInterfaceType", 2);
    _consArrayType_1 = termFactory.makeConstructor("ArrayType", 1);
    _consDouble_0 = termFactory.makeConstructor("Double", 0);
    _consFloat_0 = termFactory.makeConstructor("Float", 0);
    _consLong_0 = termFactory.makeConstructor("Long", 0);
    _consInt_0 = termFactory.makeConstructor("Int", 0);
    _consShort_0 = termFactory.makeConstructor("Short", 0);
    _consBoolean_0 = termFactory.makeConstructor("Boolean", 0);
    _consChar_0 = termFactory.makeConstructor("Char", 0);
    _consByte_0 = termFactory.makeConstructor("Byte", 0);
    _consPackageOrTypeName_2 = termFactory.makeConstructor("PackageOrTypeName", 2);
    _consPackageOrTypeName_1 = termFactory.makeConstructor("PackageOrTypeName", 1);
    _consTypeName_1 = termFactory.makeConstructor("TypeName", 1);
    _consId_1 = termFactory.makeConstructor("Id", 1);
    _consTypeName_2 = termFactory.makeConstructor("TypeName", 2);
    _consMethodSignature_2 = termFactory.makeConstructor("MethodSignature", 2);
    _consSelfex_1 = termFactory.makeConstructor("Selfex", 1);
    _consMutex_1 = termFactory.makeConstructor("Mutex", 1);
    _consConditionDec_1 = termFactory.makeConstructor("ConditionDec", 1);
    _consMethodAdditions_4 = termFactory.makeConstructor("MethodAdditions", 4);
    _consRequires_1 = termFactory.makeConstructor("Requires", 1);
    _consOnEntry_1 = termFactory.makeConstructor("OnEntry", 1);
    _consOnExit_1 = termFactory.makeConstructor("OnExit", 1);
    _consCoordinatorDec_2 = termFactory.makeConstructor("CoordinatorDec", 2);
    _consCoordinatorDecHead_1 = termFactory.makeConstructor("CoordinatorDecHead", 1);
    _consCoordinatorBody_1 = termFactory.makeConstructor("CoordinatorBody", 1);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constNil0 = (IStrategoTerm)termFactory.makeList(Term.NO_TERMS);
    const0 = termFactory.makeString(".");
    const1 = termFactory.makeString("byte");
    const2 = termFactory.makeString("char");
    const3 = termFactory.makeString("boolean");
    const4 = termFactory.makeString("short");
    const5 = termFactory.makeString("int");
    const6 = termFactory.makeString("long");
    const7 = termFactory.makeString("float");
    const8 = termFactory.makeString("double");
    const9 = termFactory.makeString("");
    const10 = termFactory.makeString("[]");
    constCons0 = (IStrategoTerm)termFactory.makeListCons(transform.const10, (IStrategoList)transform.constNil0);
    const11 = termFactory.makeString("arik");
    constNone0 = termFactory.makeAppl(transform._consNone_0, NO_TERMS);
    constFalse0 = termFactory.makeAppl(transform._consFalse_0, NO_TERMS);
    constTrue0 = termFactory.makeAppl(transform._consTrue_0, NO_TERMS);
    constDouble0 = termFactory.makeAppl(transform._consDouble_0, NO_TERMS);
    constLong0 = termFactory.makeAppl(transform._consLong_0, NO_TERMS);
    constBoolean0 = termFactory.makeAppl(transform._consBoolean_0, NO_TERMS);
    const12 = termFactory.makeString("Didn't find any type..");
    const13 = termFactory.makeString("Got:");
    constInt0 = termFactory.makeAppl(transform._consInt_0, NO_TERMS);
    constFloat0 = termFactory.makeAppl(transform._consFloat_0, NO_TERMS);
    constByte0 = termFactory.makeAppl(transform._consByte_0, NO_TERMS);
    constChar0 = termFactory.makeAppl(transform._consChar_0, NO_TERMS);
    constShort0 = termFactory.makeAppl(transform._consShort_0, NO_TERMS);
    const14 = termFactory.makeString("LHS can't be:");
    const15 = termFactory.makeString("Unknown variable:");
    const16 = termFactory.makeString("target");
    constId0 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const16});
    constExprName0 = termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{transform.constId0});
    constCons1 = (IStrategoTerm)termFactory.makeListCons(transform.constExprName0, (IStrategoList)transform.constNil0);
    const17 = termFactory.makeInt(1);
    const18 = termFactory.makeString("_ref");
    const19 = termFactory.makeInt(0);
    const20 = termFactory.makeString("0");
    constDeci0 = termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{transform.const20});
    constLit0 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constDeci0});
    constBool0 = termFactory.makeAppl(transform._consBool_1, new IStrategoTerm[]{transform.constFalse0});
    constLit1 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constBool0});
    const21 = termFactory.makeString("0.0");
    constDeci1 = termFactory.makeAppl(transform._consDeci_1, new IStrategoTerm[]{transform.const21});
    constLit2 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constDeci1});
    const22 = termFactory.makeString("Object");
    constId1 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const22});
    constTypeName0 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId1});
    constClassOrInterfaceType0 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName0, transform.constNone0});
    constNull0 = termFactory.makeAppl(transform._consNull_0, NO_TERMS);
    constLit3 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constNull0});
    constPrivate0 = termFactory.makeAppl(transform._consPrivate_0, NO_TERMS);
    constCons2 = (IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, (IStrategoList)transform.constNil0);
    const23 = termFactory.makeString("COOLExternalRef");
    constId2 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const23});
    constTypeName1 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId2});
    const24 = termFactory.makeString("expr");
    constId3 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const24});
    const25 = termFactory.makeString("thiz");
    constId4 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const25});
    const26 = termFactory.makeString("Coord");
    constCons3 = (IStrategoTerm)termFactory.makeListCons(transform.const26, (IStrategoList)transform.constNil0);
    const27 = termFactory.makeString("java");
    const28 = termFactory.makeString("w");
    constSynchronized0 = termFactory.makeAppl(transform._consSynchronized_0, NO_TERMS);
    constCons4 = (IStrategoTerm)termFactory.makeListCons(transform.constSynchronized0, (IStrategoList)transform.constNil0);
    constStatic0 = termFactory.makeAppl(transform._consStatic_0, NO_TERMS);
    constCons5 = (IStrategoTerm)termFactory.makeListCons(transform.constStatic0, (IStrategoList)transform.constCons4);
    constCons6 = (IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, (IStrategoList)transform.constCons5);
    const29 = termFactory.makeString("isRunByOthers");
    constId5 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const29});
    const30 = termFactory.makeString("List");
    constId6 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const30});
    constTypeName2 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId6});
    const31 = termFactory.makeString("methState");
    constId7 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const31});
    constParam0 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constTypeName2, transform.constId7});
    constCons7 = (IStrategoTerm)termFactory.makeListCons(transform.constParam0, (IStrategoList)transform.constNil0);
    constMethodDecHead0 = termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{transform.constCons6, transform.constNone0, transform.constBoolean0, transform.constId5, transform.constCons7, transform.constNone0});
    constAmbName0 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{transform.constId7});
    const32 = termFactory.makeString("size");
    constId8 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const32});
    constMethodName0 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{transform.constAmbName0, transform.constId8});
    constMethod0 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName0});
    constInvoke0 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod0, transform.constNil0});
    constGt0 = termFactory.makeAppl(transform._consGt_2, new IStrategoTerm[]{transform.constInvoke0, transform.constLit0});
    const33 = termFactory.makeString("contains");
    constId9 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const33});
    constMethodName1 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{transform.constAmbName0, transform.constId9});
    constMethod1 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName1});
    const34 = termFactory.makeString("Thread");
    constId10 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const34});
    constAmbName1 = termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{transform.constId10});
    const35 = termFactory.makeString("currentThread");
    constId11 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const35});
    constMethodName2 = termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{transform.constAmbName1, transform.constId11});
    constMethod2 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName2});
    constInvoke1 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod2, transform.constNil0});
    constCons8 = (IStrategoTerm)termFactory.makeListCons(transform.constInvoke1, (IStrategoList)transform.constNil0);
    constInvoke2 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod1, transform.constCons8});
    constNot0 = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{transform.constInvoke2});
    constLazyAnd0 = termFactory.makeAppl(transform._consLazyAnd_2, new IStrategoTerm[]{transform.constGt0, transform.constNot0});
    constSome0 = termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{transform.constLazyAnd0});
    constReturn0 = termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{transform.constSome0});
    constCons9 = (IStrategoTerm)termFactory.makeListCons(transform.constReturn0, (IStrategoList)transform.constNil0);
    constBlock0 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constCons9});
    constMethodDec0 = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{transform.constMethodDecHead0, transform.constBlock0});
    constClassOrInterfaceType1 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName2, transform.constNone0});
    const36 = termFactory.makeString("Vector");
    constId12 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const36});
    constTypeName3 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId12});
    constClassOrInterfaceType2 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName3, transform.constNone0});
    constNewInstance0 = termFactory.makeAppl(transform._consNewInstance_4, new IStrategoTerm[]{transform.constNone0, transform.constClassOrInterfaceType2, transform.constNil0, transform.constNone0});
    const37 = termFactory.makeString("State");
    constCons10 = (IStrategoTerm)termFactory.makeListCons(transform.const37, (IStrategoList)transform.constNil0);
    const38 = termFactory.makeString("requires_");
    const39 = termFactory.makeString("on_entry_");
    const40 = termFactory.makeString("on_exit_");
    constPublic0 = termFactory.makeAppl(transform._consPublic_0, NO_TERMS);
    constCons11 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constNil0);
    const41 = termFactory.makeString("Aspect");
    constId13 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const41});
    constTypeName4 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId13});
    constMarkerAnno0 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName4});
    constCons12 = (IStrategoTerm)termFactory.makeListCons(transform.constMarkerAnno0, (IStrategoList)transform.constCons11);
    const42 = termFactory.makeString("COOLAspect");
    constId14 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const42});
    constTypeName5 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId14});
    const43 = termFactory.makeString("className");
    constId15 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const43});
    const44 = termFactory.makeString("COOLRequires");
    constId16 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const44});
    constTypeName6 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId16});
    const45 = termFactory.makeString("parameterTypes");
    constId17 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const45});
    constString0 = termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{transform.constNil0});
    constLit4 = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{transform.constString0});
    constElemValPair0 = termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId15, transform.constLit4});
    const46 = termFactory.makeString("methodName");
    constId18 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const46});
    const47 = termFactory.makeString("COOLOnEntry");
    constId19 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const47});
    constTypeName7 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId19});
    constVoid0 = termFactory.makeAppl(transform._consVoid_0, NO_TERMS);
    const48 = termFactory.makeString("COOLOnExit");
    constId20 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const48});
    constTypeName8 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId20});
    const49 = termFactory.makeString("org");
    constId21 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const49});
    constPackageOrTypeName0 = termFactory.makeAppl(transform._consPackageOrTypeName_1, new IStrategoTerm[]{transform.constId21});
    const50 = termFactory.makeString("aspectj");
    constId22 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const50});
    constPackageOrTypeName1 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName0, transform.constId22});
    const51 = termFactory.makeString("lang");
    constId23 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const51});
    constPackageOrTypeName2 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName1, transform.constId23});
    const52 = termFactory.makeString("annotation");
    constId24 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const52});
    constPackageOrTypeName3 = termFactory.makeAppl(transform._consPackageOrTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName2, transform.constId24});
    constTypeName9 = termFactory.makeAppl(transform._consTypeName_2, new IStrategoTerm[]{transform.constPackageOrTypeName3, transform.constId13});
    constTypeImportDec0 = termFactory.makeAppl(transform._consTypeImportDec_1, new IStrategoTerm[]{transform.constTypeName9});
    constCons13 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportDec0, (IStrategoList)transform.constNil0);
    const53 = termFactory.makeString("util");
    constId25 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const53});
    constCons14 = (IStrategoTerm)termFactory.makeListCons(transform.constId25, (IStrategoList)transform.constNil0);
    constId26 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const27});
    constCons15 = (IStrategoTerm)termFactory.makeListCons(transform.constId26, (IStrategoList)transform.constCons14);
    constPackageName0 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons15});
    constTypeImportOnDemandDec0 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName0});
    constCons16 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec0, (IStrategoList)transform.constNil0);
    const54 = termFactory.makeString("runtime");
    constId27 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const54});
    constCons17 = (IStrategoTerm)termFactory.makeListCons(transform.constId27, (IStrategoList)transform.constNil0);
    const55 = termFactory.makeString("cool");
    constId28 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const55});
    constCons18 = (IStrategoTerm)termFactory.makeListCons(transform.constId28, (IStrategoList)transform.constCons17);
    constPackageName1 = termFactory.makeAppl(transform._consPackageName_1, new IStrategoTerm[]{transform.constCons18});
    constTypeImportOnDemandDec1 = termFactory.makeAppl(transform._consTypeImportOnDemandDec_1, new IStrategoTerm[]{transform.constPackageName1});
    constCons19 = (IStrategoTerm)termFactory.makeListCons(transform.constTypeImportOnDemandDec1, (IStrategoList)transform.constNil0);
    const56 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'convert-coordinator-declaration'");
    const57 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'gen-coordinator-body'");
    constCons20 = (IStrategoTerm)termFactory.makeListCons(transform.constPublic0, (IStrategoList)transform.constCons4);
    const58 = termFactory.makeString("COOLUnlock");
    constId29 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const58});
    constTypeName10 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId29});
    const59 = termFactory.makeString("remove");
    constId30 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const59});
    const60 = termFactory.makeString("notifyAll");
    constId31 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const60});
    constMethodName3 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{transform.constId31});
    constMethod3 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName3});
    constInvoke3 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod3, transform.constNil0});
    constExprStm0 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{transform.constInvoke3});
    constCons21 = (IStrategoTerm)termFactory.makeListCons(transform.constExprStm0, (IStrategoList)transform.constNil0);
    const61 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'make-unlock-method'");
    const62 = termFactory.makeString("unlock_");
    const63 = termFactory.makeString("COOLLock");
    constId32 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const63});
    constTypeName11 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId32});
    constMethodName4 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{transform.constId5});
    constMethod4 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName4});
    const64 = termFactory.makeString("wait");
    constId33 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const64});
    constMethodName5 = termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{transform.constId33});
    constMethod5 = termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{transform.constMethodName5});
    constInvoke4 = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod5, transform.constNil0});
    constExprStm1 = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{transform.constInvoke4});
    constCons22 = (IStrategoTerm)termFactory.makeListCons(transform.constExprStm1, (IStrategoList)transform.constNil0);
    constBlock1 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constCons22});
    const65 = termFactory.makeString("InterruptedException");
    constId34 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const65});
    constTypeName12 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId34});
    constClassOrInterfaceType3 = termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{transform.constTypeName12, transform.constNone0});
    const66 = termFactory.makeString("e");
    constId35 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const66});
    constParam1 = termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, transform.constClassOrInterfaceType3, transform.constId35});
    constBlock2 = termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{transform.constNil0});
    constCatch0 = termFactory.makeAppl(transform._consCatch_2, new IStrategoTerm[]{transform.constParam1, transform.constBlock2});
    constCons23 = (IStrategoTerm)termFactory.makeListCons(transform.constCatch0, (IStrategoList)transform.constNil0);
    constTry0 = termFactory.makeAppl(transform._consTry_2, new IStrategoTerm[]{transform.constBlock1, transform.constCons23});
    constCons24 = (IStrategoTerm)termFactory.makeListCons(transform.constTry0, (IStrategoList)transform.constNil0);
    const67 = termFactory.makeString("add");
    constId36 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const67});
    const68 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'make-lock-method'");
    const69 = termFactory.makeString("lock_");
    const70 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'fillMethodMaps'");
    const71 = termFactory.makeString("COOLConditionField");
    constId37 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const71});
    constTypeName13 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId37});
    constMarkerAnno1 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName13});
    constCons25 = (IStrategoTerm)termFactory.makeListCons(transform.constMarkerAnno1, (IStrategoList)transform.constNil0);
    constCons26 = (IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, (IStrategoList)transform.constCons25);
    const72 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'add-condition-fields'");
    const73 = termFactory.makeString("COOLCoordinatorField");
    constId38 = termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{transform.const73});
    constTypeName14 = termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{transform.constId38});
    constMarkerAnno2 = termFactory.makeAppl(transform._consMarkerAnno_1, new IStrategoTerm[]{transform.constTypeName14});
    const74 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'add-coordinator-fields'");
  }

  @SuppressWarnings("all") public static class fetch__full__class__name_0_0 extends Strategy 
  { 
    public static fetch__full__class__name_0_0 instance = new fetch__full__class__name_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fetch__full__class__name_0_0");
      Fail0:
      { 
        IStrategoTerm term0 = term;
        IStrategoConstructor cons0 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success0:
        { 
          if(cons0 == transform._consTypeName_2)
          { 
            Fail1:
            { 
              IStrategoTerm i_8 = null;
              IStrategoTerm k_8 = null;
              i_8 = term.getSubterm(0);
              IStrategoTerm arg0 = term.getSubterm(1);
              if(arg0.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg0).getConstructor())
                break Fail1;
              k_8 = arg0.getSubterm(0);
              term = this.invoke(context, i_8);
              if(term == null)
                break Fail1;
              term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(k_8, (IStrategoList)transform.constNil0)));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail1;
              if(true)
                break Success0;
            }
            term = term0;
          }
          Success1:
          { 
            if(cons0 == transform._consTypeName_1)
            { 
              Fail2:
              { 
                IStrategoTerm h_8 = null;
                IStrategoTerm arg1 = term.getSubterm(0);
                if(arg1.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg1).getConstructor())
                  break Fail2;
                h_8 = arg1.getSubterm(0);
                term = h_8;
                if(true)
                  break Success1;
              }
              term = term0;
            }
            Success2:
            { 
              if(cons0 == transform._consPackageOrTypeName_1)
              { 
                Fail3:
                { 
                  IStrategoTerm g_8 = null;
                  IStrategoTerm arg2 = term.getSubterm(0);
                  if(arg2.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg2).getConstructor())
                    break Fail3;
                  g_8 = arg2.getSubterm(0);
                  term = g_8;
                  if(true)
                    break Success2;
                }
                term = term0;
              }
              if(cons0 == transform._consPackageOrTypeName_2)
              { 
                IStrategoTerm c_8 = null;
                IStrategoTerm d_8 = null;
                c_8 = term.getSubterm(0);
                IStrategoTerm arg3 = term.getSubterm(1);
                if(arg3.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg3).getConstructor())
                  break Fail0;
                d_8 = arg3.getSubterm(0);
                term = this.invoke(context, c_8);
                if(term == null)
                  break Fail0;
                term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(d_8, (IStrategoList)transform.constNil0)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail0;
              }
              else
              { 
                break Fail0;
              }
            }
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class pp_type_0_0 extends Strategy 
  { 
    public static pp_type_0_0 instance = new pp_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("pp_type_0_0");
      Fail4:
      { 
        IStrategoTerm term3 = term;
        Success3:
        { 
          Fail5:
          { 
            IStrategoTerm c_9 = null;
            IStrategoTerm d_9 = null;
            IStrategoTerm e_9 = null;
            c_9 = term;
            e_9 = term;
            d_9 = c_9;
            term = e_9;
            IStrategoTerm term4 = term;
            Success4:
            { 
              Fail6:
              { 
                IStrategoTerm f_9 = null;
                f_9 = term;
                term = d_9;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail6;
                term = f_9;
                { 
                  term = transform.const1;
                  if(true)
                    break Success4;
                }
              }
              term = term4;
              IStrategoTerm term5 = term;
              Success5:
              { 
                Fail7:
                { 
                  IStrategoTerm g_9 = null;
                  g_9 = term;
                  term = d_9;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail7;
                  term = g_9;
                  { 
                    term = transform.const2;
                    if(true)
                      break Success5;
                  }
                }
                term = term5;
                IStrategoTerm term6 = term;
                Success6:
                { 
                  Fail8:
                  { 
                    IStrategoTerm h_9 = null;
                    h_9 = term;
                    term = d_9;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail8;
                    term = h_9;
                    { 
                      term = transform.const3;
                      if(true)
                        break Success6;
                    }
                  }
                  term = term6;
                  IStrategoTerm term7 = term;
                  Success7:
                  { 
                    Fail9:
                    { 
                      IStrategoTerm i_9 = null;
                      i_9 = term;
                      term = d_9;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail9;
                      term = i_9;
                      { 
                        term = transform.const4;
                        if(true)
                          break Success7;
                      }
                    }
                    term = term7;
                    IStrategoTerm term8 = term;
                    Success8:
                    { 
                      Fail10:
                      { 
                        IStrategoTerm j_9 = null;
                        j_9 = term;
                        term = d_9;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail10;
                        term = j_9;
                        { 
                          term = transform.const5;
                          if(true)
                            break Success8;
                        }
                      }
                      term = term8;
                      IStrategoTerm term9 = term;
                      Success9:
                      { 
                        Fail11:
                        { 
                          IStrategoTerm l_9 = null;
                          l_9 = term;
                          term = d_9;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail11;
                          term = l_9;
                          { 
                            term = transform.const6;
                            if(true)
                              break Success9;
                          }
                        }
                        term = term9;
                        IStrategoTerm term10 = term;
                        Success10:
                        { 
                          Fail12:
                          { 
                            IStrategoTerm m_9 = null;
                            m_9 = term;
                            term = d_9;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
                              break Fail12;
                            term = m_9;
                            { 
                              term = transform.const7;
                              if(true)
                                break Success10;
                            }
                          }
                          term = term10;
                          Success11:
                          { 
                            Fail13:
                            { 
                              IStrategoTerm o_9 = null;
                              o_9 = term;
                              term = d_9;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                                break Fail13;
                              term = o_9;
                              { 
                                term = transform.const8;
                                if(true)
                                  break Success11;
                              }
                            }
                            term = transform.const9;
                            if(true)
                              break Fail5;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            if(true)
              break Success3;
          }
          term = term3;
          IStrategoTerm term12 = term;
          IStrategoConstructor cons1 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success12:
          { 
            if(cons1 == transform._consArrayType_1)
            { 
              Fail14:
              { 
                IStrategoTerm y_8 = null;
                y_8 = term.getSubterm(0);
                term = this.invoke(context, y_8);
                if(term == null)
                  break Fail14;
                term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constCons0);
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail14;
                if(true)
                  break Success12;
              }
              term = term12;
            }
            Success13:
            { 
              if(cons1 == transform._consClassOrInterfaceType_2)
              { 
                Fail15:
                { 
                  IStrategoTerm x_8 = null;
                  IStrategoTerm arg4 = term.getSubterm(0);
                  if(arg4.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg4).getConstructor())
                    break Fail15;
                  IStrategoTerm arg5 = arg4.getSubterm(0);
                  if(arg5.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg5).getConstructor())
                    break Fail15;
                  x_8 = arg5.getSubterm(0);
                  term = x_8;
                  if(true)
                    break Success13;
                }
                term = term12;
              }
              Success14:
              { 
                if(cons1 == transform._consClassOrInterfaceType_2)
                { 
                  Fail16:
                  { 
                    IStrategoTerm s_8 = null;
                    IStrategoTerm t_8 = null;
                    IStrategoTerm arg7 = term.getSubterm(0);
                    if(arg7.getTermType() != IStrategoTerm.APPL || transform._consTypeName_2 != ((IStrategoAppl)arg7).getConstructor())
                      break Fail16;
                    s_8 = arg7.getSubterm(0);
                    IStrategoTerm arg8 = arg7.getSubterm(1);
                    if(arg8.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg8).getConstructor())
                      break Fail16;
                    t_8 = arg8.getSubterm(0);
                    term = this.invoke(context, s_8);
                    if(term == null)
                      break Fail16;
                    term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(t_8, (IStrategoList)transform.constNil0)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail16;
                    if(true)
                      break Success14;
                  }
                  term = term12;
                }
                Success15:
                { 
                  if(cons1 == transform._consPackageOrTypeName_1)
                  { 
                    Fail17:
                    { 
                      IStrategoTerm r_8 = null;
                      IStrategoTerm arg10 = term.getSubterm(0);
                      if(arg10.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg10).getConstructor())
                        break Fail17;
                      r_8 = arg10.getSubterm(0);
                      term = r_8;
                      if(true)
                        break Success15;
                    }
                    term = term12;
                  }
                  if(cons1 == transform._consPackageOrTypeName_2)
                  { 
                    IStrategoTerm n_8 = null;
                    IStrategoTerm o_8 = null;
                    n_8 = term.getSubterm(0);
                    IStrategoTerm arg11 = term.getSubterm(1);
                    if(arg11.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg11).getConstructor())
                      break Fail4;
                    o_8 = arg11.getSubterm(0);
                    term = this.invoke(context, n_8);
                    if(term == null)
                      break Fail4;
                    term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(o_8, (IStrategoList)transform.constNil0)));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail4;
                  }
                  else
                  { 
                    break Fail4;
                  }
                }
              }
            }
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add__externals_0_1 extends Strategy 
  { 
    public static add__externals_0_1 instance = new add__externals_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_9)
    { 
      context.push("add__externals_0_1");
      Fail18:
      { 
        IStrategoTerm v_9 = null;
        TermReference y_9 = new TermReference();
        v_9 = term;
        term = debug_0_0.instance.invoke(context, transform.const11);
        if(term == null)
          break Fail18;
        term = new_iset_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail18;
        if(y_9.value == null)
          y_9.value = term;
        else
          if(y_9.value != term && !y_9.value.match(term))
            break Fail18;
        term = arik_0_2.instance.invoke(context, v_9, y_9.value, s_9);
        if(term == null)
          break Fail18;
        lifted0 lifted00 = new lifted0();
        lifted00.y_9 = y_9;
        term = topdown_1_0.instance.invoke(context, term, lifted00);
        if(term == null)
          break Fail18;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class arik_0_2 extends Strategy 
  { 
    public static arik_0_2 instance = new arik_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_10, IStrategoTerm m_10)
    { 
      context.push("arik_0_2");
      Fail19:
      { 
        IStrategoTerm n_10 = null;
        IStrategoTerm o_10 = null;
        IStrategoTerm t_10 = null;
        IStrategoTerm u_10 = null;
        IStrategoTerm v_10 = null;
        IStrategoTerm g_11 = null;
        IStrategoTerm h_11 = null;
        IStrategoTerm j_11 = null;
        IStrategoTerm m_11 = null;
        IStrategoTerm n_11 = null;
        n_10 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        o_10 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        u_10 = term;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        v_10 = term;
        term = new_iset_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        t_10 = term;
        term = n_10;
        j_11 = n_10;
        term = new_hashtable_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail19;
        g_11 = term;
        m_11 = j_11;
        h_11 = transform.constNone0;
        n_11 = m_11;
        term = arik_0_9.instance.invokeDynamic(context, n_11, NO_STRATEGIES, new IStrategoTerm[]{o_10, g_11, t_10, u_10, l_10, v_10, h_11, transform.constFalse0, m_10});
        if(term == null)
          break Fail19;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class arik_0_9 extends Strategy 
  { 
    public static arik_0_9 instance = new arik_0_9();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_11, IStrategoTerm ref_p_11, IStrategoTerm ref_q_11, IStrategoTerm ref_r_11, IStrategoTerm ref_s_11, IStrategoTerm ref_t_11, IStrategoTerm ref_u_11, IStrategoTerm ref_v_11, IStrategoTerm ref_w_11)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference o_11 = new TermReference(ref_o_11);
      TermReference p_11 = new TermReference(ref_p_11);
      TermReference q_11 = new TermReference(ref_q_11);
      TermReference r_11 = new TermReference(ref_r_11);
      TermReference s_11 = new TermReference(ref_s_11);
      TermReference t_11 = new TermReference(ref_t_11);
      TermReference u_11 = new TermReference(ref_u_11);
      TermReference v_11 = new TermReference(ref_v_11);
      TermReference w_11 = new TermReference(ref_w_11);
      context.push("arik_0_9");
      Fail20:
      { 
        IStrategoTerm x_11 = null;
        TermReference y_11 = new TermReference();
        IStrategoTerm z_11 = null;
        TermReference a_12 = new TermReference();
        IStrategoTerm b_12 = null;
        IStrategoTerm c_12 = null;
        TermReference d_12 = new TermReference();
        TermReference e_12 = new TermReference();
        TermReference f_12 = new TermReference();
        TermReference g_12 = new TermReference();
        TermReference h_12 = new TermReference();
        TermReference i_12 = new TermReference();
        TermReference j_12 = new TermReference();
        TermReference k_12 = new TermReference();
        TermReference l_12 = new TermReference();
        TermReference m_12 = new TermReference();
        TermReference n_12 = new TermReference();
        TermReference o_12 = new TermReference();
        TermReference p_12 = new TermReference();
        TermReference q_12 = new TermReference();
        TermReference r_12 = new TermReference();
        TermReference s_12 = new TermReference();
        TermReference t_12 = new TermReference();
        TermReference u_12 = new TermReference();
        TermReference v_12 = new TermReference();
        IStrategoTerm w_12 = null;
        if(u_12.value == null)
          u_12.value = term;
        else
          if(u_12.value != term && !u_12.value.match(term))
            break Fail20;
        w_12 = term;
        if(v_12.value == null)
          v_12.value = term;
        else
          if(v_12.value != term && !v_12.value.match(term))
            break Fail20;
        term = w_12;
        IStrategoTerm term16 = term;
        Success16:
        { 
          Fail21:
          { 
            IStrategoTerm x_12 = null;
            x_12 = term;
            if(v_12.value == null)
              break Fail21;
            term = v_12.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consBlock_1 != ((IStrategoAppl)term).getConstructor())
              break Fail21;
            term = x_12;
            { 
              term = new_hashtable_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail20;
              if(a_12.value == null)
                a_12.value = term;
              else
                if(a_12.value != term && !a_12.value.match(term))
                  break Fail20;
              if(u_12.value == null)
                break Fail20;
              term = u_12.value;
              lifted2 lifted210 = new lifted2();
              lifted210.o_11 = o_11;
              lifted210.p_11 = p_11;
              lifted210.q_11 = q_11;
              lifted210.a_12 = a_12;
              lifted210.s_11 = s_11;
              lifted210.t_11 = t_11;
              lifted210.u_11 = u_11;
              lifted210.v_11 = v_11;
              lifted210.w_11 = w_11;
              term = SRTS_all.instance.invoke(context, term, lifted210);
              if(term == null)
                break Fail20;
              b_12 = term;
              if(a_12.value == null)
                break Fail20;
              term = hashtable_keys_0_0.instance.invoke(context, a_12.value);
              if(term == null)
                break Fail20;
              lifted3 lifted310 = new lifted3();
              lifted310.o_11 = o_11;
              lifted310.a_12 = a_12;
              term = map_1_0.instance.invoke(context, term, lifted310);
              if(term == null)
                break Fail20;
              term = b_12;
              if(true)
                break Success16;
            }
          }
          term = term16;
          IStrategoTerm term17 = term;
          Success17:
          { 
            Fail22:
            { 
              IStrategoTerm y_12 = null;
              y_12 = term;
              if(v_12.value == null)
                break Fail22;
              term = v_12.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDec_2 != ((IStrategoAppl)term).getConstructor())
                break Fail22;
              x_11 = term.getSubterm(0);
              z_11 = term.getSubterm(1);
              term = y_12;
              { 
                term = new_hashtable_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail20;
                if(a_12.value == null)
                  a_12.value = term;
                else
                  if(a_12.value != term && !a_12.value.match(term))
                    break Fail20;
                Success18:
                { 
                  Fail23:
                  { 
                    IStrategoTerm z_12 = null;
                    z_12 = term;
                    term = is__on__entry__or__on__exit__method_0_0.instance.invoke(context, x_11);
                    if(term == null)
                      break Fail23;
                    term = z_12;
                    { 
                      term = transform.constTrue0;
                      if(y_11.value == null)
                        y_11.value = term;
                      else
                        if(y_11.value != term && !y_11.value.match(term))
                          break Fail20;
                      if(true)
                        break Success18;
                    }
                  }
                  term = transform.constFalse0;
                  if(y_11.value == null)
                    y_11.value = term;
                  else
                    if(y_11.value != term && !y_11.value.match(term))
                      break Fail20;
                }
                term = x_11;
                lifted4 lifted410 = new lifted4();
                lifted410.o_11 = o_11;
                lifted410.a_12 = a_12;
                lifted410.p_11 = p_11;
                lifted410.u_11 = u_11;
                term = topdown_1_0.instance.invoke(context, term, lifted410);
                if(term == null)
                  break Fail20;
                term = z_11;
                lifted6 lifted610 = new lifted6();
                lifted610.o_11 = o_11;
                lifted610.p_11 = p_11;
                lifted610.q_11 = q_11;
                lifted610.a_12 = a_12;
                lifted610.s_11 = s_11;
                lifted610.t_11 = t_11;
                lifted610.u_11 = u_11;
                lifted610.y_11 = y_11;
                lifted610.w_11 = w_11;
                term = SRTS_all.instance.invoke(context, term, lifted610);
                if(term == null)
                  break Fail20;
                term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{x_11, term});
                b_12 = term;
                if(a_12.value == null)
                  break Fail20;
                term = hashtable_keys_0_0.instance.invoke(context, a_12.value);
                if(term == null)
                  break Fail20;
                lifted7 lifted710 = new lifted7();
                lifted710.o_11 = o_11;
                lifted710.a_12 = a_12;
                term = map_1_0.instance.invoke(context, term, lifted710);
                if(term == null)
                  break Fail20;
                term = b_12;
                if(true)
                  break Success17;
              }
            }
            term = term17;
            IStrategoTerm term19 = term;
            Success19:
            { 
              Fail24:
              { 
                IStrategoTerm a_13 = null;
                a_13 = term;
                if(v_12.value == null)
                  break Fail24;
                term = or_2_0.instance.invoke(context, v_12.value, lifted8.instance, lifted9.instance);
                if(term == null)
                  break Fail24;
                term = a_13;
                { 
                  if(u_12.value == null)
                    break Fail20;
                  term = handle_expr_0_7.instance.invokeDynamic(context, u_12.value, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, s_11.value, q_11.value, t_11.value, u_11.value, v_11.value, w_11.value});
                  if(term == null)
                    break Fail20;
                  if(true)
                    break Success19;
                }
              }
              term = term19;
              IStrategoTerm term20 = term;
              Success20:
              { 
                Fail25:
                { 
                  IStrategoTerm e_13 = null;
                  e_13 = term;
                  if(v_12.value == null)
                    break Fail25;
                  term = v_12.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail25;
                  IStrategoTerm arg16 = term.getSubterm(0);
                  if(arg16.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg16).getConstructor())
                    break Fail25;
                  c_12 = arg16.getSubterm(0);
                  term = e_13;
                  { 
                    term = add__var_0_5.instance.invoke(context, term, c_12, o_11.value, r_11.value, p_11.value, u_11.value);
                    if(term == null)
                      break Fail20;
                    if(true)
                      break Success20;
                  }
                }
                term = term20;
                IStrategoTerm term21 = term;
                Success21:
                { 
                  Fail26:
                  { 
                    IStrategoTerm f_13 = null;
                    f_13 = term;
                    if(v_12.value == null)
                      break Fail26;
                    term = v_12.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
                      break Fail26;
                    IStrategoTerm arg17 = term.getSubterm(0);
                    if(arg17.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg17).getConstructor())
                      break Fail26;
                    c_12 = arg17.getSubterm(0);
                    if(t_12.value == null)
                      t_12.value = term.getSubterm(1);
                    else
                      if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                        break Fail26;
                    term = f_13;
                    { 
                      term = add__var_0_5.instance.invoke(context, term, c_12, o_11.value, r_11.value, p_11.value, u_11.value);
                      if(term == null)
                        break Fail20;
                      if(u_12.value == null)
                        break Fail20;
                      term = u_12.value;
                      lifted10 lifted1010 = new lifted10();
                      lifted1010.o_11 = o_11;
                      lifted1010.p_11 = p_11;
                      lifted1010.q_11 = q_11;
                      lifted1010.r_11 = r_11;
                      lifted1010.s_11 = s_11;
                      lifted1010.t_11 = t_11;
                      lifted1010.u_11 = u_11;
                      lifted1010.v_11 = v_11;
                      lifted1010.w_11 = w_11;
                      term = SRTS_all.instance.invoke(context, term, lifted1010);
                      if(term == null)
                        break Fail20;
                      if(true)
                        break Success21;
                    }
                  }
                  term = term21;
                  IStrategoTerm term22 = term;
                  Success22:
                  { 
                    Fail27:
                    { 
                      IStrategoTerm g_13 = null;
                      g_13 = term;
                      if(v_12.value == null)
                        break Fail27;
                      term = v_12.value;
                      lifted12 lifted1210 = new lifted12();
                      lifted11 lifted1110 = new lifted11();
                      lifted1210.s_12 = s_12;
                      lifted1210.d_12 = d_12;
                      lifted1110.s_12 = s_12;
                      lifted1110.d_12 = d_12;
                      term = or_2_0.instance.invoke(context, term, lifted1110, lifted1210);
                      if(term == null)
                        break Fail27;
                      term = g_13;
                      { 
                        if(u_12.value == null)
                          break Fail20;
                        term = u_12.value;
                        lifted13 lifted135 = new lifted13();
                        lifted135.o_11 = o_11;
                        lifted135.p_11 = p_11;
                        lifted135.q_11 = q_11;
                        lifted135.r_11 = r_11;
                        lifted135.s_11 = s_11;
                        lifted135.t_11 = t_11;
                        lifted135.s_12 = s_12;
                        lifted135.v_11 = v_11;
                        lifted135.w_11 = w_11;
                        term = SRTS_all.instance.invoke(context, term, lifted135);
                        if(term == null)
                          break Fail20;
                        if(true)
                          break Success22;
                      }
                    }
                    term = term22;
                    IStrategoTerm term23 = term;
                    Success23:
                    { 
                      Fail28:
                      { 
                        IStrategoTerm h_13 = null;
                        h_13 = term;
                        if(v_12.value == null)
                          break Fail28;
                        term = v_12.value;
                        lifted15 lifted150 = new lifted15();
                        lifted14 lifted140 = new lifted14();
                        lifted150.k_12 = k_12;
                        lifted150.l_12 = l_12;
                        lifted140.k_12 = k_12;
                        lifted140.l_12 = l_12;
                        term = or_2_0.instance.invoke(context, term, lifted140, lifted150);
                        if(term == null)
                          break Fail28;
                        term = h_13;
                        { 
                          if(u_12.value == null)
                            break Fail20;
                          term = u_12.value;
                          lifted16 lifted160 = new lifted16();
                          lifted160.k_12 = k_12;
                          lifted160.l_12 = l_12;
                          lifted160.o_11 = o_11;
                          lifted160.p_11 = p_11;
                          lifted160.q_11 = q_11;
                          lifted160.r_11 = r_11;
                          lifted160.s_11 = s_11;
                          lifted160.t_11 = t_11;
                          lifted160.v_11 = v_11;
                          lifted160.w_11 = w_11;
                          term = SRTS_all.instance.invoke(context, term, lifted160);
                          if(term == null)
                            break Fail20;
                          if(true)
                            break Success23;
                        }
                      }
                      term = term23;
                      IStrategoTerm term24 = term;
                      Success24:
                      { 
                        Fail29:
                        { 
                          IStrategoTerm i_13 = null;
                          i_13 = term;
                          if(v_12.value == null)
                            break Fail29;
                          term = v_12.value;
                          lifted20 lifted200 = new lifted20();
                          lifted17 lifted170 = new lifted17();
                          lifted200.k_12 = k_12;
                          lifted200.l_12 = l_12;
                          lifted170.k_12 = k_12;
                          lifted170.l_12 = l_12;
                          term = or_2_0.instance.invoke(context, term, lifted170, lifted200);
                          if(term == null)
                            break Fail29;
                          term = i_13;
                          { 
                            IStrategoTerm term25 = term;
                            Success25:
                            { 
                              Fail30:
                              { 
                                IStrategoTerm m_13 = null;
                                m_13 = term;
                                if(u_11.value == null)
                                  break Fail30;
                                term = termFactory.makeTuple(u_11.value, transform.constNone0);
                                term = equal_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail30;
                                term = m_13;
                                { 
                                  if(u_12.value == null)
                                    break Fail20;
                                  term = u_12.value;
                                  lifted21 lifted211 = new lifted21();
                                  lifted211.k_12 = k_12;
                                  lifted211.l_12 = l_12;
                                  lifted211.u_11 = u_11;
                                  lifted211.o_11 = o_11;
                                  lifted211.p_11 = p_11;
                                  lifted211.q_11 = q_11;
                                  lifted211.r_11 = r_11;
                                  lifted211.s_11 = s_11;
                                  lifted211.t_11 = t_11;
                                  lifted211.v_11 = v_11;
                                  lifted211.w_11 = w_11;
                                  term = SRTS_all.instance.invoke(context, term, lifted211);
                                  if(term == null)
                                    break Fail20;
                                  if(true)
                                    break Success25;
                                }
                              }
                              term = term25;
                              if(u_12.value == null)
                                break Fail20;
                              term = u_12.value;
                              lifted22 lifted220 = new lifted22();
                              lifted220.u_11 = u_11;
                              lifted220.o_11 = o_11;
                              lifted220.p_11 = p_11;
                              lifted220.q_11 = q_11;
                              lifted220.r_11 = r_11;
                              lifted220.s_11 = s_11;
                              lifted220.t_11 = t_11;
                              lifted220.v_11 = v_11;
                              lifted220.w_11 = w_11;
                              term = SRTS_all.instance.invoke(context, term, lifted220);
                              if(term == null)
                                break Fail20;
                            }
                            if(true)
                              break Success24;
                          }
                        }
                        term = term24;
                        IStrategoTerm term26 = term;
                        Success26:
                        { 
                          Fail31:
                          { 
                            IStrategoTerm n_13 = null;
                            n_13 = term;
                            if(v_12.value == null)
                              break Fail31;
                            term = or_2_0.instance.invoke(context, v_12.value, lifted23.instance, lifted26.instance);
                            if(term == null)
                              break Fail31;
                            term = n_13;
                            { 
                              if(u_12.value == null)
                                break Fail20;
                              term = u_12.value;
                              lifted29 lifted290 = new lifted29();
                              lifted290.o_11 = o_11;
                              lifted290.p_11 = p_11;
                              lifted290.q_11 = q_11;
                              lifted290.r_11 = r_11;
                              lifted290.s_11 = s_11;
                              lifted290.t_11 = t_11;
                              lifted290.v_11 = v_11;
                              lifted290.w_11 = w_11;
                              term = SRTS_all.instance.invoke(context, term, lifted290);
                              if(term == null)
                                break Fail20;
                              if(true)
                                break Success26;
                            }
                          }
                          term = term26;
                          IStrategoTerm term27 = term;
                          Success27:
                          { 
                            Fail32:
                            { 
                              IStrategoTerm o_13 = null;
                              o_13 = term;
                              if(v_12.value == null)
                                break Fail32;
                              term = v_12.value;
                              lifted37 lifted370 = new lifted37();
                              lifted30 lifted300 = new lifted30();
                              lifted370.k_12 = k_12;
                              lifted370.l_12 = l_12;
                              lifted300.k_12 = k_12;
                              lifted300.l_12 = l_12;
                              term = or_2_0.instance.invoke(context, term, lifted300, lifted370);
                              if(term == null)
                                break Fail32;
                              term = o_13;
                              { 
                                IStrategoTerm term28 = term;
                                Success28:
                                { 
                                  Fail33:
                                  { 
                                    IStrategoTerm p_13 = null;
                                    p_13 = term;
                                    if(u_11.value == null)
                                      break Fail33;
                                    term = termFactory.makeTuple(u_11.value, transform.constNone0);
                                    term = equal_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail33;
                                    term = p_13;
                                    { 
                                      if(u_12.value == null)
                                        break Fail20;
                                      term = u_12.value;
                                      lifted38 lifted380 = new lifted38();
                                      lifted380.o_11 = o_11;
                                      lifted380.p_11 = p_11;
                                      lifted380.q_11 = q_11;
                                      lifted380.r_11 = r_11;
                                      lifted380.s_11 = s_11;
                                      lifted380.t_11 = t_11;
                                      lifted380.v_11 = v_11;
                                      lifted380.w_11 = w_11;
                                      term = SRTS_all.instance.invoke(context, term, lifted380);
                                      if(term == null)
                                        break Fail20;
                                      if(true)
                                        break Success28;
                                    }
                                  }
                                  term = term28;
                                  if(u_12.value == null)
                                    break Fail20;
                                  term = u_12.value;
                                  lifted39 lifted390 = new lifted39();
                                  lifted390.u_11 = u_11;
                                  lifted390.o_11 = o_11;
                                  lifted390.p_11 = p_11;
                                  lifted390.q_11 = q_11;
                                  lifted390.r_11 = r_11;
                                  lifted390.s_11 = s_11;
                                  lifted390.t_11 = t_11;
                                  lifted390.v_11 = v_11;
                                  lifted390.w_11 = w_11;
                                  term = SRTS_all.instance.invoke(context, term, lifted390);
                                  if(term == null)
                                    break Fail20;
                                }
                                if(true)
                                  break Success27;
                              }
                            }
                            term = term27;
                            IStrategoTerm term29 = term;
                            Success29:
                            { 
                              Fail34:
                              { 
                                IStrategoTerm q_13 = null;
                                q_13 = term;
                                if(v_12.value == null)
                                  break Fail34;
                                term = v_12.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
                                  break Fail34;
                                if(k_12.value == null)
                                  k_12.value = term.getSubterm(0);
                                else
                                  if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
                                    break Fail34;
                                if(l_12.value == null)
                                  l_12.value = term.getSubterm(1);
                                else
                                  if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
                                    break Fail34;
                                term = q_13;
                                { 
                                  IStrategoTerm d_17 = null;
                                  IStrategoTerm g_17 = null;
                                  IStrategoTerm j_17 = null;
                                  IStrategoTerm term30 = term;
                                  Success30:
                                  { 
                                    Fail35:
                                    { 
                                      IStrategoTerm r_13 = null;
                                      r_13 = term;
                                      if(u_11.value == null)
                                        break Fail35;
                                      term = termFactory.makeTuple(u_11.value, transform.constNone0);
                                      term = equal_0_0.instance.invoke(context, term);
                                      if(term == null)
                                        break Fail35;
                                      term = r_13;
                                      { 
                                        if(k_12.value == null)
                                          break Fail20;
                                        term = get_type_of_0_3.instance.invoke(context, k_12.value, u_11.value, o_11.value, p_11.value);
                                        if(term == null)
                                          break Fail20;
                                        term = ee_0_0.instance.invoke(context, term);
                                        if(term == null)
                                          break Fail20;
                                        if(f_12.value == null)
                                          f_12.value = term;
                                        else
                                          if(f_12.value != term && !f_12.value.match(term))
                                            break Fail20;
                                        if(true)
                                          break Success30;
                                      }
                                    }
                                    term = term30;
                                    if(u_11.value == null)
                                      break Fail20;
                                    term = ee_0_0.instance.invoke(context, u_11.value);
                                    if(term == null)
                                      break Fail20;
                                    if(f_12.value == null)
                                      f_12.value = term;
                                    else
                                      if(f_12.value != term && !f_12.value.match(term))
                                        break Fail20;
                                  }
                                  g_17 = term;
                                  if(k_12.value == null)
                                    break Fail20;
                                  term = this.invokeDynamic(context, k_12.value, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, f_12.value, v_11.value, w_11.value});
                                  if(term == null)
                                    break Fail20;
                                  d_17 = term;
                                  term = g_17;
                                  if(l_12.value == null)
                                    break Fail20;
                                  j_17 = l_12.value;
                                  term = this.invokeDynamic(context, j_17, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constLong0, v_11.value, w_11.value});
                                  if(term == null)
                                    break Fail20;
                                  term = termFactory.makeAppl(transform._consLeftShift_2, new IStrategoTerm[]{d_17, term});
                                  if(true)
                                    break Success29;
                                }
                              }
                              term = term29;
                              arik_0_9_fragment_1 arik_0_9_fragment_10 = new arik_0_9_fragment_1();
                              arik_0_9_fragment_10.e_12 = e_12;
                              arik_0_9_fragment_10.f_12 = f_12;
                              arik_0_9_fragment_10.h_12 = h_12;
                              arik_0_9_fragment_10.g_12 = g_12;
                              arik_0_9_fragment_10.i_12 = i_12;
                              arik_0_9_fragment_10.j_12 = j_12;
                              arik_0_9_fragment_10.k_12 = k_12;
                              arik_0_9_fragment_10.l_12 = l_12;
                              arik_0_9_fragment_10.m_12 = m_12;
                              arik_0_9_fragment_10.n_12 = n_12;
                              arik_0_9_fragment_10.o_12 = o_12;
                              arik_0_9_fragment_10.p_12 = p_12;
                              arik_0_9_fragment_10.q_12 = q_12;
                              arik_0_9_fragment_10.r_12 = r_12;
                              arik_0_9_fragment_10.v_12 = v_12;
                              arik_0_9_fragment_10.t_12 = t_12;
                              arik_0_9_fragment_10.s_12 = s_12;
                              arik_0_9_fragment_10.o_11 = o_11;
                              arik_0_9_fragment_10.p_11 = p_11;
                              arik_0_9_fragment_10.q_11 = q_11;
                              arik_0_9_fragment_10.r_11 = r_11;
                              arik_0_9_fragment_10.s_11 = s_11;
                              arik_0_9_fragment_10.t_11 = t_11;
                              arik_0_9_fragment_10.u_11 = u_11;
                              arik_0_9_fragment_10.v_11 = v_11;
                              arik_0_9_fragment_10.w_11 = w_11;
                              arik_0_9_fragment_10.u_12 = u_12;
                              term = arik_0_9_fragment_10.invoke(context, term);
                              if(term == null)
                                break Fail20;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }

    @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
    { 
      if(sargs == null || targs == null || sargs.length != 0 || targs.length != 9)
        throw new IllegalArgumentException("Illegal arguments for " + getName());
      return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5], targs[6], targs[7], targs[8]);
    }
  }

  @SuppressWarnings("all") public static class is__on__entry__or__on__exit__method_0_0 extends Strategy 
  { 
    public static is__on__entry__or__on__exit__method_0_0 instance = new is__on__entry__or__on__exit__method_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("is__on__entry__or__on__exit__method_0_0");
      Fail36:
      { 
        TermReference g_24 = new TermReference();
        lifted51 lifted511 = new lifted51();
        lifted50 lifted500 = new lifted50();
        lifted511.g_24 = g_24;
        lifted500.g_24 = g_24;
        term = or_2_0.instance.invoke(context, term, lifted500, lifted511);
        if(term == null)
          break Fail36;
        IStrategoTerm term73 = term;
        Success31:
        { 
          Fail37:
          { 
            IStrategoTerm h_24 = null;
            h_24 = term;
            lifted54 lifted540 = new lifted54();
            lifted52 lifted520 = new lifted52();
            lifted540.g_24 = g_24;
            lifted520.g_24 = g_24;
            term = or_2_0.instance.invoke(context, term, lifted520, lifted540);
            if(term == null)
              break Fail37;
            term = h_24;
            { 
              term = true_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail36;
              if(true)
                break Success31;
            }
          }
          term = false_0_0.instance.invoke(context, term73);
          if(term == null)
            break Fail36;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add__params_0_4 extends Strategy 
  { 
    public static add__params_0_4 instance = new add__params_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_24, IStrategoTerm j_24, IStrategoTerm l_24, IStrategoTerm m_24)
    { 
      context.push("add__params_0_4");
      Fail38:
      { 
        TermReference n_24 = new TermReference();
        lifted57 lifted570 = new lifted57();
        lifted56 lifted560 = new lifted56();
        lifted570.n_24 = n_24;
        lifted560.n_24 = n_24;
        term = or_2_0.instance.invoke(context, term, lifted560, lifted570);
        if(term == null)
          break Fail38;
        term = add__var_0_5.instance.invoke(context, term, n_24.value, i_24, j_24, l_24, m_24);
        if(term == null)
          break Fail38;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add__var_0_5 extends Strategy 
  { 
    public static add__var_0_5 instance = new add__var_0_5();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_24, IStrategoTerm r_24, IStrategoTerm s_24, IStrategoTerm t_24, IStrategoTerm u_24)
    { 
      context.push("add__var_0_5");
      Fail39:
      { 
        term = hashtable_put_0_2.instance.invoke(context, t_24, q_24, u_24);
        if(term == null)
          break Fail39;
        term = increament_0_2.instance.invoke(context, r_24, q_24, r_24);
        if(term == null)
          break Fail39;
        term = increament_0_2.instance.invoke(context, s_24, q_24, s_24);
        if(term == null)
          break Fail39;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gogo_0_3 extends Strategy 
  { 
    public static gogo_0_3 instance = new gogo_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_24, IStrategoTerm w_24, IStrategoTerm x_24)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gogo_0_3");
      Fail40:
      { 
        IStrategoTerm y_24 = null;
        IStrategoTerm z_24 = null;
        IStrategoTerm a_25 = null;
        IStrategoTerm b_25 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail40;
        y_24 = term.getSubterm(0);
        a_25 = term.getSubterm(1);
        term = get_type_of_0_3.instance.invoke(context, y_24, v_24, w_24, x_24);
        if(term == null)
          break Fail40;
        z_24 = term;
        Success32:
        { 
          Fail41:
          { 
            IStrategoTerm c_25 = null;
            c_25 = term;
            IStrategoTerm term75 = term;
            Success33:
            { 
              Fail42:
              { 
                term = termFactory.makeTuple(z_24, transform.constNone0);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail42;
                { 
                  if(true)
                    break Fail41;
                  if(true)
                    break Success33;
                }
              }
              term = term75;
            }
            term = c_25;
            { 
              term = z_24;
              if(true)
                break Success32;
            }
          }
          term = get_type_of_0_3.instance.invoke(context, a_25, v_24, w_24, x_24);
          if(term == null)
            break Fail40;
          b_25 = term;
          Success34:
          { 
            Fail43:
            { 
              IStrategoTerm d_25 = null;
              d_25 = term;
              IStrategoTerm term77 = term;
              Success35:
              { 
                Fail44:
                { 
                  term = termFactory.makeTuple(b_25, transform.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail44;
                  { 
                    if(true)
                      break Fail43;
                    if(true)
                      break Success35;
                  }
                }
                term = term77;
              }
              term = d_25;
              { 
                term = b_25;
                if(true)
                  break Success34;
              }
            }
            term = debug_0_0.instance.invoke(context, transform.const12);
            if(term == null)
              break Fail40;
            term = transform.const9;
            if(true)
              break Fail40;
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class bb_0_0 extends Strategy 
  { 
    public static bb_0_0 instance = new bb_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("bb_0_0");
      Fail45:
      { 
        IStrategoTerm g_25 = null;
        IStrategoTerm h_25 = null;
        IStrategoTerm i_25 = null;
        g_25 = term;
        i_25 = term;
        h_25 = g_25;
        term = i_25;
        IStrategoTerm term78 = term;
        Success36:
        { 
          Fail46:
          { 
            IStrategoTerm j_25 = null;
            j_25 = term;
            term = h_25;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail46;
            term = j_25;
            { 
              term = transform.constDouble0;
              if(true)
                break Success36;
            }
          }
          term = term78;
          IStrategoTerm term79 = term;
          Success37:
          { 
            Fail47:
            { 
              IStrategoTerm k_25 = null;
              k_25 = term;
              term = h_25;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail47;
              term = k_25;
              { 
                term = transform.constDouble0;
                if(true)
                  break Success37;
              }
            }
            term = term79;
            IStrategoTerm term80 = term;
            Success38:
            { 
              Fail48:
              { 
                IStrategoTerm l_25 = null;
                l_25 = term;
                term = h_25;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail48;
                term = l_25;
                { 
                  term = transform.constDouble0;
                  if(true)
                    break Success38;
                }
              }
              term = term80;
              IStrategoTerm term81 = term;
              Success39:
              { 
                Fail49:
                { 
                  IStrategoTerm m_25 = null;
                  m_25 = term;
                  term = or_2_0.instance.invoke(context, h_25, lifted58.instance, lifted59.instance);
                  if(term == null)
                    break Fail49;
                  term = m_25;
                  { 
                    term = transform.constDouble0;
                    if(true)
                      break Success39;
                  }
                }
                term = term81;
                IStrategoTerm term82 = term;
                Success40:
                { 
                  Fail50:
                  { 
                    IStrategoTerm n_25 = null;
                    n_25 = term;
                    term = or_2_0.instance.invoke(context, h_25, lifted60.instance, lifted61.instance);
                    if(term == null)
                      break Fail50;
                    term = n_25;
                    { 
                      term = transform.constDouble0;
                      if(true)
                        break Success40;
                    }
                  }
                  term = term82;
                  IStrategoTerm term83 = term;
                  Success41:
                  { 
                    Fail51:
                    { 
                      IStrategoTerm o_25 = null;
                      o_25 = term;
                      term = h_25;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail51;
                      term = o_25;
                      { 
                        term = transform.constDouble0;
                        if(true)
                          break Success41;
                      }
                    }
                    term = term83;
                    IStrategoTerm term84 = term;
                    Success42:
                    { 
                      Fail52:
                      { 
                        IStrategoTerm r_25 = null;
                        r_25 = term;
                        term = h_25;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail52;
                        term = r_25;
                        { 
                          term = transform.constDouble0;
                          if(true)
                            break Success42;
                        }
                      }
                      term = term84;
                      IStrategoTerm term85 = term;
                      Success43:
                      { 
                        Fail53:
                        { 
                          IStrategoTerm s_25 = null;
                          s_25 = term;
                          term = h_25;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                            break Fail53;
                          term = s_25;
                          { 
                            term = transform.constDouble0;
                            if(true)
                              break Success43;
                          }
                        }
                        term = term85;
                        Success44:
                        { 
                          Fail54:
                          { 
                            IStrategoTerm t_25 = null;
                            t_25 = term;
                            term = or_2_0.instance.invoke(context, h_25, lifted62.instance, lifted63.instance);
                            if(term == null)
                              break Fail54;
                            term = t_25;
                            { 
                              term = transform.constBoolean0;
                              if(true)
                                break Success44;
                            }
                          }
                          term = debug_0_0.instance.invoke(context, transform.const13);
                          if(term == null)
                            break Fail45;
                          term = debug_0_0.instance.invoke(context, g_25);
                          if(term == null)
                            break Fail45;
                          term = transform.const9;
                          if(true)
                            break Fail45;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class dd_0_0 extends Strategy 
  { 
    public static dd_0_0 instance = new dd_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("dd_0_0");
      Fail55:
      { 
        IStrategoTerm w_25 = null;
        IStrategoTerm x_25 = null;
        IStrategoTerm y_25 = null;
        w_25 = term;
        y_25 = term;
        x_25 = w_25;
        term = y_25;
        IStrategoTerm term87 = term;
        Success45:
        { 
          Fail56:
          { 
            IStrategoTerm z_25 = null;
            z_25 = term;
            term = x_25;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
              break Fail56;
            term = z_25;
            { 
              term = transform.constInt0;
              if(true)
                break Success45;
            }
          }
          term = term87;
          IStrategoTerm term88 = term;
          Success46:
          { 
            Fail57:
            { 
              IStrategoTerm a_26 = null;
              a_26 = term;
              term = or_2_0.instance.invoke(context, x_25, lifted64.instance, lifted65.instance);
              if(term == null)
                break Fail57;
              term = a_26;
              { 
                term = transform.constFloat0;
                if(true)
                  break Success46;
              }
            }
            term = term88;
            IStrategoTerm term89 = term;
            Success47:
            { 
              Fail58:
              { 
                IStrategoTerm b_26 = null;
                b_26 = term;
                term = x_25;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail58;
                term = b_26;
                { 
                  term = transform.constLong0;
                  if(true)
                    break Success47;
                }
              }
              term = term89;
              IStrategoTerm term90 = term;
              Success48:
              { 
                Fail59:
                { 
                  IStrategoTerm c_26 = null;
                  c_26 = term;
                  term = x_25;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail59;
                  term = c_26;
                  { 
                    term = transform.constDouble0;
                    if(true)
                      break Success48;
                  }
                }
                term = term90;
                Success49:
                { 
                  Fail60:
                  { 
                    IStrategoTerm d_26 = null;
                    d_26 = term;
                    term = x_25;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail60;
                    term = d_26;
                    { 
                      term = transform.constLong0;
                      if(true)
                        break Success49;
                    }
                  }
                  term = debug_0_0.instance.invoke(context, transform.const13);
                  if(term == null)
                    break Fail55;
                  term = debug_0_0.instance.invoke(context, w_25);
                  if(term == null)
                    break Fail55;
                  term = transform.const9;
                  if(true)
                    break Fail55;
                }
              }
            }
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class cc_0_0 extends Strategy 
  { 
    public static cc_0_0 instance = new cc_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("cc_0_0");
      Fail61:
      { 
        IStrategoTerm g_26 = null;
        IStrategoTerm h_26 = null;
        IStrategoTerm i_26 = null;
        g_26 = term;
        i_26 = term;
        h_26 = g_26;
        term = i_26;
        IStrategoTerm term92 = term;
        Success50:
        { 
          Fail62:
          { 
            IStrategoTerm j_26 = null;
            j_26 = term;
            term = h_26;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
              break Fail62;
            term = j_26;
            { 
              term = transform.constInt0;
              if(true)
                break Success50;
            }
          }
          term = term92;
          IStrategoTerm term93 = term;
          Success51:
          { 
            Fail63:
            { 
              IStrategoTerm k_26 = null;
              k_26 = term;
              term = h_26;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                break Fail63;
              term = k_26;
              { 
                term = transform.constLong0;
                if(true)
                  break Success51;
              }
            }
            term = term93;
            IStrategoTerm term94 = term;
            Success52:
            { 
              Fail64:
              { 
                IStrategoTerm l_26 = null;
                l_26 = term;
                term = h_26;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail64;
                term = l_26;
                { 
                  term = transform.constLong0;
                  if(true)
                    break Success52;
                }
              }
              term = term94;
              IStrategoTerm term95 = term;
              Success53:
              { 
                Fail65:
                { 
                  IStrategoTerm m_26 = null;
                  m_26 = term;
                  term = h_26;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail65;
                  term = m_26;
                  { 
                    term = transform.constLong0;
                    if(true)
                      break Success53;
                  }
                }
                term = term95;
                Success54:
                { 
                  Fail66:
                  { 
                    IStrategoTerm n_26 = null;
                    n_26 = term;
                    term = or_2_0.instance.invoke(context, h_26, lifted66.instance, lifted67.instance);
                    if(term == null)
                      break Fail66;
                    term = n_26;
                    { 
                      term = transform.constBoolean0;
                      if(true)
                        break Success54;
                    }
                  }
                  term = debug_0_0.instance.invoke(context, transform.const13);
                  if(term == null)
                    break Fail61;
                  term = debug_0_0.instance.invoke(context, g_26);
                  if(term == null)
                    break Fail61;
                  term = transform.const9;
                  if(true)
                    break Fail61;
                }
              }
            }
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class ee_0_0 extends Strategy 
  { 
    public static ee_0_0 instance = new ee_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("ee_0_0");
      Fail67:
      { 
        IStrategoTerm s_26 = null;
        IStrategoTerm u_26 = null;
        IStrategoTerm v_26 = null;
        s_26 = term;
        v_26 = term;
        u_26 = s_26;
        term = v_26;
        IStrategoTerm term97 = term;
        Success55:
        { 
          Fail68:
          { 
            IStrategoTerm w_26 = null;
            w_26 = term;
            term = u_26;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail68;
            term = w_26;
            { 
              term = transform.constInt0;
              if(true)
                break Success55;
            }
          }
          term = term97;
          IStrategoTerm term98 = term;
          Success56:
          { 
            Fail69:
            { 
              IStrategoTerm x_26 = null;
              x_26 = term;
              term = u_26;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                break Fail69;
              term = x_26;
              { 
                term = transform.constInt0;
                if(true)
                  break Success56;
              }
            }
            term = term98;
            IStrategoTerm term99 = term;
            Success57:
            { 
              Fail70:
              { 
                IStrategoTerm z_26 = null;
                z_26 = term;
                term = u_26;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail70;
                term = z_26;
                { 
                  term = transform.constInt0;
                  if(true)
                    break Success57;
                }
              }
              term = term99;
              IStrategoTerm term100 = term;
              Success58:
              { 
                Fail71:
                { 
                  IStrategoTerm b_27 = null;
                  b_27 = term;
                  term = u_26;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail71;
                  term = b_27;
                  { 
                    term = transform.constLong0;
                    if(true)
                      break Success58;
                  }
                }
                term = term100;
                IStrategoTerm term101 = term;
                Success59:
                { 
                  Fail72:
                  { 
                    IStrategoTerm c_27 = null;
                    c_27 = term;
                    term = or_2_0.instance.invoke(context, u_26, lifted68.instance, lifted69.instance);
                    if(term == null)
                      break Fail72;
                    term = c_27;
                    { 
                      term = transform.constLong0;
                      if(true)
                        break Success59;
                    }
                  }
                  term = term101;
                  IStrategoTerm term102 = term;
                  Success60:
                  { 
                    Fail73:
                    { 
                      IStrategoTerm e_27 = null;
                      e_27 = term;
                      term = u_26;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail73;
                      term = e_27;
                      { 
                        term = transform.constLong0;
                        if(true)
                          break Success60;
                      }
                    }
                    term = term102;
                    Success61:
                    { 
                      Fail74:
                      { 
                        IStrategoTerm h_27 = null;
                        h_27 = term;
                        term = u_26;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail74;
                        term = h_27;
                        { 
                          term = transform.constLong0;
                          if(true)
                            break Success61;
                        }
                      }
                      term = transform.const9;
                      if(true)
                        break Fail67;
                    }
                  }
                }
              }
            }
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class ff_0_0 extends Strategy 
  { 
    public static ff_0_0 instance = new ff_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("ff_0_0");
      Fail75:
      { 
        IStrategoTerm term104 = term;
        Success62:
        { 
          Fail76:
          { 
            IStrategoTerm a_28 = null;
            IStrategoTerm b_28 = null;
            IStrategoTerm c_28 = null;
            a_28 = term;
            c_28 = term;
            b_28 = a_28;
            term = c_28;
            IStrategoTerm term105 = term;
            Success63:
            { 
              Fail77:
              { 
                IStrategoTerm d_28 = null;
                d_28 = term;
                term = b_28;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail77;
                term = d_28;
                { 
                  term = transform.constInt0;
                  if(true)
                    break Success63;
                }
              }
              term = term105;
              IStrategoTerm term106 = term;
              Success64:
              { 
                Fail78:
                { 
                  IStrategoTerm e_28 = null;
                  e_28 = term;
                  term = b_28;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail78;
                  term = e_28;
                  { 
                    term = transform.constInt0;
                    if(true)
                      break Success64;
                  }
                }
                term = term106;
                IStrategoTerm term107 = term;
                Success65:
                { 
                  Fail79:
                  { 
                    IStrategoTerm f_28 = null;
                    f_28 = term;
                    term = b_28;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail79;
                    term = f_28;
                    { 
                      term = transform.constInt0;
                      if(true)
                        break Success65;
                    }
                  }
                  term = term107;
                  IStrategoTerm term108 = term;
                  Success66:
                  { 
                    Fail80:
                    { 
                      IStrategoTerm g_28 = null;
                      g_28 = term;
                      term = b_28;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail80;
                      term = g_28;
                      { 
                        term = transform.constLong0;
                        if(true)
                          break Success66;
                      }
                    }
                    term = term108;
                    IStrategoTerm term109 = term;
                    Success67:
                    { 
                      Fail81:
                      { 
                        IStrategoTerm i_28 = null;
                        i_28 = term;
                        term = or_2_0.instance.invoke(context, b_28, lifted70.instance, lifted71.instance);
                        if(term == null)
                          break Fail81;
                        term = i_28;
                        { 
                          term = transform.constFloat0;
                          if(true)
                            break Success67;
                        }
                      }
                      term = term109;
                      IStrategoTerm term110 = term;
                      Success68:
                      { 
                        Fail82:
                        { 
                          IStrategoTerm j_28 = null;
                          j_28 = term;
                          term = b_28;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail82;
                          term = j_28;
                          { 
                            term = transform.constDouble0;
                            if(true)
                              break Success68;
                          }
                        }
                        term = term110;
                        Success69:
                        { 
                          Fail83:
                          { 
                            IStrategoTerm k_28 = null;
                            k_28 = term;
                            term = b_28;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                              break Fail83;
                            term = k_28;
                            { 
                              term = transform.constLong0;
                              if(true)
                                break Success69;
                            }
                          }
                          term = transform.const9;
                          if(true)
                            break Fail76;
                        }
                      }
                    }
                  }
                }
              }
            }
            if(true)
              break Success62;
          }
          term = term104;
          IStrategoTerm n_27 = null;
          IStrategoTerm o_27 = null;
          IStrategoTerm p_27 = null;
          n_27 = term;
          p_27 = term;
          o_27 = n_27;
          term = p_27;
          IStrategoTerm term112 = term;
          Success70:
          { 
            Fail84:
            { 
              IStrategoTerm q_27 = null;
              q_27 = term;
              term = o_27;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
                break Fail84;
              term = q_27;
              { 
                term = transform.constInt0;
                if(true)
                  break Success70;
              }
            }
            term = term112;
            IStrategoTerm term113 = term;
            Success71:
            { 
              Fail85:
              { 
                IStrategoTerm r_27 = null;
                r_27 = term;
                term = o_27;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail85;
                term = r_27;
                { 
                  term = transform.constInt0;
                  if(true)
                    break Success71;
                }
              }
              term = term113;
              IStrategoTerm term114 = term;
              Success72:
              { 
                Fail86:
                { 
                  IStrategoTerm t_27 = null;
                  t_27 = term;
                  term = o_27;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail86;
                  term = t_27;
                  { 
                    term = transform.constInt0;
                    if(true)
                      break Success72;
                  }
                }
                term = term114;
                IStrategoTerm term115 = term;
                Success73:
                { 
                  Fail87:
                  { 
                    IStrategoTerm u_27 = null;
                    u_27 = term;
                    term = o_27;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail87;
                    term = u_27;
                    { 
                      term = transform.constLong0;
                      if(true)
                        break Success73;
                    }
                  }
                  term = term115;
                  IStrategoTerm term116 = term;
                  Success74:
                  { 
                    Fail88:
                    { 
                      IStrategoTerm v_27 = null;
                      v_27 = term;
                      term = or_2_0.instance.invoke(context, o_27, lifted72.instance, lifted73.instance);
                      if(term == null)
                        break Fail88;
                      term = v_27;
                      { 
                        term = transform.constFloat0;
                        if(true)
                          break Success74;
                      }
                    }
                    term = term116;
                    IStrategoTerm term117 = term;
                    Success75:
                    { 
                      Fail89:
                      { 
                        IStrategoTerm w_27 = null;
                        w_27 = term;
                        term = o_27;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                          break Fail89;
                        term = w_27;
                        { 
                          term = transform.constDouble0;
                          if(true)
                            break Success75;
                        }
                      }
                      term = term117;
                      Success76:
                      { 
                        Fail90:
                        { 
                          IStrategoTerm x_27 = null;
                          x_27 = term;
                          term = o_27;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                            break Fail90;
                          term = x_27;
                          { 
                            term = transform.constLong0;
                            if(true)
                              break Success76;
                          }
                        }
                        term = transform.const9;
                        if(true)
                          break Fail75;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gg_0_0 extends Strategy 
  { 
    public static gg_0_0 instance = new gg_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("gg_0_0");
      Fail91:
      { 
        IStrategoTerm n_28 = null;
        IStrategoTerm p_28 = null;
        IStrategoTerm q_28 = null;
        n_28 = term;
        q_28 = term;
        p_28 = n_28;
        term = q_28;
        IStrategoTerm term119 = term;
        Success77:
        { 
          Fail92:
          { 
            IStrategoTerm s_28 = null;
            s_28 = term;
            term = p_28;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail92;
            term = s_28;
            { 
              term = transform.constLong0;
              if(true)
                break Success77;
            }
          }
          term = term119;
          IStrategoTerm term120 = term;
          Success78:
          { 
            Fail93:
            { 
              IStrategoTerm t_28 = null;
              t_28 = term;
              term = or_2_0.instance.invoke(context, p_28, lifted74.instance, lifted75.instance);
              if(term == null)
                break Fail93;
              term = t_28;
              { 
                term = transform.constLong0;
                if(true)
                  break Success78;
              }
            }
            term = term120;
            IStrategoTerm term121 = term;
            Success79:
            { 
              Fail94:
              { 
                IStrategoTerm u_28 = null;
                u_28 = term;
                term = p_28;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail94;
                term = u_28;
                { 
                  term = transform.constLong0;
                  if(true)
                    break Success79;
                }
              }
              term = term121;
              IStrategoTerm term122 = term;
              Success80:
              { 
                Fail95:
                { 
                  IStrategoTerm x_28 = null;
                  x_28 = term;
                  term = p_28;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail95;
                  term = x_28;
                  { 
                    term = transform.constLong0;
                    if(true)
                      break Success80;
                  }
                }
                term = term122;
                IStrategoTerm term123 = term;
                Success81:
                { 
                  Fail96:
                  { 
                    IStrategoTerm y_28 = null;
                    y_28 = term;
                    term = p_28;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail96;
                    term = y_28;
                    { 
                      term = transform.constLong0;
                      if(true)
                        break Success81;
                    }
                  }
                  term = term123;
                  IStrategoTerm term124 = term;
                  Success82:
                  { 
                    Fail97:
                    { 
                      IStrategoTerm z_28 = null;
                      z_28 = term;
                      term = p_28;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail97;
                      term = z_28;
                      { 
                        term = transform.constLong0;
                        if(true)
                          break Success82;
                      }
                    }
                    term = term124;
                    Success83:
                    { 
                      Fail98:
                      { 
                        IStrategoTerm a_29 = null;
                        a_29 = term;
                        term = or_2_0.instance.invoke(context, p_28, lifted76.instance, lifted77.instance);
                        if(term == null)
                          break Fail98;
                        term = a_29;
                        { 
                          term = transform.constBoolean0;
                          if(true)
                            break Success83;
                        }
                      }
                      term = debug_0_0.instance.invoke(context, transform.const13);
                      if(term == null)
                        break Fail91;
                      term = debug_0_0.instance.invoke(context, n_28);
                      if(term == null)
                        break Fail91;
                      term = transform.const9;
                      if(true)
                        break Fail91;
                    }
                  }
                }
              }
            }
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class ensure__number_0_0 extends Strategy 
  { 
    public static ensure__number_0_0 instance = new ensure__number_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("ensure__number_0_0");
      Fail99:
      { 
        IStrategoTerm f_29 = null;
        IStrategoTerm g_29 = null;
        IStrategoTerm h_29 = null;
        f_29 = term;
        h_29 = term;
        g_29 = f_29;
        term = h_29;
        IStrategoTerm term126 = term;
        Success84:
        { 
          Fail100:
          { 
            IStrategoTerm i_29 = null;
            i_29 = term;
            term = g_29;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail100;
            term = i_29;
            { 
              term = transform.constByte0;
              if(true)
                break Success84;
            }
          }
          term = term126;
          IStrategoTerm term127 = term;
          Success85:
          { 
            Fail101:
            { 
              IStrategoTerm j_29 = null;
              j_29 = term;
              term = or_2_0.instance.invoke(context, g_29, lifted78.instance, lifted79.instance);
              if(term == null)
                break Fail101;
              term = j_29;
              { 
                term = transform.constChar0;
                if(true)
                  break Success85;
              }
            }
            term = term127;
            IStrategoTerm term128 = term;
            Success86:
            { 
              Fail102:
              { 
                IStrategoTerm k_29 = null;
                k_29 = term;
                term = g_29;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consShort_0 != ((IStrategoAppl)term).getConstructor())
                  break Fail102;
                term = k_29;
                { 
                  term = transform.constShort0;
                  if(true)
                    break Success86;
                }
              }
              term = term128;
              IStrategoTerm term129 = term;
              Success87:
              { 
                Fail103:
                { 
                  IStrategoTerm l_29 = null;
                  l_29 = term;
                  term = g_29;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                    break Fail103;
                  term = l_29;
                  { 
                    term = transform.constInt0;
                    if(true)
                      break Success87;
                  }
                }
                term = term129;
                IStrategoTerm term130 = term;
                Success88:
                { 
                  Fail104:
                  { 
                    IStrategoTerm m_29 = null;
                    m_29 = term;
                    term = g_29;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail104;
                    term = m_29;
                    { 
                      term = transform.constLong0;
                      if(true)
                        break Success88;
                    }
                  }
                  term = term130;
                  IStrategoTerm term131 = term;
                  Success89:
                  { 
                    Fail105:
                    { 
                      IStrategoTerm n_29 = null;
                      n_29 = term;
                      term = g_29;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail105;
                      term = n_29;
                      { 
                        term = transform.constLong0;
                        if(true)
                          break Success89;
                      }
                    }
                    term = term131;
                    IStrategoTerm term132 = term;
                    Success90:
                    { 
                      Fail106:
                      { 
                        IStrategoTerm o_29 = null;
                        o_29 = term;
                        term = or_2_0.instance.invoke(context, g_29, lifted80.instance, lifted81.instance);
                        if(term == null)
                          break Fail106;
                        term = o_29;
                        { 
                          term = transform.constFloat0;
                          if(true)
                            break Success90;
                        }
                      }
                      term = term132;
                      Success91:
                      { 
                        Fail107:
                        { 
                          IStrategoTerm p_29 = null;
                          p_29 = term;
                          term = g_29;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                            break Fail107;
                          term = p_29;
                          { 
                            term = transform.constDouble0;
                            if(true)
                              break Success91;
                          }
                        }
                        term = debug_0_0.instance.invoke(context, transform.const13);
                        if(term == null)
                          break Fail99;
                        term = debug_0_0.instance.invoke(context, f_29);
                        if(term == null)
                          break Fail99;
                        term = transform.const9;
                        if(true)
                          break Fail99;
                      }
                    }
                  }
                }
              }
            }
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_$L$H$S_type_0_3 extends Strategy 
  { 
    public static get_$L$H$S_type_0_3 instance = new get_$L$H$S_type_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_29, IStrategoTerm t_29, IStrategoTerm u_29)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("get_LHS_type_0_3");
      Fail108:
      { 
        IStrategoTerm v_29 = null;
        IStrategoTerm w_29 = null;
        IStrategoTerm z_29 = null;
        z_29 = term;
        v_29 = term;
        term = get_type_of_0_3.instance.invoke(context, z_29, s_29, t_29, u_29);
        if(term == null)
          break Fail108;
        w_29 = term;
        Success92:
        { 
          Fail109:
          { 
            IStrategoTerm y_29 = null;
            y_29 = term;
            term = termFactory.makeTuple(w_29, transform.constNone0);
            term = equal_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail109;
            term = y_29;
            { 
              term = debug_0_0.instance.invoke(context, transform.const14);
              if(term == null)
                break Fail108;
              term = debug_0_0.instance.invoke(context, v_29);
              if(term == null)
                break Fail108;
              term = transform.const9;
              if(true)
                break Fail108;
              if(true)
                break Success92;
            }
          }
          term = w_29;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_type_of_0_3 extends Strategy 
  { 
    public static get_type_of_0_3 instance = new get_type_of_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_30, IStrategoTerm c_30, IStrategoTerm d_30)
    { 
      context.push("get_type_of_0_3");
      Fail110:
      { 
        IStrategoTerm e_30 = null;
        IStrategoTerm term135 = term;
        Success93:
        { 
          Fail111:
          { 
            IStrategoTerm j_30 = null;
            j_30 = term;
            IStrategoTerm term136 = term;
            Success94:
            { 
              Fail112:
              { 
                term = type_of_0_3.instance.invoke(context, term, b_30, c_30, d_30);
                if(term == null)
                  break Fail112;
                e_30 = term;
                { 
                  if(true)
                    break Fail111;
                  if(true)
                    break Success94;
                }
              }
              term = term136;
            }
            term = j_30;
            { 
              term = transform.constNone0;
              if(e_30 == null)
                e_30 = term;
              else
                if(e_30 != term && !e_30.match(term))
                  break Fail110;
              if(true)
                break Success93;
            }
          }
          term = term135;
        }
        if(e_30 == null)
          break Fail110;
        term = e_30;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class handle_expr_0_7 extends Strategy 
  { 
    public static handle_expr_0_7 instance = new handle_expr_0_7();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_30, IStrategoTerm e_31, IStrategoTerm l_31, IStrategoTerm m_31, IStrategoTerm n_31, IStrategoTerm e_32, IStrategoTerm f_32)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("handle_expr_0_7");
      Fail113:
      { 
        IStrategoTerm d_33 = null;
        IStrategoTerm e_33 = null;
        IStrategoTerm f_33 = null;
        IStrategoTerm m_33 = null;
        m_33 = term;
        d_33 = term;
        term = fetch_0_0.instance.invoke(context, m_33);
        if(term == null)
          break Fail113;
        e_33 = term;
        IStrategoTerm term137 = term;
        Success95:
        { 
          Fail114:
          { 
            IStrategoTerm k_33 = null;
            k_33 = term;
            term = hashtable_keys_0_0.instance.invoke(context, m_30);
            if(term == null)
              break Fail114;
            term = termFactory.makeTuple(e_33, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail114;
            term = k_33;
            { 
              term = d_33;
              if(true)
                break Success95;
            }
          }
          term = term137;
          IStrategoTerm term138 = term;
          Success96:
          { 
            Fail115:
            { 
              IStrategoTerm l_33 = null;
              l_33 = term;
              term = termFactory.makeTuple(e_32, transform.constFalse0);
              term = equal_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail115;
              term = l_33;
              { 
                term = debug_0_0.instance.invoke(context, transform.const15);
                if(term == null)
                  break Fail113;
                term = debug_0_0.instance.invoke(context, d_33);
                if(term == null)
                  break Fail113;
                term = transform.const9;
                if(true)
                  break Fail113;
                if(true)
                  break Success96;
              }
            }
            term = term138;
            IStrategoTerm x_33 = null;
            term = generate_ref_method__name_0_2.instance.invoke(context, term, e_33, m_31);
            if(term == null)
              break Fail113;
            f_33 = term;
            term = e_31;
            x_33 = e_31;
            term = ddd_0_4.instance.invoke(context, term, e_33, f_33, n_31, f_32);
            if(term == null)
              break Fail113;
            term = iset_add_0_1.instance.invoke(context, x_33, term);
            if(term == null)
              break Fail113;
            term = iset_add_0_1.instance.invoke(context, l_31, e_33);
            if(term == null)
              break Fail113;
            term = generate_invoke_ref_0_1.instance.invoke(context, transform.const9, f_33);
            if(term == null)
              break Fail113;
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }

    @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
    { 
      if(sargs == null || targs == null || sargs.length != 0 || targs.length != 7)
        throw new IllegalArgumentException("Illegal arguments for " + getName());
      return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5], targs[6]);
    }
  }

  @SuppressWarnings("all") public static class generate_invoke_ref_0_1 extends Strategy 
  { 
    public static generate_invoke_ref_0_1 instance = new generate_invoke_ref_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_34)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail116:
      { 
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{a_34})})}), transform.constCons1});
        if(true)
          return term;
      }
      context.push("generate_invoke_ref_0_1");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class generate_ref_method__name_0_2 extends Strategy 
  { 
    public static generate_ref_method__name_0_2 instance = new generate_ref_method__name_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_34, IStrategoTerm c_34)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("generate_ref_method__name_0_2");
      Fail117:
      { 
        IStrategoTerm d_34 = null;
        IStrategoTerm term139 = term;
        Success97:
        { 
          Fail118:
          { 
            IStrategoTerm f_34 = null;
            f_34 = term;
            IStrategoTerm term140 = term;
            Success98:
            { 
              Fail119:
              { 
                term = hashtable_keys_0_0.instance.invoke(context, c_34);
                if(term == null)
                  break Fail119;
                term = termFactory.makeTuple(b_34, term);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail119;
                { 
                  if(true)
                    break Fail118;
                  if(true)
                    break Success98;
                }
              }
              term = term140;
            }
            term = f_34;
            { 
              term = hashtable_keys_0_0.instance.invoke(context, c_34);
              if(term == null)
                break Fail117;
              term = length_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail117;
              term = termFactory.makeTuple(term, transform.const17);
              term = add_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail117;
              d_34 = term;
              term = int_to_string_0_0.instance.invoke(context, d_34);
              if(term == null)
                break Fail117;
              term = (IStrategoTerm)termFactory.makeListCons(transform.const18, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail117;
              term = hashtable_put_0_2.instance.invoke(context, c_34, b_34, term);
              if(term == null)
                break Fail117;
              if(true)
                break Success97;
            }
          }
          term = term139;
        }
        term = hashtable_get_0_1.instance.invoke(context, c_34, b_34);
        if(term == null)
          break Fail117;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class increament_0_2 extends Strategy 
  { 
    public static increament_0_2 instance = new increament_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_34, IStrategoTerm n_34)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("increament_0_2");
      Fail120:
      { 
        IStrategoTerm o_34 = null;
        Success99:
        { 
          Fail121:
          { 
            IStrategoTerm p_34 = null;
            p_34 = term;
            term = hashtable_keys_0_0.instance.invoke(context, n_34);
            if(term == null)
              break Fail121;
            term = termFactory.makeTuple(m_34, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail121;
            term = p_34;
            { 
              IStrategoTerm t_34 = null;
              term = hashtable_get_0_1.instance.invoke(context, n_34, m_34);
              if(term == null)
                break Fail120;
              o_34 = term;
              term = hashtable_remove_0_1.instance.invoke(context, n_34, m_34);
              if(term == null)
                break Fail120;
              t_34 = n_34;
              term = termFactory.makeTuple(transform.const17, o_34);
              term = add_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail120;
              term = hashtable_put_0_2.instance.invoke(context, t_34, m_34, term);
              if(term == null)
                break Fail120;
              if(true)
                break Success99;
            }
          }
          IStrategoTerm v_34 = null;
          v_34 = n_34;
          term = hashtable_put_0_2.instance.invoke(context, v_34, m_34, transform.const17);
          if(term == null)
            break Fail120;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class decreament_0_2 extends Strategy 
  { 
    public static decreament_0_2 instance = new decreament_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_34, IStrategoTerm x_34)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("decreament_0_2");
      Fail122:
      { 
        IStrategoTerm y_34 = null;
        IStrategoTerm z_34 = null;
        z_34 = term;
        IStrategoTerm term142 = term;
        Success100:
        { 
          Fail123:
          { 
            IStrategoTerm a_35 = null;
            a_35 = term;
            term = hashtable_keys_0_0.instance.invoke(context, w_34);
            if(term == null)
              break Fail123;
            term = termFactory.makeTuple(z_34, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail123;
            term = a_35;
            { 
              IStrategoTerm h_35 = null;
              term = hashtable_get_0_1.instance.invoke(context, w_34, z_34);
              if(term == null)
                break Fail122;
              y_34 = term;
              term = hashtable_remove_0_1.instance.invoke(context, w_34, z_34);
              if(term == null)
                break Fail122;
              h_35 = w_34;
              term = hashtable_get_0_1.instance.invoke(context, x_34, z_34);
              if(term == null)
                break Fail122;
              term = termFactory.makeTuple(y_34, term);
              term = subti_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail122;
              term = hashtable_put_0_2.instance.invoke(context, h_35, z_34, term);
              if(term == null)
                break Fail122;
              IStrategoTerm term143 = term;
              Success101:
              { 
                Fail124:
                { 
                  IStrategoTerm b_35 = null;
                  b_35 = term;
                  term = hashtable_get_0_1.instance.invoke(context, w_34, z_34);
                  if(term == null)
                    break Fail124;
                  term = termFactory.makeTuple(term, transform.const19);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail124;
                  term = b_35;
                  { 
                    term = hashtable_remove_0_1.instance.invoke(context, w_34, z_34);
                    if(term == null)
                      break Fail122;
                    if(true)
                      break Success101;
                  }
                }
                term = term143;
              }
              if(true)
                break Success100;
            }
          }
          term = term142;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class ddd_0_4 extends Strategy 
  { 
    public static ddd_0_4 instance = new ddd_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_35, IStrategoTerm n_35, IStrategoTerm o_35, IStrategoTerm p_35)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("ddd_0_4");
      Fail125:
      { 
        IStrategoTerm q_35 = null;
        IStrategoTerm r_35 = null;
        IStrategoTerm s_35 = null;
        IStrategoTerm t_35 = null;
        t_35 = term;
        s_35 = o_35;
        term = t_35;
        IStrategoTerm term144 = term;
        Success102:
        { 
          Fail126:
          { 
            IStrategoTerm u_35 = null;
            u_35 = term;
            term = s_35;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consByte_0 != ((IStrategoAppl)term).getConstructor())
              break Fail126;
            term = u_35;
            { 
              q_35 = transform.constByte0;
              term = transform.constLit0;
              r_35 = transform.constLit0;
              if(true)
                break Success102;
            }
          }
          term = term144;
          IStrategoTerm term145 = term;
          Success103:
          { 
            Fail127:
            { 
              IStrategoTerm v_35 = null;
              v_35 = term;
              term = s_35;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consInt_0 != ((IStrategoAppl)term).getConstructor())
                break Fail127;
              term = v_35;
              { 
                q_35 = transform.constInt0;
                term = transform.constLit0;
                r_35 = transform.constLit0;
                if(true)
                  break Success103;
              }
            }
            term = term145;
            IStrategoTerm term146 = term;
            Success104:
            { 
              Fail128:
              { 
                IStrategoTerm w_35 = null;
                w_35 = term;
                term = or_2_0.instance.invoke(context, s_35, lifted82.instance, lifted83.instance);
                if(term == null)
                  break Fail128;
                term = w_35;
                { 
                  q_35 = transform.constBoolean0;
                  term = transform.constLit1;
                  r_35 = transform.constLit1;
                  if(true)
                    break Success104;
                }
              }
              term = term146;
              IStrategoTerm term147 = term;
              Success105:
              { 
                Fail129:
                { 
                  IStrategoTerm x_35 = null;
                  x_35 = term;
                  term = or_2_0.instance.invoke(context, s_35, lifted84.instance, lifted85.instance);
                  if(term == null)
                    break Fail129;
                  term = x_35;
                  { 
                    q_35 = transform.constFloat0;
                    term = transform.constLit2;
                    r_35 = transform.constLit2;
                    if(true)
                      break Success105;
                  }
                }
                term = term147;
                IStrategoTerm term148 = term;
                Success106:
                { 
                  Fail130:
                  { 
                    IStrategoTerm y_35 = null;
                    y_35 = term;
                    term = s_35;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consDouble_0 != ((IStrategoAppl)term).getConstructor())
                      break Fail130;
                    term = y_35;
                    { 
                      q_35 = transform.constDouble0;
                      term = transform.constLit2;
                      r_35 = transform.constLit2;
                      if(true)
                        break Success106;
                    }
                  }
                  term = term148;
                  IStrategoTerm term149 = term;
                  Success107:
                  { 
                    Fail131:
                    { 
                      IStrategoTerm z_35 = null;
                      z_35 = term;
                      term = s_35;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consLong_0 != ((IStrategoAppl)term).getConstructor())
                        break Fail131;
                      term = z_35;
                      { 
                        q_35 = transform.constLong0;
                        term = transform.constLit0;
                        r_35 = transform.constLit0;
                        if(true)
                          break Success107;
                      }
                    }
                    term = term149;
                    Success108:
                    { 
                      Fail132:
                      { 
                        IStrategoTerm a_36 = null;
                        a_36 = term;
                        term = s_35;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeci_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail132;
                        term = a_36;
                        { 
                          q_35 = transform.constDouble0;
                          term = transform.constLit2;
                          r_35 = transform.constLit2;
                          if(true)
                            break Success108;
                        }
                      }
                      q_35 = transform.constClassOrInterfaceType0;
                      term = transform.constLit3;
                      r_35 = transform.constLit3;
                    }
                  }
                }
              }
            }
          }
        }
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId3, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{m_35}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0)}), (IStrategoList)transform.constCons2), transform.constNone0, q_35, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{n_35}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consClassOrInterfaceType_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{p_35})}), transform.constNone0}), transform.constId4}), (IStrategoList)transform.constNil0), transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{r_35})}), (IStrategoList)transform.constNil0)})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_expr_type_0_3 extends Strategy 
  { 
    public static get_expr_type_0_3 instance = new get_expr_type_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_36, IStrategoTerm c_36, IStrategoTerm d_36)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("get_expr_type_0_3");
      Fail133:
      { 
        Success109:
        { 
          Fail134:
          { 
            IStrategoTerm e_36 = null;
            e_36 = term;
            term = hashtable_keys_0_0.instance.invoke(context, c_36);
            if(term == null)
              break Fail134;
            term = termFactory.makeTuple(b_36, term);
            term = elem_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail134;
            term = e_36;
            { 
              term = hashtable_get_0_1.instance.invoke(context, d_36, b_36);
              if(term == null)
                break Fail133;
              if(true)
                break Success109;
            }
          }
          term = transform.constNone0;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class type_of_0_3 extends Strategy 
  { 
    public static type_of_0_3 instance = new type_of_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_58, IStrategoTerm w_58, IStrategoTerm z_58)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("type_of_0_3");
      Fail135:
      { 
        IStrategoTerm term152 = term;
        Success110:
        { 
          Fail136:
          { 
            if(term.getTermType() != IStrategoTerm.APPL || transform._consComplement_1 != ((IStrategoAppl)term).getConstructor())
              break Fail136;
            Success111:
            { 
              Fail137:
              { 
                IStrategoTerm a_42 = null;
                a_42 = term;
                term = termFactory.makeTuple(v_58, transform.constNone0);
                term = equal_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail137;
                term = a_42;
                { 
                  term = transform.constLong0;
                  if(true)
                    break Success111;
                }
              }
              term = v_58;
            }
            if(true)
              break Success110;
          }
          term = term152;
          IStrategoTerm term154 = term;
          Success112:
          { 
            Fail138:
            { 
              term = or_2_0.instance.invoke(context, term, lifted86.instance, lifted87.instance);
              if(term == null)
                break Fail138;
              Success113:
              { 
                Fail139:
                { 
                  IStrategoTerm w_41 = null;
                  w_41 = term;
                  term = termFactory.makeTuple(v_58, transform.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail139;
                  term = w_41;
                  { 
                    term = transform.constDouble0;
                    if(true)
                      break Success113;
                  }
                }
                term = v_58;
              }
              if(true)
                break Success112;
            }
            term = term154;
            IStrategoTerm term156 = term;
            Success114:
            { 
              Fail140:
              { 
                term = or_2_0.instance.invoke(context, term, lifted88.instance, lifted95.instance);
                if(term == null)
                  break Fail140;
                Success115:
                { 
                  Fail141:
                  { 
                    IStrategoTerm s_41 = null;
                    s_41 = term;
                    term = termFactory.makeTuple(v_58, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail141;
                    term = s_41;
                    { 
                      term = transform.constDouble0;
                      if(true)
                        break Success115;
                    }
                  }
                  term = ff_0_0.instance.invoke(context, v_58);
                  if(term == null)
                    break Fail140;
                }
                if(true)
                  break Success114;
              }
              term = term156;
              IStrategoTerm term158 = term;
              Success116:
              { 
                Fail142:
                { 
                  TermReference n_41 = new TermReference();
                  lifted99 lifted990 = new lifted99();
                  lifted96 lifted960 = new lifted96();
                  lifted990.n_41 = n_41;
                  lifted960.n_41 = n_41;
                  term = or_2_0.instance.invoke(context, term, lifted960, lifted990);
                  if(term == null)
                    break Fail142;
                  Success117:
                  { 
                    Fail143:
                    { 
                      IStrategoTerm o_41 = null;
                      o_41 = term;
                      term = termFactory.makeTuple(v_58, transform.constNone0);
                      term = equal_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail143;
                      term = o_41;
                      { 
                        if(n_41.value == null)
                          break Fail142;
                        term = get_type_of_0_3.instance.invoke(context, n_41.value, v_58, w_58, z_58);
                        if(term == null)
                          break Fail142;
                        term = ee_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail142;
                        if(true)
                          break Success117;
                      }
                    }
                    term = ee_0_0.instance.invoke(context, v_58);
                    if(term == null)
                      break Fail142;
                  }
                  if(true)
                    break Success116;
                }
                term = term158;
                IStrategoTerm term160 = term;
                IStrategoConstructor cons3 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                Success118:
                { 
                  if(cons3 == transform._consAnd_2)
                  { 
                    Fail144:
                    { 
                      IStrategoTerm h_41 = null;
                      IStrategoTerm i_41 = null;
                      h_41 = term.getSubterm(0);
                      i_41 = term.getSubterm(1);
                      Success119:
                      { 
                        Fail145:
                        { 
                          IStrategoTerm j_41 = null;
                          j_41 = term;
                          term = termFactory.makeTuple(v_58, transform.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail145;
                          term = j_41;
                          { 
                            term = termFactory.makeTuple(h_41, i_41);
                            term = gogo_0_3.instance.invoke(context, term, v_58, w_58, z_58);
                            if(term == null)
                              break Fail144;
                            term = gg_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail144;
                            if(true)
                              break Success119;
                          }
                        }
                        term = cc_0_0.instance.invoke(context, v_58);
                        if(term == null)
                          break Fail144;
                      }
                      if(true)
                        break Success118;
                    }
                    term = term160;
                  }
                  Success120:
                  { 
                    if(cons3 == transform._consExcOr_2)
                    { 
                      Fail146:
                      { 
                        IStrategoTerm b_41 = null;
                        IStrategoTerm c_41 = null;
                        b_41 = term.getSubterm(0);
                        c_41 = term.getSubterm(1);
                        Success121:
                        { 
                          Fail147:
                          { 
                            IStrategoTerm d_41 = null;
                            d_41 = term;
                            term = termFactory.makeTuple(v_58, transform.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail147;
                            term = d_41;
                            { 
                              term = termFactory.makeTuple(b_41, c_41);
                              term = gogo_0_3.instance.invoke(context, term, v_58, w_58, z_58);
                              if(term == null)
                                break Fail146;
                              term = gg_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail146;
                              if(true)
                                break Success121;
                            }
                          }
                          term = cc_0_0.instance.invoke(context, v_58);
                          if(term == null)
                            break Fail146;
                        }
                        if(true)
                          break Success120;
                      }
                      term = term160;
                    }
                    Success122:
                    { 
                      if(cons3 == transform._consOr_2)
                      { 
                        Fail148:
                        { 
                          IStrategoTerm v_40 = null;
                          IStrategoTerm w_40 = null;
                          v_40 = term.getSubterm(0);
                          w_40 = term.getSubterm(1);
                          Success123:
                          { 
                            Fail149:
                            { 
                              IStrategoTerm x_40 = null;
                              x_40 = term;
                              term = termFactory.makeTuple(v_58, transform.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail149;
                              term = x_40;
                              { 
                                term = termFactory.makeTuple(v_40, w_40);
                                term = gogo_0_3.instance.invoke(context, term, v_58, w_58, z_58);
                                if(term == null)
                                  break Fail148;
                                term = gg_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail148;
                                if(true)
                                  break Success123;
                              }
                            }
                            term = cc_0_0.instance.invoke(context, v_58);
                            if(term == null)
                              break Fail148;
                          }
                          if(true)
                            break Success122;
                        }
                        term = term160;
                      }
                      IStrategoTerm term166 = term;
                      Success124:
                      { 
                        Fail150:
                        { 
                          TermReference o_40 = new TermReference();
                          IStrategoTerm p_40 = null;
                          lifted103 lifted1030 = new lifted103();
                          lifted100 lifted1000 = new lifted100();
                          lifted1030.o_40 = o_40;
                          lifted1000.o_40 = o_40;
                          term = or_2_0.instance.invoke(context, term, lifted1000, lifted1030);
                          if(term == null)
                            break Fail150;
                          if(o_40.value == null)
                            break Fail150;
                          term = get_type_of_0_3.instance.invoke(context, o_40.value, v_58, w_58, z_58);
                          if(term == null)
                            break Fail150;
                          p_40 = term;
                          Success125:
                          { 
                            Fail151:
                            { 
                              IStrategoTerm q_40 = null;
                              q_40 = term;
                              term = termFactory.makeTuple(p_40, transform.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail151;
                              term = q_40;
                              { 
                                Success126:
                                { 
                                  Fail152:
                                  { 
                                    IStrategoTerm r_40 = null;
                                    r_40 = term;
                                    term = termFactory.makeTuple(v_58, transform.constNone0);
                                    term = equal_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail152;
                                    term = r_40;
                                    { 
                                      term = transform.constDouble0;
                                      if(true)
                                        break Success126;
                                    }
                                  }
                                  term = ensure__number_0_0.instance.invoke(context, v_58);
                                  if(term == null)
                                    break Fail150;
                                }
                                if(true)
                                  break Success125;
                              }
                            }
                            term = ensure__number_0_0.instance.invoke(context, p_40);
                            if(term == null)
                              break Fail150;
                          }
                          if(true)
                            break Success124;
                        }
                        term = term166;
                        IStrategoTerm term169 = term;
                        IStrategoConstructor cons4 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                        Success127:
                        { 
                          if(cons4 == transform._consExprName_1)
                          { 
                            Fail153:
                            { 
                              IStrategoTerm i_40 = null;
                              i_40 = term;
                              term = fetch_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail153;
                              term = get_expr_type_0_3.instance.invoke(context, i_40, term, w_58, z_58);
                              if(term == null)
                                break Fail153;
                              if(true)
                                break Success127;
                            }
                            term = term169;
                          }
                          Success128:
                          { 
                            if(cons4 == transform._consExprName_2)
                            { 
                              Fail154:
                              { 
                                IStrategoTerm y_39 = null;
                                y_39 = term;
                                term = fetch_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail154;
                                term = get_expr_type_0_3.instance.invoke(context, y_39, term, w_58, z_58);
                                if(term == null)
                                  break Fail154;
                                if(true)
                                  break Success128;
                              }
                              term = term169;
                            }
                            Success129:
                            { 
                              if(cons4 == transform._consLit_1)
                              { 
                                Fail155:
                                { 
                                  IStrategoTerm p_39 = null;
                                  p_39 = term.getSubterm(0);
                                  term = p_39;
                                  if(true)
                                    break Success129;
                                }
                                term = term169;
                              }
                              Success130:
                              { 
                                if(cons4 == transform._consNot_1)
                                { 
                                  Fail156:
                                  { 
                                    term = transform.constBoolean0;
                                    if(true)
                                      break Success130;
                                  }
                                  term = term169;
                                }
                                Success131:
                                { 
                                  if(cons4 == transform._consLt_2)
                                  { 
                                    Fail157:
                                    { 
                                      term = transform.constBoolean0;
                                      if(true)
                                        break Success131;
                                    }
                                    term = term169;
                                  }
                                  Success132:
                                  { 
                                    if(cons4 == transform._consGt_2)
                                    { 
                                      Fail158:
                                      { 
                                        term = transform.constBoolean0;
                                        if(true)
                                          break Success132;
                                      }
                                      term = term169;
                                    }
                                    Success133:
                                    { 
                                      if(cons4 == transform._consLtEq_2)
                                      { 
                                        Fail159:
                                        { 
                                          term = transform.constBoolean0;
                                          if(true)
                                            break Success133;
                                        }
                                        term = term169;
                                      }
                                      Success134:
                                      { 
                                        if(cons4 == transform._consGtEq_2)
                                        { 
                                          Fail160:
                                          { 
                                            term = transform.constBoolean0;
                                            if(true)
                                              break Success134;
                                          }
                                          term = term169;
                                        }
                                        Success135:
                                        { 
                                          if(cons4 == transform._consEq_2)
                                          { 
                                            Fail161:
                                            { 
                                              term = transform.constBoolean0;
                                              if(true)
                                                break Success135;
                                            }
                                            term = term169;
                                          }
                                          Success136:
                                          { 
                                            if(cons4 == transform._consNotEq_2)
                                            { 
                                              Fail162:
                                              { 
                                                term = transform.constBoolean0;
                                                if(true)
                                                  break Success136;
                                              }
                                              term = term169;
                                            }
                                            Success137:
                                            { 
                                              if(cons4 == transform._consLazyAnd_2)
                                              { 
                                                Fail163:
                                                { 
                                                  term = transform.constBoolean0;
                                                  if(true)
                                                    break Success137;
                                                }
                                                term = term169;
                                              }
                                              Success138:
                                              { 
                                                if(cons4 == transform._consLazyOr_2)
                                                { 
                                                  Fail164:
                                                  { 
                                                    term = transform.constBoolean0;
                                                    if(true)
                                                      break Success138;
                                                  }
                                                  term = term169;
                                                }
                                                Success139:
                                                { 
                                                  if(cons4 == transform._consAssign_2)
                                                  { 
                                                    Fail165:
                                                    { 
                                                      IStrategoTerm k_38 = null;
                                                      k_38 = term.getSubterm(0);
                                                      term = this.invoke(context, k_38, v_58, w_58, z_58);
                                                      if(term == null)
                                                        break Fail165;
                                                      if(true)
                                                        break Success139;
                                                    }
                                                    term = term169;
                                                  }
                                                  Success140:
                                                  { 
                                                    if(cons4 == transform._consAssignMul_2)
                                                    { 
                                                      Fail166:
                                                      { 
                                                        IStrategoTerm g_38 = null;
                                                        g_38 = term.getSubterm(0);
                                                        term = this.invoke(context, g_38, v_58, w_58, z_58);
                                                        if(term == null)
                                                          break Fail166;
                                                        if(true)
                                                          break Success140;
                                                      }
                                                      term = term169;
                                                    }
                                                    Success141:
                                                    { 
                                                      if(cons4 == transform._consAssignDiv_2)
                                                      { 
                                                        Fail167:
                                                        { 
                                                          IStrategoTerm c_38 = null;
                                                          c_38 = term.getSubterm(0);
                                                          term = this.invoke(context, c_38, v_58, w_58, z_58);
                                                          if(term == null)
                                                            break Fail167;
                                                          if(true)
                                                            break Success141;
                                                        }
                                                        term = term169;
                                                      }
                                                      Success142:
                                                      { 
                                                        if(cons4 == transform._consAssignRemain_2)
                                                        { 
                                                          Fail168:
                                                          { 
                                                            IStrategoTerm y_37 = null;
                                                            y_37 = term.getSubterm(0);
                                                            term = this.invoke(context, y_37, v_58, w_58, z_58);
                                                            if(term == null)
                                                              break Fail168;
                                                            if(true)
                                                              break Success142;
                                                          }
                                                          term = term169;
                                                        }
                                                        Success143:
                                                        { 
                                                          if(cons4 == transform._consAssignPlus_2)
                                                          { 
                                                            Fail169:
                                                            { 
                                                              IStrategoTerm u_37 = null;
                                                              u_37 = term.getSubterm(0);
                                                              term = this.invoke(context, u_37, v_58, w_58, z_58);
                                                              if(term == null)
                                                                break Fail169;
                                                              if(true)
                                                                break Success143;
                                                            }
                                                            term = term169;
                                                          }
                                                          Success144:
                                                          { 
                                                            if(cons4 == transform._consAssignMinus_2)
                                                            { 
                                                              Fail170:
                                                              { 
                                                                IStrategoTerm q_37 = null;
                                                                q_37 = term.getSubterm(0);
                                                                term = this.invoke(context, q_37, v_58, w_58, z_58);
                                                                if(term == null)
                                                                  break Fail170;
                                                                if(true)
                                                                  break Success144;
                                                              }
                                                              term = term169;
                                                            }
                                                            Success145:
                                                            { 
                                                              if(cons4 == transform._consAssignLeftShift_2)
                                                              { 
                                                                Fail171:
                                                                { 
                                                                  IStrategoTerm m_37 = null;
                                                                  m_37 = term.getSubterm(0);
                                                                  term = this.invoke(context, m_37, v_58, w_58, z_58);
                                                                  if(term == null)
                                                                    break Fail171;
                                                                  if(true)
                                                                    break Success145;
                                                                }
                                                                term = term169;
                                                              }
                                                              Success146:
                                                              { 
                                                                if(cons4 == transform._consAssignRightShift_2)
                                                                { 
                                                                  Fail172:
                                                                  { 
                                                                    IStrategoTerm i_37 = null;
                                                                    i_37 = term.getSubterm(0);
                                                                    term = this.invoke(context, i_37, v_58, w_58, z_58);
                                                                    if(term == null)
                                                                      break Fail172;
                                                                    if(true)
                                                                      break Success146;
                                                                  }
                                                                  term = term169;
                                                                }
                                                                Success147:
                                                                { 
                                                                  if(cons4 == transform._consAssignURightShift_2)
                                                                  { 
                                                                    Fail173:
                                                                    { 
                                                                      IStrategoTerm e_37 = null;
                                                                      e_37 = term.getSubterm(0);
                                                                      term = this.invoke(context, e_37, v_58, w_58, z_58);
                                                                      if(term == null)
                                                                        break Fail173;
                                                                      if(true)
                                                                        break Success147;
                                                                    }
                                                                    term = term169;
                                                                  }
                                                                  Success148:
                                                                  { 
                                                                    if(cons4 == transform._consAssignAnd_2)
                                                                    { 
                                                                      Fail174:
                                                                      { 
                                                                        IStrategoTerm a_37 = null;
                                                                        a_37 = term.getSubterm(0);
                                                                        term = this.invoke(context, a_37, v_58, w_58, z_58);
                                                                        if(term == null)
                                                                          break Fail174;
                                                                        if(true)
                                                                          break Success148;
                                                                      }
                                                                      term = term169;
                                                                    }
                                                                    Success149:
                                                                    { 
                                                                      if(cons4 == transform._consAssignExcOr_2)
                                                                      { 
                                                                        Fail175:
                                                                        { 
                                                                          IStrategoTerm w_36 = null;
                                                                          w_36 = term.getSubterm(0);
                                                                          term = this.invoke(context, w_36, v_58, w_58, z_58);
                                                                          if(term == null)
                                                                            break Fail175;
                                                                          if(true)
                                                                            break Success149;
                                                                        }
                                                                        term = term169;
                                                                      }
                                                                      Success150:
                                                                      { 
                                                                        if(cons4 == transform._consAssignOr_2)
                                                                        { 
                                                                          Fail176:
                                                                          { 
                                                                            IStrategoTerm s_36 = null;
                                                                            s_36 = term.getSubterm(0);
                                                                            term = this.invoke(context, s_36, v_58, w_58, z_58);
                                                                            if(term == null)
                                                                              break Fail176;
                                                                            if(true)
                                                                              break Success150;
                                                                          }
                                                                          term = term169;
                                                                        }
                                                                        Success151:
                                                                        { 
                                                                          if(cons4 == transform._consCastPrim_2)
                                                                          { 
                                                                            Fail177:
                                                                            { 
                                                                              IStrategoTerm o_36 = null;
                                                                              o_36 = term.getSubterm(0);
                                                                              term = o_36;
                                                                              if(true)
                                                                                break Success151;
                                                                            }
                                                                            term = term169;
                                                                          }
                                                                          if(cons4 == transform._consCastRef_2)
                                                                          { 
                                                                            IStrategoTerm k_36 = null;
                                                                            k_36 = term.getSubterm(0);
                                                                            term = k_36;
                                                                          }
                                                                          else
                                                                          { 
                                                                            break Fail135;
                                                                          }
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class fetch_0_0 extends Strategy 
  { 
    public static fetch_0_0 instance = new fetch_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fetch_0_0");
      Fail178:
      { 
        IStrategoTerm term194 = term;
        IStrategoConstructor cons5 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success152:
        { 
          if(cons5 == transform._consExprName_1)
          { 
            Fail179:
            { 
              IStrategoTerm j_42 = null;
              j_42 = term.getSubterm(0);
              term = this.invoke(context, j_42);
              if(term == null)
                break Fail179;
              if(true)
                break Success152;
            }
            term = term194;
          }
          Success153:
          { 
            if(cons5 == transform._consExprName_2)
            { 
              Fail180:
              { 
                IStrategoTerm h_42 = null;
                IStrategoTerm i_42 = null;
                h_42 = term.getSubterm(0);
                i_42 = term.getSubterm(1);
                term = termFactory.makeAppl(transform._consAmbName_2, new IStrategoTerm[]{h_42, i_42});
                term = this.invoke(context, term);
                if(term == null)
                  break Fail180;
                if(true)
                  break Success153;
              }
              term = term194;
            }
            Success154:
            { 
              if(cons5 == transform._consAmbName_2)
              { 
                Fail181:
                { 
                  IStrategoTerm d_42 = null;
                  IStrategoTerm e_42 = null;
                  d_42 = term.getSubterm(0);
                  IStrategoTerm arg131 = term.getSubterm(1);
                  if(arg131.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg131).getConstructor())
                    break Fail181;
                  e_42 = arg131.getSubterm(0);
                  term = this.invoke(context, d_42);
                  if(term == null)
                    break Fail181;
                  term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(transform.const0, termFactory.makeListCons(e_42, (IStrategoList)transform.constNil0)));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail181;
                  if(true)
                    break Success154;
                }
                term = term194;
              }
              Success155:
              { 
                if(cons5 == transform._consAmbName_1)
                { 
                  Fail182:
                  { 
                    IStrategoTerm c_42 = null;
                    c_42 = term.getSubterm(0);
                    term = this.invoke(context, c_42);
                    if(term == null)
                      break Fail182;
                    if(true)
                      break Success155;
                  }
                  term = term194;
                }
                if(cons5 == transform._consId_1)
                { 
                  IStrategoTerm b_42 = null;
                  b_42 = term.getSubterm(0);
                  term = b_42;
                }
                else
                { 
                  break Fail178;
                }
              }
            }
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class main_0_0 extends Strategy 
  { 
    public static main_0_0 instance = new main_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("main_0_0");
      Fail183:
      { 
        term = handle_io_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail183;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class handle_io_0_0 extends Strategy 
  { 
    public static handle_io_0_0 instance = new handle_io_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("handle_io_0_0");
      Fail184:
      { 
        IStrategoTerm l_42 = null;
        IStrategoTerm m_42 = null;
        IStrategoTerm o_42 = null;
        IStrategoTerm t_42 = null;
        IStrategoTerm u_42 = null;
        IStrategoTerm w_42 = null;
        IStrategoTerm b_43 = null;
        IStrategoTerm y_42 = null;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail184;
        l_42 = ((IStrategoList)term).tail();
        term = debug_0_0.instance.invoke(context, l_42);
        if(term == null)
          break Fail184;
        term = l_42;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail184;
        w_42 = ((IStrategoList)term).head();
        term = w_42;
        o_42 = w_42;
        term = $Read$From$File_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        m_42 = term;
        term = l_42;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail184;
        b_43 = ((IStrategoList)term).tail();
        term = b_43;
        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
          break Fail184;
        y_42 = ((IStrategoList)term).head();
        t_42 = y_42;
        term = transform_0_0.instance.invoke(context, m_42);
        if(term == null)
          break Fail184;
        u_42 = term;
        term = dirname_0_0.instance.invoke(context, o_42);
        if(term == null)
          break Fail184;
        term = base_filename_0_0.instance.invoke(context, o_42);
        if(term == null)
          break Fail184;
        term = remove_extension_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transform.constCons3);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        term = termFactory.makeTuple(term, transform.const27);
        term = add_extension_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        term = termFactory.makeTuple(t_42, transform.const28);
        term = fopen_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        term = termFactory.makeTuple(u_42, term);
        term = fputs_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        term = fclose_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail184;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class transform_0_0 extends Strategy 
  { 
    public static transform_0_0 instance = new transform_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("transform_0_0");
      Fail185:
      { 
        IStrategoTerm i_43 = null;
        i_43 = term;
        term = convert_0_0.instance.invoke(context, i_43);
        if(term == null)
          break Fail185;
        term = debug_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail185;
        term = pp_java5_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail185;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_is$Run$By$Others_method_0_0 extends Strategy 
  { 
    public static gen_is$Run$By$Others_method_0_0 instance = new gen_is$Run$By$Others_method_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail186:
      { 
        term = transform.constMethodDec0;
        if(true)
          return term;
      }
      context.push("gen_isRunByOthers_method_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_method_state_0_1 extends Strategy 
  { 
    public static gen_method_state_0_1 instance = new gen_method_state_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_43)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_state_0_1");
      Fail187:
      { 
        IStrategoTerm s_43 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail187;
        IStrategoTerm arg132 = term.getSubterm(0);
        if(arg132.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg132).getConstructor())
          break Fail187;
        s_43 = term;
        term = gen_method_state_name_0_1.instance.invoke(context, s_43, q_43);
        if(term == null)
          break Fail187;
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{transform.constCons2, transform.constClassOrInterfaceType1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constNewInstance0}), (IStrategoList)transform.constNil0)});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_method_state_name_0_1 extends Strategy 
  { 
    public static gen_method_state_name_0_1 instance = new gen_method_state_name_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_43)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_method_state_name_0_1");
      Fail188:
      { 
        IStrategoTerm y_43 = null;
        IStrategoTerm z_43 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail188;
        IStrategoTerm arg134 = term.getSubterm(0);
        if(arg134.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg134).getConstructor())
          break Fail188;
        y_43 = arg134.getSubterm(0);
        z_43 = term;
        term = hashtable_get_0_1.instance.invoke(context, x_43, z_43);
        if(term == null)
          break Fail188;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail188;
        term = (IStrategoTerm)termFactory.makeListCons(y_43, termFactory.makeListCons(term, (IStrategoList)transform.constCons10));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail188;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_requires_method_name_0_1 extends Strategy 
  { 
    public static gen_requires_method_name_0_1 instance = new gen_requires_method_name_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm e_44)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_requires_method_name_0_1");
      Fail189:
      { 
        IStrategoTerm f_44 = null;
        IStrategoTerm g_44 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail189;
        IStrategoTerm arg136 = term.getSubterm(0);
        if(arg136.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg136).getConstructor())
          break Fail189;
        f_44 = arg136.getSubterm(0);
        g_44 = term;
        term = hashtable_get_0_1.instance.invoke(context, e_44, g_44);
        if(term == null)
          break Fail189;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail189;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const38, termFactory.makeListCons(f_44, termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail189;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_on_entry_method_name_0_1 extends Strategy 
  { 
    public static gen_on_entry_method_name_0_1 instance = new gen_on_entry_method_name_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_44)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_on_entry_method_name_0_1");
      Fail190:
      { 
        IStrategoTerm m_44 = null;
        IStrategoTerm n_44 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail190;
        IStrategoTerm arg138 = term.getSubterm(0);
        if(arg138.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg138).getConstructor())
          break Fail190;
        m_44 = arg138.getSubterm(0);
        n_44 = term;
        term = hashtable_get_0_1.instance.invoke(context, l_44, n_44);
        if(term == null)
          break Fail190;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail190;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const39, termFactory.makeListCons(m_44, termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail190;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_on_exit_method_name_0_1 extends Strategy 
  { 
    public static gen_on_exit_method_name_0_1 instance = new gen_on_exit_method_name_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_44)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_on_exit_method_name_0_1");
      Fail191:
      { 
        IStrategoTerm t_44 = null;
        IStrategoTerm u_44 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail191;
        IStrategoTerm arg140 = term.getSubterm(0);
        if(arg140.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg140).getConstructor())
          break Fail191;
        t_44 = arg140.getSubterm(0);
        u_44 = term;
        term = hashtable_get_0_1.instance.invoke(context, s_44, u_44);
        if(term == null)
          break Fail191;
        term = int_to_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail191;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const40, termFactory.makeListCons(t_44, termFactory.makeListCons(term, (IStrategoList)transform.constNil0)));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail191;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_while_condition_0_1 extends Strategy 
  { 
    public static make_while_condition_0_1 instance = new make_while_condition_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_45)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_while_condition_0_1");
      Fail192:
      { 
        IStrategoTerm c_45 = null;
        IStrategoTerm d_45 = null;
        IStrategoTerm e_45 = null;
        IStrategoTerm f_45 = null;
        f_45 = term;
        term = length_0_0.instance.invoke(context, b_45);
        if(term == null)
          break Fail192;
        e_45 = term;
        term = f_45;
        IStrategoTerm term198 = term;
        Success156:
        { 
          Fail193:
          { 
            IStrategoTerm g_45 = null;
            IStrategoTerm k_45 = null;
            g_45 = term;
            k_45 = e_45;
            term = equal_0_1.instance.invoke(context, k_45, transform.const19);
            if(term == null)
              break Fail193;
            term = g_45;
            { 
              term = transform.constFalse0;
              if(true)
                break Success156;
            }
          }
          term = term198;
          Success157:
          { 
            Fail194:
            { 
              IStrategoTerm h_45 = null;
              IStrategoTerm m_45 = null;
              h_45 = term;
              m_45 = e_45;
              term = equal_0_1.instance.invoke(context, m_45, transform.const17);
              if(term == null)
                break Fail194;
              term = h_45;
              { 
                IStrategoTerm i_45 = null;
                term = b_45;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail192;
                i_45 = ((IStrategoList)term).head();
                IStrategoTerm arg142 = ((IStrategoList)term).tail();
                if(arg142.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg142).isEmpty())
                  break Fail192;
                term = i_45;
                if(true)
                  break Success157;
              }
            }
            term = b_45;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail192;
            d_45 = ((IStrategoList)term).head();
            c_45 = ((IStrategoList)term).tail();
            term = this.invoke(context, term, c_45);
            if(term == null)
              break Fail192;
            term = termFactory.makeAppl(transform._consLazyOr_2, new IStrategoTerm[]{term, d_45});
          }
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_class_head_0_1 extends Strategy 
  { 
    public static gen_class_head_0_1 instance = new gen_class_head_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_45)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("gen_class_head_0_1");
      Fail195:
      { 
        IStrategoTerm r_45 = null;
        IStrategoTerm s_45 = null;
        term = p_45;
        IStrategoTerm term200 = term;
        IStrategoConstructor cons6 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success158:
        { 
          if(cons6 == transform._consTypeName_2)
          { 
            Fail196:
            { 
              IStrategoTerm c_187 = null;
              IStrategoTerm arg144 = term.getSubterm(1);
              if(arg144.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg144).getConstructor())
                break Fail196;
              c_187 = arg144.getSubterm(0);
              term = c_187;
              if(true)
                break Success158;
            }
            term = term200;
          }
          if(cons6 == transform._consTypeName_1)
          { 
            IStrategoTerm d_187 = null;
            IStrategoTerm arg145 = term.getSubterm(0);
            if(arg145.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg145).getConstructor())
              break Fail195;
            d_187 = arg145.getSubterm(0);
            term = d_187;
          }
          else
          { 
            break Fail195;
          }
        }
        s_45 = term;
        term = fetch__full__class__name_0_0.instance.invoke(context, p_45);
        if(term == null)
          break Fail195;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName5, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId15, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})})}), (IStrategoList)transform.constNil0)}), (IStrategoList)transform.constCons12);
        r_45 = term;
        term = (IStrategoTerm)termFactory.makeListCons(s_45, (IStrategoList)transform.constCons3);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail195;
        term = termFactory.makeAppl(transform._consClassDecHead_5, new IStrategoTerm[]{r_45, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term}), transform.constNone0, transform.constNone0, transform.constNone0});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_requires_method_0_3 extends Strategy 
  { 
    public static make_requires_method_0_3 instance = new make_requires_method_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_45, IStrategoTerm w_45, IStrategoTerm x_45)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_requires_method_0_3");
      Fail197:
      { 
        IStrategoTerm y_45 = null;
        IStrategoTerm z_45 = null;
        IStrategoTerm a_46 = null;
        IStrategoTerm b_46 = null;
        IStrategoTerm c_46 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail197;
        IStrategoTerm arg146 = term.getSubterm(0);
        if(arg146.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg146).getConstructor())
          break Fail197;
        y_45 = arg146.getSubterm(0);
        z_45 = term.getSubterm(1);
        c_46 = term;
        term = map_1_0.instance.invoke(context, z_45, pp_type_0_0.instance);
        if(term == null)
          break Fail197;
        term = map_1_0.instance.invoke(context, term, lifted107.instance);
        if(term == null)
          break Fail197;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName6, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{y_45}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons2);
        a_46 = term;
        term = gen_requires_method_name_0_1.instance.invoke(context, c_46, x_45);
        if(term == null)
          break Fail197;
        b_46 = term;
        term = hashtable_put_0_2.instance.invoke(context, w_45, c_46, term);
        if(term == null)
          break Fail197;
        term = hashtable_get_0_1.instance.invoke(context, v_45, c_46);
        if(term == null)
          break Fail197;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{a_46, transform.constNone0, transform.constBoolean0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{b_46}), transform.constNil0, transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consReturn_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consSome_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_on_entry_method_0_4 extends Strategy 
  { 
    public static make_on_entry_method_0_4 instance = new make_on_entry_method_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_46, IStrategoTerm l_46, IStrategoTerm m_46, IStrategoTerm n_46)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_on_entry_method_0_4");
      Fail198:
      { 
        IStrategoTerm o_46 = null;
        IStrategoTerm p_46 = null;
        IStrategoTerm q_46 = null;
        IStrategoTerm r_46 = null;
        IStrategoTerm s_46 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail198;
        IStrategoTerm arg147 = term.getSubterm(0);
        if(arg147.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg147).getConstructor())
          break Fail198;
        o_46 = arg147.getSubterm(0);
        p_46 = term.getSubterm(1);
        s_46 = term;
        term = map_1_0.instance.invoke(context, p_46, pp_type_0_0.instance);
        if(term == null)
          break Fail198;
        term = map_1_0.instance.invoke(context, term, lifted109.instance);
        if(term == null)
          break Fail198;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName7, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{o_46}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons2);
        q_46 = term;
        term = gen_on_entry_method_name_0_1.instance.invoke(context, s_46, n_46);
        if(term == null)
          break Fail198;
        r_46 = term;
        term = hashtable_put_0_2.instance.invoke(context, m_46, s_46, term);
        if(term == null)
          break Fail198;
        term = hashtable_get_0_1.instance.invoke(context, k_46, s_46);
        if(term == null)
          break Fail198;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{q_46, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{r_46}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{l_46})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), term});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_on_exit_method_0_4 extends Strategy 
  { 
    public static make_on_exit_method_0_4 instance = new make_on_exit_method_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_47, IStrategoTerm b_47, IStrategoTerm c_47, IStrategoTerm d_47)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_on_exit_method_0_4");
      Fail199:
      { 
        IStrategoTerm e_47 = null;
        IStrategoTerm f_47 = null;
        IStrategoTerm g_47 = null;
        IStrategoTerm h_47 = null;
        IStrategoTerm i_47 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail199;
        IStrategoTerm arg148 = term.getSubterm(0);
        if(arg148.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg148).getConstructor())
          break Fail199;
        e_47 = arg148.getSubterm(0);
        f_47 = term.getSubterm(1);
        i_47 = term;
        term = map_1_0.instance.invoke(context, f_47, pp_type_0_0.instance);
        if(term == null)
          break Fail199;
        term = map_1_0.instance.invoke(context, term, lifted111.instance);
        if(term == null)
          break Fail199;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName8, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{e_47}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons2);
        g_47 = term;
        term = gen_on_exit_method_name_0_1.instance.invoke(context, i_47, d_47);
        if(term == null)
          break Fail199;
        h_47 = term;
        term = hashtable_put_0_2.instance.invoke(context, c_47, i_47, term);
        if(term == null)
          break Fail199;
        term = hashtable_get_0_1.instance.invoke(context, a_47, i_47);
        if(term == null)
          break Fail199;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{g_47, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{h_47}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{b_47})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), term});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class convert_0_0 extends Strategy 
  { 
    public static convert_0_0 instance = new convert_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("convert_0_0");
      Fail200:
      { 
        IStrategoTerm q_47 = null;
        IStrategoTerm r_47 = null;
        IStrategoTerm s_47 = null;
        IStrategoTerm t_47 = null;
        IStrategoTerm u_47 = null;
        IStrategoTerm v_47 = null;
        IStrategoTerm w_47 = null;
        IStrategoTerm x_47 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCompilationUnit_3 != ((IStrategoAppl)term).getConstructor())
          break Fail200;
        s_47 = term.getSubterm(0);
        t_47 = term.getSubterm(1);
        r_47 = term.getSubterm(2);
        x_47 = term;
        Success159:
        { 
          Fail201:
          { 
            IStrategoTerm y_47 = null;
            y_47 = term;
            term = get_coordinator_0_1.instance.invoke(context, x_47, r_47);
            if(term == null)
              break Fail201;
            q_47 = term;
            term = y_47;
            { 
              IStrategoTerm b_48 = null;
              term = fetch_coordinator_type_0_0.instance.invoke(context, q_47);
              if(term == null)
                break Fail200;
              u_47 = term;
              term = convert_coordinator_declaration_0_1.instance.invoke(context, q_47, term);
              if(term == null)
                break Fail200;
              v_47 = term;
              term = remove_all_1_0.instance.invoke(context, r_47, lifted112.instance);
              if(term == null)
                break Fail200;
              w_47 = term;
              term = generate_imports_0_2.instance.invoke(context, term, t_47, u_47);
              if(term == null)
                break Fail200;
              b_48 = term;
              term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(v_47, (IStrategoList)transform.constNil0), w_47);
              term = conc_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail200;
              term = termFactory.makeAppl(transform._consCompilationUnit_3, new IStrategoTerm[]{s_47, b_48, term});
              if(true)
                break Success159;
            }
          }
          term = x_47;
        }
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class generate_imports_0_2 extends Strategy 
  { 
    public static generate_imports_0_2 instance = new generate_imports_0_2();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_48, IStrategoTerm g_48)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("generate_imports_0_2");
      Fail202:
      { 
        term = termFactory.makeTuple(f_48, transform.constCons13, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consTypeImportDec_1, new IStrategoTerm[]{g_48}), (IStrategoList)transform.constNil0), transform.constCons16, transform.constCons19);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail202;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_coordinator_0_1 extends Strategy 
  { 
    public static get_coordinator_0_1 instance = new get_coordinator_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_48)
    { 
      context.push("get_coordinator_0_1");
      Fail203:
      { 
        term = getfirst_1_0.instance.invoke(context, h_48, lifted113.instance);
        if(term == null)
          break Fail203;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class fetch_coordinator_type_0_0 extends Strategy 
  { 
    public static fetch_coordinator_type_0_0 instance = new fetch_coordinator_type_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail204:
      { 
        IStrategoTerm j_48 = null;
        IStrategoTerm k_48 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail204;
        j_48 = term.getSubterm(0);
        term = j_48;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDecHead_1 != ((IStrategoAppl)term).getConstructor())
          break Fail204;
        k_48 = term.getSubterm(0);
        term = k_48;
        if(true)
          return term;
      }
      context.push("fetch_coordinator_type_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class convert_coordinator_declaration_0_1 extends Strategy 
  { 
    public static convert_coordinator_declaration_0_1 instance = new convert_coordinator_declaration_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_48)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("convert_coordinator_declaration_0_1");
      Fail205:
      { 
        IStrategoTerm p_48 = null;
        IStrategoTerm q_48 = null;
        IStrategoTerm t_48 = null;
        IStrategoTerm w_48 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail205;
        p_48 = term.getSubterm(1);
        t_48 = term;
        IStrategoTerm term202 = term;
        Success160:
        { 
          Fail206:
          { 
            term = n_48;
            IStrategoTerm term203 = term;
            IStrategoConstructor cons7 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
            Success161:
            { 
              if(cons7 == transform._consTypeName_2)
              { 
                Fail207:
                { 
                  IStrategoTerm e_187 = null;
                  IStrategoTerm arg154 = term.getSubterm(1);
                  if(arg154.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg154).getConstructor())
                    break Fail207;
                  e_187 = arg154.getSubterm(0);
                  term = e_187;
                  if(true)
                    break Success161;
                }
                term = term203;
              }
              if(cons7 == transform._consTypeName_1)
              { 
                IStrategoTerm f_187 = null;
                IStrategoTerm arg155 = term.getSubterm(0);
                if(arg155.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg155).getConstructor())
                  break Fail206;
                f_187 = arg155.getSubterm(0);
                term = f_187;
              }
              else
              { 
                break Fail206;
              }
            }
            q_48 = term;
            if(true)
              break Success160;
          }
          term = term202;
          IStrategoTerm r_48 = null;
          IStrategoTerm s_48 = null;
          IStrategoTerm v_48 = null;
          r_48 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail205;
          s_48 = term;
          v_48 = r_48;
          term = report_with_failure_0_2.instance.invoke(context, v_48, transform.const56, s_48);
          if(term == null)
            break Fail205;
        }
        term = t_48;
        term = gen_class_head_0_1.instance.invoke(context, term, n_48);
        if(term == null)
          break Fail205;
        w_48 = term;
        term = gen_coordinator_body_0_1.instance.invoke(context, p_48, q_48);
        if(term == null)
          break Fail205;
        term = termFactory.makeAppl(transform._consClassDec_2, new IStrategoTerm[]{w_48, term});
        term = add__externals_0_1.instance.invoke(context, term, q_48);
        if(term == null)
          break Fail205;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class gen_coordinator_body_0_1 extends Strategy 
  { 
    public static gen_coordinator_body_0_1 instance = new gen_coordinator_body_0_1();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_49)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference c_49 = new TermReference(ref_c_49);
      context.push("gen_coordinator_body_0_1");
      Fail208:
      { 
        TermReference d_49 = new TermReference();
        TermReference e_49 = new TermReference();
        TermReference f_49 = new TermReference();
        IStrategoTerm g_49 = null;
        TermReference h_49 = new TermReference();
        TermReference i_49 = new TermReference();
        IStrategoTerm j_49 = null;
        IStrategoTerm k_49 = null;
        TermReference l_49 = new TermReference();
        TermReference m_49 = new TermReference();
        TermReference n_49 = new TermReference();
        TermReference o_49 = new TermReference();
        IStrategoTerm s_49 = null;
        IStrategoTerm n_50 = null;
        IStrategoTerm v_50 = null;
        IStrategoTerm o_50 = null;
        IStrategoTerm w_50 = null;
        IStrategoTerm p_50 = null;
        IStrategoTerm x_50 = null;
        IStrategoTerm q_50 = null;
        IStrategoTerm y_50 = null;
        IStrategoTerm r_50 = null;
        IStrategoTerm z_50 = null;
        IStrategoTerm s_50 = null;
        IStrategoTerm a_51 = null;
        IStrategoTerm t_50 = null;
        IStrategoTerm b_51 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorBody_1 != ((IStrategoAppl)term).getConstructor())
          break Fail208;
        k_49 = term.getSubterm(0);
        s_49 = term;
        IStrategoTerm term204 = term;
        Success162:
        { 
          Fail209:
          { 
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail209;
            if(l_49.value == null)
              l_49.value = term;
            else
              if(l_49.value != term && !l_49.value.match(term))
                break Fail209;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail209;
            if(m_49.value == null)
              m_49.value = term;
            else
              if(m_49.value != term && !m_49.value.match(term))
                break Fail209;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail209;
            if(n_49.value == null)
              n_49.value = term;
            else
              if(n_49.value != term && !n_49.value.match(term))
                break Fail209;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail209;
            if(d_49.value == null)
              d_49.value = term;
            else
              if(d_49.value != term && !d_49.value.match(term))
                break Fail209;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail209;
            if(e_49.value == null)
              e_49.value = term;
            else
              if(e_49.value != term && !e_49.value.match(term))
                break Fail209;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail209;
            if(f_49.value == null)
              f_49.value = term;
            else
              if(f_49.value != term && !f_49.value.match(term))
                break Fail209;
            term = new_hashtable_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail209;
            if(o_49.value == null)
              o_49.value = term;
            else
              if(o_49.value != term && !o_49.value.match(term))
                break Fail209;
            term = getfirst_1_0.instance.invoke(context, k_49, lifted114.instance);
            if(term == null)
              break Fail209;
            g_49 = term;
            term = getfirst_1_0.instance.invoke(context, k_49, lifted115.instance);
            if(term == null)
              break Fail209;
            term = get_methods_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail209;
            if(h_49.value == null)
              h_49.value = term;
            else
              if(h_49.value != term && !h_49.value.match(term))
                break Fail209;
            term = getfirst_1_0.instance.invoke(context, k_49, lifted116.instance);
            if(term == null)
              break Fail209;
            term = get_methods_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail209;
            if(i_49.value == null)
              i_49.value = term;
            else
              if(i_49.value != term && !i_49.value.match(term))
                break Fail209;
            if(h_49.value == null || i_49.value == null)
              break Fail209;
            term = termFactory.makeTuple(h_49.value, i_49.value);
            term = union_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail209;
            j_49 = term;
            lifted117 lifted1170 = new lifted117();
            lifted1170.o_49 = o_49;
            term = map_1_0.instance.invoke(context, term, lifted1170);
            if(term == null)
              break Fail209;
            term = retain_all_1_0.instance.invoke(context, k_49, lifted118.instance);
            if(term == null)
              break Fail209;
            lifted119 lifted1190 = new lifted119();
            lifted1190.l_49 = l_49;
            lifted1190.m_49 = m_49;
            lifted1190.n_49 = n_49;
            lifted1190.o_49 = o_49;
            term = map_1_0.instance.invoke(context, term, lifted1190);
            if(term == null)
              break Fail209;
            if(true)
              break Success162;
          }
          term = term204;
          IStrategoTerm q_49 = null;
          IStrategoTerm r_49 = null;
          IStrategoTerm k_50 = null;
          q_49 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail208;
          r_49 = term;
          k_50 = q_49;
          term = report_with_failure_0_2.instance.invoke(context, k_50, transform.const57, r_49);
          if(term == null)
            break Fail208;
        }
        term = s_49;
        v_50 = term;
        if(g_49 == null)
          break Fail208;
        term = add_condition_fields_0_0.instance.invoke(context, g_49);
        if(term == null)
          break Fail208;
        n_50 = term;
        w_50 = v_50;
        term = add_coordinator_fields_0_0.instance.invoke(context, k_49);
        if(term == null)
          break Fail208;
        o_50 = term;
        term = w_50;
        x_50 = w_50;
        if(j_49 == null)
          break Fail208;
        term = j_49;
        lifted120 lifted1200 = new lifted120();
        lifted1200.o_49 = o_49;
        term = map_1_0.instance.invoke(context, term, lifted1200);
        if(term == null)
          break Fail208;
        p_50 = term;
        term = x_50;
        y_50 = x_50;
        term = gen_is$Run$By$Others_method_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail208;
        q_50 = term;
        term = y_50;
        z_50 = y_50;
        if(l_49.value == null)
          break Fail208;
        term = hashtable_keys_0_0.instance.invoke(context, l_49.value);
        if(term == null)
          break Fail208;
        lifted121 lifted1211 = new lifted121();
        lifted1211.l_49 = l_49;
        lifted1211.d_49 = d_49;
        lifted1211.o_49 = o_49;
        term = map_1_0.instance.invoke(context, term, lifted1211);
        if(term == null)
          break Fail208;
        r_50 = term;
        term = z_50;
        a_51 = z_50;
        if(n_49.value == null)
          break Fail208;
        term = hashtable_keys_0_0.instance.invoke(context, n_49.value);
        if(term == null)
          break Fail208;
        lifted122 lifted1220 = new lifted122();
        lifted1220.n_49 = n_49;
        lifted1220.c_49 = c_49;
        lifted1220.f_49 = f_49;
        lifted1220.o_49 = o_49;
        term = map_1_0.instance.invoke(context, term, lifted1220);
        if(term == null)
          break Fail208;
        s_50 = term;
        term = a_51;
        b_51 = a_51;
        if(m_49.value == null)
          break Fail208;
        term = hashtable_keys_0_0.instance.invoke(context, m_49.value);
        if(term == null)
          break Fail208;
        lifted123 lifted1230 = new lifted123();
        lifted1230.m_49 = m_49;
        lifted1230.c_49 = c_49;
        lifted1230.e_49 = e_49;
        lifted1230.o_49 = o_49;
        term = map_1_0.instance.invoke(context, term, lifted1230);
        if(term == null)
          break Fail208;
        t_50 = term;
        term = b_51;
        if(j_49 == null)
          break Fail208;
        term = j_49;
        lifted124 lifted1240 = new lifted124();
        lifted1240.c_49 = c_49;
        lifted1240.e_49 = e_49;
        lifted1240.d_49 = d_49;
        lifted1240.f_49 = f_49;
        lifted1240.h_49 = h_49;
        lifted1240.i_49 = i_49;
        lifted1240.o_49 = o_49;
        term = map_1_0.instance.invoke(context, term, lifted1240);
        if(term == null)
          break Fail208;
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail208;
        term = termFactory.makeTuple(n_50, o_50, p_50, (IStrategoTerm)termFactory.makeListCons(q_50, (IStrategoList)transform.constNil0), r_50, s_50, t_50, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail208;
        term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_lock_and_unlock_methods_0_7 extends Strategy 
  { 
    public static make_lock_and_unlock_methods_0_7 instance = new make_lock_and_unlock_methods_0_7();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_51, IStrategoTerm e_51, IStrategoTerm f_51, IStrategoTerm h_51, IStrategoTerm i_51, IStrategoTerm l_51, IStrategoTerm n_51)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_lock_and_unlock_methods_0_7");
      Fail210:
      { 
        IStrategoTerm o_51 = null;
        IStrategoTerm p_51 = null;
        o_51 = term;
        term = make_lock_method_0_6.instance.invokeDynamic(context, o_51, NO_STRATEGIES, new IStrategoTerm[]{d_51, f_51, h_51, i_51, l_51, n_51});
        if(term == null)
          break Fail210;
        p_51 = term;
        term = make_unlock_method_0_3.instance.invoke(context, o_51, d_51, e_51, n_51);
        if(term == null)
          break Fail210;
        term = (IStrategoTerm)termFactory.makeListCons(p_51, termFactory.makeListCons(term, (IStrategoList)transform.constNil0));
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }

    @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
    { 
      if(sargs == null || targs == null || sargs.length != 0 || targs.length != 7)
        throw new IllegalArgumentException("Illegal arguments for " + getName());
      return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5], targs[6]);
    }
  }

  @SuppressWarnings("all") public static class make_unlock_method_0_3 extends Strategy 
  { 
    public static make_unlock_method_0_3 instance = new make_unlock_method_0_3();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_51, IStrategoTerm x_51, IStrategoTerm y_51)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("make_unlock_method_0_3");
      Fail211:
      { 
        IStrategoTerm z_51 = null;
        IStrategoTerm a_52 = null;
        IStrategoTerm b_52 = null;
        IStrategoTerm c_52 = null;
        IStrategoTerm d_52 = null;
        IStrategoTerm e_52 = null;
        IStrategoTerm n_52 = null;
        IStrategoTerm y_52 = null;
        IStrategoTerm z_52 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail211;
        IStrategoTerm arg163 = term.getSubterm(0);
        if(arg163.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg163).getConstructor())
          break Fail211;
        z_51 = arg163.getSubterm(0);
        a_52 = term.getSubterm(1);
        n_52 = term;
        IStrategoTerm term205 = term;
        Success163:
        { 
          Fail212:
          { 
            c_52 = term;
            term = map_1_0.instance.invoke(context, a_52, pp_type_0_0.instance);
            if(term == null)
              break Fail212;
            term = map_1_0.instance.invoke(context, term, lifted126.instance);
            if(term == null)
              break Fail212;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName10, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{z_51}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons20);
            b_52 = term;
            Success164:
            { 
              Fail213:
              { 
                IStrategoTerm g_52 = null;
                g_52 = term;
                term = hashtable_keys_0_0.instance.invoke(context, x_51);
                if(term == null)
                  break Fail213;
                term = termFactory.makeTuple(c_52, term);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail213;
                term = g_52;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, x_51, c_52);
                  if(term == null)
                    break Fail212;
                  term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constCons1})});
                  d_52 = term;
                  if(true)
                    break Success164;
                }
              }
              term = transform.constNone0;
              d_52 = transform.constNone0;
            }
            term = gen_method_state_name_0_1.instance.invoke(context, c_52, y_51);
            if(term == null)
              break Fail212;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), transform.constId30})}), transform.constCons8})}), (IStrategoList)transform.constNil0), (IStrategoTerm)termFactory.makeListCons(d_52, (IStrategoList)transform.constNil0), transform.constCons21);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail212;
            e_52 = term;
            if(true)
              break Success163;
          }
          term = term205;
          IStrategoTerm l_52 = null;
          IStrategoTerm m_52 = null;
          IStrategoTerm x_52 = null;
          l_52 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail211;
          m_52 = term;
          x_52 = l_52;
          term = report_with_failure_0_2.instance.invoke(context, x_52, transform.const61, m_52);
          if(term == null)
            break Fail211;
        }
        z_52 = n_52;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const62, termFactory.makeListCons(z_51, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail211;
        y_52 = term;
        term = z_52;
        if(b_52 == null || e_52 == null)
          break Fail211;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{b_52, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{y_52}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{w_51})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{e_52})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class make_lock_method_0_6 extends Strategy 
  { 
    public static make_lock_method_0_6 instance = new make_lock_method_0_6();

    public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_53, IStrategoTerm d_53, IStrategoTerm e_53, IStrategoTerm f_53, IStrategoTerm g_53, IStrategoTerm ref_h_53)
    { 
      ITermFactory termFactory = context.getFactory();
      TermReference h_53 = new TermReference(ref_h_53);
      context.push("make_lock_method_0_6");
      Fail214:
      { 
        IStrategoTerm i_53 = null;
        IStrategoTerm j_53 = null;
        IStrategoTerm k_53 = null;
        IStrategoTerm l_53 = null;
        IStrategoTerm m_53 = null;
        IStrategoTerm n_53 = null;
        IStrategoTerm o_53 = null;
        IStrategoTerm p_53 = null;
        IStrategoTerm q_53 = null;
        IStrategoTerm r_53 = null;
        TermReference s_53 = new TermReference();
        IStrategoTerm t_53 = null;
        IStrategoTerm f_54 = null;
        IStrategoTerm i_55 = null;
        IStrategoTerm j_55 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodSignature_2 != ((IStrategoAppl)term).getConstructor())
          break Fail214;
        IStrategoTerm arg164 = term.getSubterm(0);
        if(arg164.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg164).getConstructor())
          break Fail214;
        i_53 = arg164.getSubterm(0);
        j_53 = term.getSubterm(1);
        f_54 = term;
        IStrategoTerm term207 = term;
        Success165:
        { 
          Fail215:
          { 
            IStrategoTerm v_54 = null;
            IStrategoTerm y_54 = null;
            IStrategoTerm a_55 = null;
            IStrategoTerm d_55 = null;
            IStrategoTerm g_187 = null;
            if(s_53.value == null)
              s_53.value = term;
            else
              if(s_53.value != term && !s_53.value.match(term))
                break Fail215;
            term = map_1_0.instance.invoke(context, j_53, pp_type_0_0.instance);
            if(term == null)
              break Fail215;
            term = map_1_0.instance.invoke(context, term, lifted128.instance);
            if(term == null)
              break Fail215;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consAnno_2, new IStrategoTerm[]{transform.constTypeName11, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId18, termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{i_53}), (IStrategoList)transform.constNil0)})})}), termFactory.makeListCons(transform.constElemValPair0, termFactory.makeListCons(termFactory.makeAppl(transform._consElemValPair_2, new IStrategoTerm[]{transform.constId17, termFactory.makeAppl(transform._consElemValArrayInit_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)))}), (IStrategoList)transform.constCons20);
            k_53 = term;
            Success166:
            { 
              Fail216:
              { 
                IStrategoTerm v_53 = null;
                v_53 = term;
                if(s_53.value == null)
                  break Fail216;
                term = termFactory.makeTuple(s_53.value, g_53);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail216;
                term = v_53;
                { 
                  term = g_53;
                  lifted129 lifted1290 = new lifted129();
                  lifted1290.s_53 = s_53;
                  term = remove_all_1_0.instance.invoke(context, term, lifted1290);
                  if(term == null)
                    break Fail215;
                  l_53 = term;
                  if(true)
                    break Success166;
                }
              }
              term = transform.constNil0;
              l_53 = transform.constNil0;
            }
            Success167:
            { 
              Fail217:
              { 
                IStrategoTerm w_53 = null;
                w_53 = term;
                if(s_53.value == null)
                  break Fail217;
                term = termFactory.makeTuple(s_53.value, f_53);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail217;
                term = w_53;
                { 
                  if(s_53.value == null)
                    break Fail215;
                  term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(s_53.value, (IStrategoList)transform.constNil0), l_53);
                  term = conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail215;
                  m_53 = term;
                  if(true)
                    break Success167;
                }
              }
              term = l_53;
              m_53 = l_53;
            }
            term = m_53;
            lifted130 lifted1300 = new lifted130();
            lifted1300.h_53 = h_53;
            term = map_1_0.instance.invoke(context, term, lifted1300);
            if(term == null)
              break Fail215;
            o_53 = term;
            Success168:
            { 
              Fail218:
              { 
                IStrategoTerm y_53 = null;
                IStrategoTerm o_54 = null;
                IStrategoTerm p_54 = null;
                y_53 = term;
                p_54 = term;
                term = hashtable_keys_0_0.instance.invoke(context, d_53);
                if(term == null)
                  break Fail218;
                o_54 = term;
                term = p_54;
                if(s_53.value == null)
                  break Fail218;
                term = termFactory.makeTuple(s_53.value, o_54);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail218;
                term = y_53;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, d_53, s_53.value);
                  if(term == null)
                    break Fail215;
                  term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constNil0});
                  term = termFactory.makeAppl(transform._consNot_1, new IStrategoTerm[]{term});
                  n_53 = term;
                  IStrategoList list0;
                  list0 = checkListTail(o_53);
                  if(list0 == null)
                    break Fail215;
                  term = (IStrategoTerm)termFactory.makeListCons(n_53, list0);
                  p_53 = term;
                  if(true)
                    break Success168;
                }
              }
              term = o_53;
              p_53 = o_53;
            }
            v_54 = term;
            term = reverse_0_0.instance.invoke(context, p_53);
            if(term == null)
              break Fail215;
            term = make_while_condition_0_1.instance.invoke(context, v_54, term);
            if(term == null)
              break Fail215;
            q_53 = term;
            Success169:
            { 
              Fail219:
              { 
                IStrategoTerm b_54 = null;
                IStrategoTerm w_54 = null;
                IStrategoTerm x_54 = null;
                b_54 = term;
                x_54 = term;
                term = hashtable_keys_0_0.instance.invoke(context, e_53);
                if(term == null)
                  break Fail219;
                w_54 = term;
                term = x_54;
                if(s_53.value == null)
                  break Fail219;
                term = termFactory.makeTuple(s_53.value, w_54);
                term = elem_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail219;
                term = b_54;
                { 
                  term = hashtable_get_0_1.instance.invoke(context, e_53, s_53.value);
                  if(term == null)
                    break Fail215;
                  term = termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})})}), transform.constCons1})});
                  r_53 = term;
                  if(true)
                    break Success169;
                }
              }
              term = transform.constNone0;
              r_53 = transform.constNone0;
            }
            a_55 = term;
            d_55 = transform.constCons24;
            g_187 = q_53;
            term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{g_187, termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{d_55})});
            y_54 = term;
            term = a_55;
            if(s_53.value == null)
              break Fail215;
            term = gen_method_state_name_0_1.instance.invoke(context, s_53.value, h_53.value);
            if(term == null)
              break Fail215;
            term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(y_54, (IStrategoList)transform.constNil0), (IStrategoTerm)termFactory.makeListCons(r_53, (IStrategoList)transform.constNil0), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprStm_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethod_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodName_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consAmbName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), transform.constId36})}), transform.constCons8})}), (IStrategoList)transform.constNil0));
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail215;
            t_53 = term;
            if(true)
              break Success165;
          }
          term = term207;
          IStrategoTerm d_54 = null;
          IStrategoTerm e_54 = null;
          IStrategoTerm h_55 = null;
          d_54 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail214;
          e_54 = term;
          h_55 = d_54;
          term = report_with_failure_0_2.instance.invoke(context, h_55, transform.const68, e_54);
          if(term == null)
            break Fail214;
        }
        j_55 = f_54;
        term = (IStrategoTerm)termFactory.makeListCons(transform.const69, termFactory.makeListCons(i_53, (IStrategoList)transform.constNil0));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail214;
        i_55 = term;
        term = j_55;
        if(k_53 == null || t_53 == null)
          break Fail214;
        term = termFactory.makeAppl(transform._consMethodDec_2, new IStrategoTerm[]{termFactory.makeAppl(transform._consMethodDecHead_6, new IStrategoTerm[]{k_53, transform.constNone0, transform.constVoid0, termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{i_55}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consParam_3, new IStrategoTerm[]{transform.constNil0, termFactory.makeAppl(transform._consTypeName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{c_53})}), transform.constId0}), (IStrategoList)transform.constNil0), transform.constNone0}), termFactory.makeAppl(transform._consBlock_1, new IStrategoTerm[]{t_53})});
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }

    @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
    { 
      if(sargs == null || targs == null || sargs.length != 0 || targs.length != 6)
        throw new IllegalArgumentException("Illegal arguments for " + getName());
      return invoke(context, term, targs[0], targs[1], targs[2], targs[3], targs[4], targs[5]);
    }
  }

  @SuppressWarnings("all") public static class fill$Method$Maps_0_4 extends Strategy 
  { 
    public static fill$Method$Maps_0_4 instance = new fill$Method$Maps_0_4();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_55, IStrategoTerm p_55, IStrategoTerm q_55, IStrategoTerm r_55)
    { 
      ITermFactory termFactory = context.getFactory();
      context.push("fillMethodMaps_0_4");
      Fail220:
      { 
        IStrategoTerm s_55 = null;
        IStrategoTerm t_55 = null;
        IStrategoTerm u_55 = null;
        IStrategoTerm x_55 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
          break Fail220;
        u_55 = term.getSubterm(0);
        s_55 = term.getSubterm(1);
        t_55 = term.getSubterm(2);
        x_55 = term.getSubterm(3);
        IStrategoTerm term212 = term;
        Success170:
        { 
          Fail221:
          { 
            IStrategoTerm term213 = term;
            Success171:
            { 
              Fail222:
              { 
                IStrategoTerm y_55 = null;
                y_55 = term;
                IStrategoTerm term214 = term;
                Success172:
                { 
                  Fail223:
                  { 
                    term = termFactory.makeTuple(s_55, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail223;
                    { 
                      if(true)
                        break Fail222;
                      if(true)
                        break Success172;
                    }
                  }
                  term = term214;
                }
                term = y_55;
                { 
                  IStrategoTerm l_56 = null;
                  IStrategoTerm z_55 = null;
                  l_56 = o_55;
                  term = s_55;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail221;
                  IStrategoTerm arg165 = term.getSubterm(0);
                  if(arg165.getTermType() != IStrategoTerm.APPL || transform._consRequires_1 != ((IStrategoAppl)arg165).getConstructor())
                    break Fail221;
                  z_55 = arg165.getSubterm(0);
                  term = hashtable_put_0_2.instance.invoke(context, l_56, u_55, z_55);
                  if(term == null)
                    break Fail221;
                  if(true)
                    break Success171;
                }
              }
              term = term213;
            }
            IStrategoTerm term215 = term;
            Success173:
            { 
              Fail224:
              { 
                IStrategoTerm b_56 = null;
                b_56 = term;
                IStrategoTerm term216 = term;
                Success174:
                { 
                  Fail225:
                  { 
                    term = termFactory.makeTuple(t_55, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail225;
                    { 
                      if(true)
                        break Fail224;
                      if(true)
                        break Success174;
                    }
                  }
                  term = term216;
                }
                term = b_56;
                { 
                  IStrategoTerm n_56 = null;
                  IStrategoTerm c_56 = null;
                  n_56 = q_55;
                  term = t_55;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail221;
                  IStrategoTerm arg166 = term.getSubterm(0);
                  if(arg166.getTermType() != IStrategoTerm.APPL || transform._consOnEntry_1 != ((IStrategoAppl)arg166).getConstructor())
                    break Fail221;
                  c_56 = arg166.getSubterm(0);
                  term = hashtable_put_0_2.instance.invoke(context, n_56, u_55, c_56);
                  if(term == null)
                    break Fail221;
                  if(true)
                    break Success173;
                }
              }
              term = term215;
            }
            IStrategoTerm term217 = term;
            Success175:
            { 
              Fail226:
              { 
                IStrategoTerm d_56 = null;
                d_56 = term;
                IStrategoTerm term218 = term;
                Success176:
                { 
                  Fail227:
                  { 
                    term = termFactory.makeTuple(x_55, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail227;
                    { 
                      if(true)
                        break Fail226;
                      if(true)
                        break Success176;
                    }
                  }
                  term = term218;
                }
                term = d_56;
                { 
                  IStrategoTerm p_56 = null;
                  IStrategoTerm e_56 = null;
                  p_56 = p_55;
                  term = x_55;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consSome_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail221;
                  IStrategoTerm arg167 = term.getSubterm(0);
                  if(arg167.getTermType() != IStrategoTerm.APPL || transform._consOnExit_1 != ((IStrategoAppl)arg167).getConstructor())
                    break Fail221;
                  e_56 = arg167.getSubterm(0);
                  term = hashtable_put_0_2.instance.invoke(context, p_56, u_55, e_56);
                  if(term == null)
                    break Fail221;
                  if(true)
                    break Success175;
                }
              }
              term = term217;
            }
            if(true)
              break Success170;
          }
          term = term212;
          IStrategoTerm f_56 = null;
          IStrategoTerm i_56 = null;
          IStrategoTerm s_56 = null;
          f_56 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail220;
          i_56 = term;
          s_56 = f_56;
          term = report_with_failure_0_2.instance.invoke(context, s_56, transform.const70, i_56);
          if(term == null)
            break Fail220;
        }
        term = transform.constNone0;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add_condition_fields_0_0 extends Strategy 
  { 
    public static add_condition_fields_0_0 instance = new add_condition_fields_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("add_condition_fields_0_0");
      Fail228:
      { 
        IStrategoTerm v_56 = null;
        IStrategoTerm x_56 = null;
        IStrategoTerm c_57 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail228;
        v_56 = term.getSubterm(0);
        c_57 = term;
        IStrategoTerm term219 = term;
        Success177:
        { 
          Fail229:
          { 
            term = map_1_0.instance.invoke(context, v_56, lifted131.instance);
            if(term == null)
              break Fail229;
            x_56 = term;
            if(true)
              break Success177;
          }
          term = term219;
          IStrategoTerm a_57 = null;
          IStrategoTerm b_57 = null;
          IStrategoTerm g_57 = null;
          a_57 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail228;
          b_57 = term;
          g_57 = a_57;
          term = report_with_failure_0_2.instance.invoke(context, g_57, transform.const72, b_57);
          if(term == null)
            break Fail228;
        }
        term = c_57;
        if(x_56 == null)
          break Fail228;
        term = x_56;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class add_coordinator_fields_0_0 extends Strategy 
  { 
    public static add_coordinator_fields_0_0 instance = new add_coordinator_fields_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      context.push("add_coordinator_fields_0_0");
      Fail230:
      { 
        IStrategoTerm l_57 = null;
        IStrategoTerm m_57 = null;
        IStrategoTerm s_57 = null;
        l_57 = term;
        s_57 = term;
        IStrategoTerm term220 = term;
        Success178:
        { 
          Fail231:
          { 
            term = retain_all_1_0.instance.invoke(context, l_57, lifted132.instance);
            if(term == null)
              break Fail231;
            m_57 = term;
            if(true)
              break Success178;
          }
          term = term220;
          IStrategoTerm n_57 = null;
          IStrategoTerm o_57 = null;
          IStrategoTerm u_57 = null;
          n_57 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail230;
          o_57 = term;
          u_57 = n_57;
          term = report_with_failure_0_2.instance.invoke(context, u_57, transform.const74, o_57);
          if(term == null)
            break Fail230;
        }
        term = s_57;
        if(m_57 == null)
          break Fail230;
        term = map_1_0.instance.invoke(context, m_57, lifted133.instance);
        if(term == null)
          break Fail230;
        context.popOnSuccess();
        if(true)
          return term;
      }
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") public static class get_methods_list_0_0 extends Strategy 
  { 
    public static get_methods_list_0_0 instance = new get_methods_list_0_0();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail232:
      { 
        IStrategoTerm term221 = term;
        IStrategoConstructor cons8 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success179:
        { 
          if(cons8 == transform._consSelfex_1)
          { 
            Fail233:
            { 
              IStrategoTerm w_57 = null;
              w_57 = term.getSubterm(0);
              term = w_57;
              if(true)
                break Success179;
            }
            term = term221;
          }
          Success180:
          { 
            if(cons8 == transform._consMutex_1)
            { 
              Fail234:
              { 
                IStrategoTerm v_57 = null;
                v_57 = term.getSubterm(0);
                term = v_57;
                if(true)
                  break Success180;
              }
              term = term221;
            }
            if(cons8 == transform._consNone_0)
            { 
              term = transform.constNil0;
            }
            else
            { 
              break Fail232;
            }
          }
        }
        if(true)
          return term;
      }
      context.push("get_methods_list_0_0");
      context.popOnFailure();
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted132 extends Strategy 
  { 
    public static final lifted132 instance = new lifted132();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail235:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail235;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted133 extends Strategy 
  { 
    public static final lifted133 instance = new lifted133();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail236:
      { 
        IStrategoTerm p_57 = null;
        IStrategoTerm q_57 = null;
        IStrategoTerm r_57 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail236;
        p_57 = term.getSubterm(0);
        q_57 = term.getSubterm(1);
        r_57 = term.getSubterm(2);
        IStrategoList list1;
        list1 = checkListTail(p_57);
        if(list1 == null)
          break Fail236;
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(transform.constPrivate0, termFactory.makeListCons(transform.constMarkerAnno2, list1)), q_57, r_57});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted131 extends Strategy 
  { 
    public static final lifted131 instance = new lifted131();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail237:
      { 
        IStrategoTerm y_56 = null;
        IStrategoTerm z_56 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
          break Fail237;
        IStrategoTerm arg168 = term.getSubterm(0);
        if(arg168.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)arg168).getConstructor())
          break Fail237;
        y_56 = arg168.getSubterm(0);
        z_56 = term.getSubterm(1);
        term = termFactory.makeAppl(transform._consFieldDec_3, new IStrategoTerm[]{transform.constCons26, transform.constBoolean0, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consVarDec_2, new IStrategoTerm[]{y_56, z_56}), (IStrategoList)transform.constNil0)});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted130 extends Strategy 
  { 
    TermReference h_53;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail238:
      { 
        IStrategoTerm x_53 = null;
        x_53 = term;
        term = gen_method_state_name_0_1.instance.invoke(context, x_53, h_53.value);
        if(term == null)
          break Fail238;
        term = termFactory.makeAppl(transform._consInvoke_2, new IStrategoTerm[]{transform.constMethod4, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consExprName_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consId_1, new IStrategoTerm[]{term})}), (IStrategoList)transform.constNil0)});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted129 extends Strategy 
  { 
    TermReference s_53;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail239:
      { 
        term = equal_0_1.instance.invoke(context, term, s_53.value);
        if(term == null)
          break Fail239;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted128 extends Strategy 
  { 
    public static final lifted128 instance = new lifted128();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail240:
      { 
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted126 extends Strategy 
  { 
    public static final lifted126 instance = new lifted126();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail241:
      { 
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted124 extends Strategy 
  { 
    TermReference c_49;

    TermReference e_49;

    TermReference d_49;

    TermReference f_49;

    TermReference h_49;

    TermReference i_49;

    TermReference o_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail242:
      { 
        term = make_lock_and_unlock_methods_0_7.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{c_49.value, e_49.value, d_49.value, f_49.value, h_49.value, i_49.value, o_49.value});
        if(term == null)
          break Fail242;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted123 extends Strategy 
  { 
    TermReference m_49;

    TermReference c_49;

    TermReference e_49;

    TermReference o_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail243:
      { 
        term = make_on_exit_method_0_4.instance.invoke(context, term, m_49.value, c_49.value, e_49.value, o_49.value);
        if(term == null)
          break Fail243;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted122 extends Strategy 
  { 
    TermReference n_49;

    TermReference c_49;

    TermReference f_49;

    TermReference o_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail244:
      { 
        term = make_on_entry_method_0_4.instance.invoke(context, term, n_49.value, c_49.value, f_49.value, o_49.value);
        if(term == null)
          break Fail244;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted121 extends Strategy 
  { 
    TermReference l_49;

    TermReference d_49;

    TermReference o_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail245:
      { 
        term = make_requires_method_0_3.instance.invoke(context, term, l_49.value, d_49.value, o_49.value);
        if(term == null)
          break Fail245;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted120 extends Strategy 
  { 
    TermReference o_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail246:
      { 
        term = gen_method_state_0_1.instance.invoke(context, term, o_49.value);
        if(term == null)
          break Fail246;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted118 extends Strategy 
  { 
    public static final lifted118 instance = new lifted118();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail247:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodAdditions_4 != ((IStrategoAppl)term).getConstructor())
          break Fail247;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted117 extends Strategy 
  { 
    TermReference o_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail248:
      { 
        IStrategoTerm p_49 = null;
        IStrategoTerm i_50 = null;
        p_49 = term;
        if(o_49.value == null)
          break Fail248;
        term = o_49.value;
        i_50 = o_49.value;
        if(o_49.value == null)
          break Fail248;
        term = hashtable_keys_0_0.instance.invoke(context, o_49.value);
        if(term == null)
          break Fail248;
        term = length_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail248;
        term = hashtable_put_0_2.instance.invoke(context, i_50, p_49, term);
        if(term == null)
          break Fail248;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted116 extends Strategy 
  { 
    public static final lifted116 instance = new lifted116();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail249:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMutex_1 != ((IStrategoAppl)term).getConstructor())
          break Fail249;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted115 extends Strategy 
  { 
    public static final lifted115 instance = new lifted115();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail250:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consSelfex_1 != ((IStrategoAppl)term).getConstructor())
          break Fail250;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted114 extends Strategy 
  { 
    public static final lifted114 instance = new lifted114();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail251:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consConditionDec_1 != ((IStrategoAppl)term).getConstructor())
          break Fail251;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted119 extends Strategy 
  { 
    TermReference l_49;

    TermReference m_49;

    TermReference n_49;

    TermReference o_49;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail252:
      { 
        term = fill$Method$Maps_0_4.instance.invoke(context, term, l_49.value, m_49.value, n_49.value, o_49.value);
        if(term == null)
          break Fail252;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted113 extends Strategy 
  { 
    public static final lifted113 instance = new lifted113();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail253:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail253;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted112 extends Strategy 
  { 
    public static final lifted112 instance = new lifted112();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail254:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consCoordinatorDec_2 != ((IStrategoAppl)term).getConstructor())
          break Fail254;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted111 extends Strategy 
  { 
    public static final lifted111 instance = new lifted111();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail255:
      { 
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted109 extends Strategy 
  { 
    public static final lifted109 instance = new lifted109();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail256:
      { 
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted107 extends Strategy 
  { 
    public static final lifted107 instance = new lifted107();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail257:
      { 
        term = termFactory.makeAppl(transform._consLit_1, new IStrategoTerm[]{termFactory.makeAppl(transform._consString_1, new IStrategoTerm[]{(IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transform._consChars_1, new IStrategoTerm[]{term}), (IStrategoList)transform.constNil0)})});
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted103 extends Strategy 
  { 
    TermReference o_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail258:
      { 
        lifted105 lifted1050 = new lifted105();
        lifted104 lifted1040 = new lifted104();
        lifted1050.o_40 = o_40;
        lifted1040.o_40 = o_40;
        term = or_2_0.instance.invoke(context, term, lifted1040, lifted1050);
        if(term == null)
          break Fail258;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted105 extends Strategy 
  { 
    TermReference o_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail259:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail259;
        if(o_40.value == null)
          o_40.value = term.getSubterm(0);
        else
          if(o_40.value != term.getSubterm(0) && !o_40.value.match(term.getSubterm(0)))
            break Fail259;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted104 extends Strategy 
  { 
    TermReference o_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail260:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail260;
        if(o_40.value == null)
          o_40.value = term.getSubterm(0);
        else
          if(o_40.value != term.getSubterm(0) && !o_40.value.match(term.getSubterm(0)))
            break Fail260;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted100 extends Strategy 
  { 
    TermReference o_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail261:
      { 
        lifted102 lifted1020 = new lifted102();
        lifted101 lifted1011 = new lifted101();
        lifted1020.o_40 = o_40;
        lifted1011.o_40 = o_40;
        term = or_2_0.instance.invoke(context, term, lifted1011, lifted1020);
        if(term == null)
          break Fail261;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted102 extends Strategy 
  { 
    TermReference o_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail262:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail262;
        if(o_40.value == null)
          o_40.value = term.getSubterm(0);
        else
          if(o_40.value != term.getSubterm(0) && !o_40.value.match(term.getSubterm(0)))
            break Fail262;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted101 extends Strategy 
  { 
    TermReference o_40;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail263:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
          break Fail263;
        if(o_40.value == null)
          o_40.value = term.getSubterm(0);
        else
          if(o_40.value != term.getSubterm(0) && !o_40.value.match(term.getSubterm(0)))
            break Fail263;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted99 extends Strategy 
  { 
    TermReference n_41;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail264:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
          break Fail264;
        if(n_41.value == null)
          n_41.value = term.getSubterm(0);
        else
          if(n_41.value != term.getSubterm(0) && !n_41.value.match(term.getSubterm(0)))
            break Fail264;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted96 extends Strategy 
  { 
    TermReference n_41;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail265:
      { 
        lifted98 lifted980 = new lifted98();
        lifted97 lifted970 = new lifted97();
        lifted980.n_41 = n_41;
        lifted970.n_41 = n_41;
        term = or_2_0.instance.invoke(context, term, lifted970, lifted980);
        if(term == null)
          break Fail265;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted98 extends Strategy 
  { 
    TermReference n_41;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail266:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
          break Fail266;
        if(n_41.value == null)
          n_41.value = term.getSubterm(0);
        else
          if(n_41.value != term.getSubterm(0) && !n_41.value.match(term.getSubterm(0)))
            break Fail266;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted97 extends Strategy 
  { 
    TermReference n_41;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail267:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLeftShift_2 != ((IStrategoAppl)term).getConstructor())
          break Fail267;
        if(n_41.value == null)
          n_41.value = term.getSubterm(0);
        else
          if(n_41.value != term.getSubterm(0) && !n_41.value.match(term.getSubterm(0)))
            break Fail267;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted95 extends Strategy 
  { 
    public static final lifted95 instance = new lifted95();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail268:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consRemain_2 != ((IStrategoAppl)term).getConstructor())
          break Fail268;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted88 extends Strategy 
  { 
    public static final lifted88 instance = new lifted88();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail269:
      { 
        term = or_2_0.instance.invoke(context, term, lifted89.instance, lifted92.instance);
        if(term == null)
          break Fail269;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted92 extends Strategy 
  { 
    public static final lifted92 instance = new lifted92();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail270:
      { 
        term = or_2_0.instance.invoke(context, term, lifted93.instance, lifted94.instance);
        if(term == null)
          break Fail270;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted94 extends Strategy 
  { 
    public static final lifted94 instance = new lifted94();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail271:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consDiv_2 != ((IStrategoAppl)term).getConstructor())
          break Fail271;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted93 extends Strategy 
  { 
    public static final lifted93 instance = new lifted93();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail272:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMul_2 != ((IStrategoAppl)term).getConstructor())
          break Fail272;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted89 extends Strategy 
  { 
    public static final lifted89 instance = new lifted89();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail273:
      { 
        term = or_2_0.instance.invoke(context, term, lifted90.instance, lifted91.instance);
        if(term == null)
          break Fail273;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted91 extends Strategy 
  { 
    public static final lifted91 instance = new lifted91();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail274:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail274;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted90 extends Strategy 
  { 
    public static final lifted90 instance = new lifted90();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail275:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail275;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted87 extends Strategy 
  { 
    public static final lifted87 instance = new lifted87();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail276:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail276;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted86 extends Strategy 
  { 
    public static final lifted86 instance = new lifted86();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail277:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail277;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted85 extends Strategy 
  { 
    public static final lifted85 instance = new lifted85();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail278:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail278;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted84 extends Strategy 
  { 
    public static final lifted84 instance = new lifted84();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail279:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail279;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted83 extends Strategy 
  { 
    public static final lifted83 instance = new lifted83();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail280:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail280;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted82 extends Strategy 
  { 
    public static final lifted82 instance = new lifted82();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail281:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail281;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted81 extends Strategy 
  { 
    public static final lifted81 instance = new lifted81();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail282:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail282;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted80 extends Strategy 
  { 
    public static final lifted80 instance = new lifted80();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail283:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail283;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted79 extends Strategy 
  { 
    public static final lifted79 instance = new lifted79();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail284:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail284;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted78 extends Strategy 
  { 
    public static final lifted78 instance = new lifted78();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail285:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail285;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted77 extends Strategy 
  { 
    public static final lifted77 instance = new lifted77();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail286:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail286;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted76 extends Strategy 
  { 
    public static final lifted76 instance = new lifted76();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail287:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail287;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted75 extends Strategy 
  { 
    public static final lifted75 instance = new lifted75();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail288:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail288;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted74 extends Strategy 
  { 
    public static final lifted74 instance = new lifted74();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail289:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail289;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted73 extends Strategy 
  { 
    public static final lifted73 instance = new lifted73();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail290:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail290;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted72 extends Strategy 
  { 
    public static final lifted72 instance = new lifted72();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail291:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail291;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted71 extends Strategy 
  { 
    public static final lifted71 instance = new lifted71();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail292:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail292;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted70 extends Strategy 
  { 
    public static final lifted70 instance = new lifted70();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail293:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail293;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted69 extends Strategy 
  { 
    public static final lifted69 instance = new lifted69();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail294:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail294;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted68 extends Strategy 
  { 
    public static final lifted68 instance = new lifted68();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail295:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail295;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted67 extends Strategy 
  { 
    public static final lifted67 instance = new lifted67();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail296:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail296;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted66 extends Strategy 
  { 
    public static final lifted66 instance = new lifted66();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail297:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail297;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted65 extends Strategy 
  { 
    public static final lifted65 instance = new lifted65();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail298:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail298;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted64 extends Strategy 
  { 
    public static final lifted64 instance = new lifted64();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail299:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail299;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted63 extends Strategy 
  { 
    public static final lifted63 instance = new lifted63();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail300:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBool_1 != ((IStrategoAppl)term).getConstructor())
          break Fail300;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted62 extends Strategy 
  { 
    public static final lifted62 instance = new lifted62();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail301:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consBoolean_0 != ((IStrategoAppl)term).getConstructor())
          break Fail301;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted61 extends Strategy 
  { 
    public static final lifted61 instance = new lifted61();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail302:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_1 != ((IStrategoAppl)term).getConstructor())
          break Fail302;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted60 extends Strategy 
  { 
    public static final lifted60 instance = new lifted60();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail303:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFloat_0 != ((IStrategoAppl)term).getConstructor())
          break Fail303;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted59 extends Strategy 
  { 
    public static final lifted59 instance = new lifted59();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail304:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_1 != ((IStrategoAppl)term).getConstructor())
          break Fail304;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted58 extends Strategy 
  { 
    public static final lifted58 instance = new lifted58();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail305:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consChar_0 != ((IStrategoAppl)term).getConstructor())
          break Fail305;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted57 extends Strategy 
  { 
    TermReference n_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail306:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consVarArityParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail306;
        IStrategoTerm arg60 = term.getSubterm(2);
        if(arg60.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg60).getConstructor())
          break Fail306;
        if(n_24.value == null)
          n_24.value = arg60.getSubterm(0);
        else
          if(n_24.value != arg60.getSubterm(0) && !n_24.value.match(arg60.getSubterm(0)))
            break Fail306;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted56 extends Strategy 
  { 
    TermReference n_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail307:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consParam_3 != ((IStrategoAppl)term).getConstructor())
          break Fail307;
        IStrategoTerm arg57 = term.getSubterm(2);
        if(arg57.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg57).getConstructor())
          break Fail307;
        if(n_24.value == null)
          n_24.value = arg57.getSubterm(0);
        else
          if(n_24.value != arg57.getSubterm(0) && !n_24.value.match(arg57.getSubterm(0)))
            break Fail307;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted54 extends Strategy 
  { 
    TermReference g_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail308:
      { 
        if(g_24.value == null)
          break Fail308;
        term = fetch_1_0.instance.invoke(context, g_24.value, lifted55.instance);
        if(term == null)
          break Fail308;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted55 extends Strategy 
  { 
    public static final lifted55 instance = new lifted55();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail309:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
          break Fail309;
        IStrategoTerm arg51 = term.getSubterm(0);
        if(arg51.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg51).getConstructor())
          break Fail309;
        IStrategoTerm arg52 = arg51.getSubterm(0);
        if(arg52.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg52).getConstructor())
          break Fail309;
        IStrategoTerm arg53 = arg52.getSubterm(0);
        if(arg53.getTermType() != IStrategoTerm.STRING || !"COOLOnExit".equals(((IStrategoString)arg53).stringValue()))
          break Fail309;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted52 extends Strategy 
  { 
    TermReference g_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail310:
      { 
        if(g_24.value == null)
          break Fail310;
        term = fetch_1_0.instance.invoke(context, g_24.value, lifted53.instance);
        if(term == null)
          break Fail310;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted53 extends Strategy 
  { 
    public static final lifted53 instance = new lifted53();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail311:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnno_2 != ((IStrategoAppl)term).getConstructor())
          break Fail311;
        IStrategoTerm arg47 = term.getSubterm(0);
        if(arg47.getTermType() != IStrategoTerm.APPL || transform._consTypeName_1 != ((IStrategoAppl)arg47).getConstructor())
          break Fail311;
        IStrategoTerm arg48 = arg47.getSubterm(0);
        if(arg48.getTermType() != IStrategoTerm.APPL || transform._consId_1 != ((IStrategoAppl)arg48).getConstructor())
          break Fail311;
        IStrategoTerm arg49 = arg48.getSubterm(0);
        if(arg49.getTermType() != IStrategoTerm.STRING || !"COOLOnEntry".equals(((IStrategoString)arg49).stringValue()))
          break Fail311;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted51 extends Strategy 
  { 
    TermReference g_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail312:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consDeprMethodDecHead_7 != ((IStrategoAppl)term).getConstructor())
          break Fail312;
        if(g_24.value == null)
          g_24.value = term.getSubterm(0);
        else
          if(g_24.value != term.getSubterm(0) && !g_24.value.match(term.getSubterm(0)))
            break Fail312;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted50 extends Strategy 
  { 
    TermReference g_24;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail313:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMethodDecHead_6 != ((IStrategoAppl)term).getConstructor())
          break Fail313;
        if(g_24.value == null)
          g_24.value = term.getSubterm(0);
        else
          if(g_24.value != term.getSubterm(0) && !g_24.value.match(term.getSubterm(0)))
            break Fail313;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class arik_0_9_fragment_1 extends Strategy 
  { 
    TermReference e_12;

    TermReference f_12;

    TermReference h_12;

    TermReference g_12;

    TermReference i_12;

    TermReference j_12;

    TermReference k_12;

    TermReference l_12;

    TermReference m_12;

    TermReference n_12;

    TermReference o_12;

    TermReference p_12;

    TermReference q_12;

    TermReference r_12;

    TermReference v_12;

    TermReference t_12;

    TermReference s_12;

    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference u_11;

    TermReference v_11;

    TermReference w_11;

    TermReference u_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail314:
      { 
        IStrategoTerm term31 = term;
        Success181:
        { 
          Fail315:
          { 
            IStrategoTerm s_13 = null;
            s_13 = term;
            if(v_12.value == null)
              break Fail315;
            term = v_12.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consRightShift_2 != ((IStrategoAppl)term).getConstructor())
              break Fail315;
            if(k_12.value == null)
              k_12.value = term.getSubterm(0);
            else
              if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
                break Fail315;
            if(l_12.value == null)
              l_12.value = term.getSubterm(1);
            else
              if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
                break Fail315;
            term = s_13;
            { 
              IStrategoTerm k_17 = null;
              IStrategoTerm m_17 = null;
              IStrategoTerm p_17 = null;
              IStrategoTerm term32 = term;
              Success182:
              { 
                Fail316:
                { 
                  IStrategoTerm t_13 = null;
                  t_13 = term;
                  if(u_11.value == null)
                    break Fail316;
                  term = termFactory.makeTuple(u_11.value, transform.constNone0);
                  term = equal_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail316;
                  term = t_13;
                  { 
                    if(k_12.value == null)
                      break Fail314;
                    term = get_type_of_0_3.instance.invoke(context, k_12.value, u_11.value, o_11.value, p_11.value);
                    if(term == null)
                      break Fail314;
                    term = ee_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail314;
                    if(f_12.value == null)
                      f_12.value = term;
                    else
                      if(f_12.value != term && !f_12.value.match(term))
                        break Fail314;
                    if(true)
                      break Success182;
                  }
                }
                term = term32;
                if(u_11.value == null)
                  break Fail314;
                term = ee_0_0.instance.invoke(context, u_11.value);
                if(term == null)
                  break Fail314;
                if(f_12.value == null)
                  f_12.value = term;
                else
                  if(f_12.value != term && !f_12.value.match(term))
                    break Fail314;
              }
              m_17 = term;
              if(k_12.value == null)
                break Fail314;
              term = arik_0_9.instance.invokeDynamic(context, k_12.value, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, f_12.value, v_11.value, w_11.value});
              if(term == null)
                break Fail314;
              k_17 = term;
              term = m_17;
              if(l_12.value == null)
                break Fail314;
              p_17 = l_12.value;
              term = arik_0_9.instance.invokeDynamic(context, p_17, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constLong0, v_11.value, w_11.value});
              if(term == null)
                break Fail314;
              term = termFactory.makeAppl(transform._consRightShift_2, new IStrategoTerm[]{k_17, term});
              if(true)
                break Success181;
            }
          }
          term = term31;
          IStrategoTerm term33 = term;
          Success183:
          { 
            Fail317:
            { 
              IStrategoTerm u_13 = null;
              u_13 = term;
              if(v_12.value == null)
                break Fail317;
              term = v_12.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consURightShift_2 != ((IStrategoAppl)term).getConstructor())
                break Fail317;
              if(k_12.value == null)
                k_12.value = term.getSubterm(0);
              else
                if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
                  break Fail317;
              if(l_12.value == null)
                l_12.value = term.getSubterm(1);
              else
                if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
                  break Fail317;
              term = u_13;
              { 
                IStrategoTerm q_17 = null;
                IStrategoTerm s_17 = null;
                IStrategoTerm v_17 = null;
                IStrategoTerm term34 = term;
                Success184:
                { 
                  Fail318:
                  { 
                    IStrategoTerm y_13 = null;
                    y_13 = term;
                    if(u_11.value == null)
                      break Fail318;
                    term = termFactory.makeTuple(u_11.value, transform.constNone0);
                    term = equal_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail318;
                    term = y_13;
                    { 
                      if(k_12.value == null)
                        break Fail314;
                      term = get_type_of_0_3.instance.invoke(context, k_12.value, u_11.value, o_11.value, p_11.value);
                      if(term == null)
                        break Fail314;
                      term = ee_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail314;
                      if(f_12.value == null)
                        f_12.value = term;
                      else
                        if(f_12.value != term && !f_12.value.match(term))
                          break Fail314;
                      if(true)
                        break Success184;
                    }
                  }
                  term = term34;
                  if(u_11.value == null)
                    break Fail314;
                  term = ee_0_0.instance.invoke(context, u_11.value);
                  if(term == null)
                    break Fail314;
                  if(f_12.value == null)
                    f_12.value = term;
                  else
                    if(f_12.value != term && !f_12.value.match(term))
                      break Fail314;
                }
                s_17 = term;
                if(k_12.value == null)
                  break Fail314;
                term = arik_0_9.instance.invokeDynamic(context, k_12.value, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, f_12.value, v_11.value, w_11.value});
                if(term == null)
                  break Fail314;
                q_17 = term;
                term = s_17;
                if(l_12.value == null)
                  break Fail314;
                v_17 = l_12.value;
                term = arik_0_9.instance.invokeDynamic(context, v_17, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constLong0, v_11.value, w_11.value});
                if(term == null)
                  break Fail314;
                term = termFactory.makeAppl(transform._consURightShift_2, new IStrategoTerm[]{q_17, term});
                if(true)
                  break Success183;
              }
            }
            term = term33;
            IStrategoTerm term35 = term;
            Success185:
            { 
              Fail319:
              { 
                IStrategoTerm z_13 = null;
                z_13 = term;
                if(v_12.value == null)
                  break Fail319;
                term = v_12.value;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consPreIncr_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail319;
                if(t_12.value == null)
                  t_12.value = term.getSubterm(0);
                else
                  if(t_12.value != term.getSubterm(0) && !t_12.value.match(term.getSubterm(0)))
                    break Fail319;
                term = z_13;
                { 
                  if(t_12.value == null)
                    break Fail314;
                  term = get_type_of_0_3.instance.invoke(context, t_12.value, u_11.value, o_11.value, p_11.value);
                  if(term == null)
                    break Fail314;
                  if(e_12.value == null)
                    e_12.value = term;
                  else
                    if(e_12.value != term && !e_12.value.match(term))
                      break Fail314;
                  IStrategoTerm term36 = term;
                  Success186:
                  { 
                    Fail320:
                    { 
                      IStrategoTerm a_14 = null;
                      a_14 = term;
                      if(e_12.value == null)
                        break Fail320;
                      term = termFactory.makeTuple(e_12.value, transform.constNone0);
                      term = equal_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail320;
                      term = a_14;
                      { 
                        IStrategoTerm term37 = term;
                        Success187:
                        { 
                          Fail321:
                          { 
                            IStrategoTerm b_14 = null;
                            b_14 = term;
                            if(u_11.value == null)
                              break Fail321;
                            term = termFactory.makeTuple(u_11.value, transform.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail321;
                            term = b_14;
                            { 
                              term = transform.constDouble0;
                              if(f_12.value == null)
                                f_12.value = term;
                              else
                                if(f_12.value != term && !f_12.value.match(term))
                                  break Fail314;
                              if(true)
                                break Success187;
                            }
                          }
                          term = term37;
                          if(u_11.value == null)
                            break Fail314;
                          term = ensure__number_0_0.instance.invoke(context, u_11.value);
                          if(term == null)
                            break Fail314;
                          if(f_12.value == null)
                            f_12.value = term;
                          else
                            if(f_12.value != term && !f_12.value.match(term))
                              break Fail314;
                        }
                        if(true)
                          break Success186;
                      }
                    }
                    term = term36;
                    if(e_12.value == null)
                      break Fail314;
                    term = ensure__number_0_0.instance.invoke(context, e_12.value);
                    if(term == null)
                      break Fail314;
                    if(f_12.value == null)
                      f_12.value = term;
                    else
                      if(f_12.value != term && !f_12.value.match(term))
                        break Fail314;
                  }
                  if(t_12.value == null)
                    break Fail314;
                  term = arik_0_9.instance.invokeDynamic(context, t_12.value, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, f_12.value, v_11.value, w_11.value});
                  if(term == null)
                    break Fail314;
                  term = termFactory.makeAppl(transform._consPreIncr_1, new IStrategoTerm[]{term});
                  if(true)
                    break Success185;
                }
              }
              term = term35;
              IStrategoTerm term38 = term;
              Success188:
              { 
                Fail322:
                { 
                  IStrategoTerm c_14 = null;
                  c_14 = term;
                  if(v_12.value == null)
                    break Fail322;
                  term = v_12.value;
                  if(term.getTermType() != IStrategoTerm.APPL || transform._consPostIncr_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail322;
                  if(t_12.value == null)
                    t_12.value = term.getSubterm(0);
                  else
                    if(t_12.value != term.getSubterm(0) && !t_12.value.match(term.getSubterm(0)))
                      break Fail322;
                  term = c_14;
                  { 
                    if(t_12.value == null)
                      break Fail314;
                    term = get_type_of_0_3.instance.invoke(context, t_12.value, u_11.value, o_11.value, p_11.value);
                    if(term == null)
                      break Fail314;
                    if(e_12.value == null)
                      e_12.value = term;
                    else
                      if(e_12.value != term && !e_12.value.match(term))
                        break Fail314;
                    IStrategoTerm term39 = term;
                    Success189:
                    { 
                      Fail323:
                      { 
                        IStrategoTerm d_14 = null;
                        d_14 = term;
                        if(e_12.value == null)
                          break Fail323;
                        term = termFactory.makeTuple(e_12.value, transform.constNone0);
                        term = equal_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail323;
                        term = d_14;
                        { 
                          IStrategoTerm term40 = term;
                          Success190:
                          { 
                            Fail324:
                            { 
                              IStrategoTerm e_14 = null;
                              e_14 = term;
                              if(u_11.value == null)
                                break Fail324;
                              term = termFactory.makeTuple(u_11.value, transform.constNone0);
                              term = equal_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail324;
                              term = e_14;
                              { 
                                term = transform.constDouble0;
                                if(f_12.value == null)
                                  f_12.value = term;
                                else
                                  if(f_12.value != term && !f_12.value.match(term))
                                    break Fail314;
                                if(true)
                                  break Success190;
                              }
                            }
                            term = term40;
                            if(u_11.value == null)
                              break Fail314;
                            term = ensure__number_0_0.instance.invoke(context, u_11.value);
                            if(term == null)
                              break Fail314;
                            if(f_12.value == null)
                              f_12.value = term;
                            else
                              if(f_12.value != term && !f_12.value.match(term))
                                break Fail314;
                          }
                          if(true)
                            break Success189;
                        }
                      }
                      term = term39;
                      if(e_12.value == null)
                        break Fail314;
                      term = ensure__number_0_0.instance.invoke(context, e_12.value);
                      if(term == null)
                        break Fail314;
                      if(f_12.value == null)
                        f_12.value = term;
                      else
                        if(f_12.value != term && !f_12.value.match(term))
                          break Fail314;
                    }
                    if(t_12.value == null)
                      break Fail314;
                    term = arik_0_9.instance.invokeDynamic(context, t_12.value, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, f_12.value, v_11.value, w_11.value});
                    if(term == null)
                      break Fail314;
                    term = termFactory.makeAppl(transform._consPostIncr_1, new IStrategoTerm[]{term});
                    if(true)
                      break Success188;
                  }
                }
                term = term38;
                IStrategoTerm term41 = term;
                Success191:
                { 
                  Fail325:
                  { 
                    IStrategoTerm f_14 = null;
                    f_14 = term;
                    if(v_12.value == null)
                      break Fail325;
                    term = v_12.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consPreDecr_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail325;
                    if(t_12.value == null)
                      t_12.value = term.getSubterm(0);
                    else
                      if(t_12.value != term.getSubterm(0) && !t_12.value.match(term.getSubterm(0)))
                        break Fail325;
                    term = f_14;
                    { 
                      if(t_12.value == null)
                        break Fail314;
                      term = get_type_of_0_3.instance.invoke(context, t_12.value, u_11.value, o_11.value, p_11.value);
                      if(term == null)
                        break Fail314;
                      if(e_12.value == null)
                        e_12.value = term;
                      else
                        if(e_12.value != term && !e_12.value.match(term))
                          break Fail314;
                      IStrategoTerm term42 = term;
                      Success192:
                      { 
                        Fail326:
                        { 
                          IStrategoTerm g_14 = null;
                          g_14 = term;
                          if(e_12.value == null)
                            break Fail326;
                          term = termFactory.makeTuple(e_12.value, transform.constNone0);
                          term = equal_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail326;
                          term = g_14;
                          { 
                            IStrategoTerm term43 = term;
                            Success193:
                            { 
                              Fail327:
                              { 
                                IStrategoTerm h_14 = null;
                                h_14 = term;
                                if(u_11.value == null)
                                  break Fail327;
                                term = termFactory.makeTuple(u_11.value, transform.constNone0);
                                term = equal_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail327;
                                term = h_14;
                                { 
                                  term = transform.constDouble0;
                                  if(f_12.value == null)
                                    f_12.value = term;
                                  else
                                    if(f_12.value != term && !f_12.value.match(term))
                                      break Fail314;
                                  if(true)
                                    break Success193;
                                }
                              }
                              term = term43;
                              if(u_11.value == null)
                                break Fail314;
                              term = ensure__number_0_0.instance.invoke(context, u_11.value);
                              if(term == null)
                                break Fail314;
                              if(f_12.value == null)
                                f_12.value = term;
                              else
                                if(f_12.value != term && !f_12.value.match(term))
                                  break Fail314;
                            }
                            if(true)
                              break Success192;
                          }
                        }
                        term = term42;
                        if(e_12.value == null)
                          break Fail314;
                        term = ensure__number_0_0.instance.invoke(context, e_12.value);
                        if(term == null)
                          break Fail314;
                        if(f_12.value == null)
                          f_12.value = term;
                        else
                          if(f_12.value != term && !f_12.value.match(term))
                            break Fail314;
                      }
                      if(t_12.value == null)
                        break Fail314;
                      term = arik_0_9.instance.invokeDynamic(context, t_12.value, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, f_12.value, v_11.value, w_11.value});
                      if(term == null)
                        break Fail314;
                      term = termFactory.makeAppl(transform._consPreDecr_1, new IStrategoTerm[]{term});
                      if(true)
                        break Success191;
                    }
                  }
                  term = term41;
                  IStrategoTerm term44 = term;
                  Success194:
                  { 
                    Fail328:
                    { 
                      IStrategoTerm i_14 = null;
                      i_14 = term;
                      if(v_12.value == null)
                        break Fail328;
                      term = v_12.value;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consPostDecr_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail328;
                      if(t_12.value == null)
                        t_12.value = term.getSubterm(0);
                      else
                        if(t_12.value != term.getSubterm(0) && !t_12.value.match(term.getSubterm(0)))
                          break Fail328;
                      term = i_14;
                      { 
                        if(t_12.value == null)
                          break Fail314;
                        term = get_type_of_0_3.instance.invoke(context, t_12.value, u_11.value, o_11.value, p_11.value);
                        if(term == null)
                          break Fail314;
                        if(e_12.value == null)
                          e_12.value = term;
                        else
                          if(e_12.value != term && !e_12.value.match(term))
                            break Fail314;
                        IStrategoTerm term45 = term;
                        Success195:
                        { 
                          Fail329:
                          { 
                            IStrategoTerm j_14 = null;
                            j_14 = term;
                            if(e_12.value == null)
                              break Fail329;
                            term = termFactory.makeTuple(e_12.value, transform.constNone0);
                            term = equal_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail329;
                            term = j_14;
                            { 
                              IStrategoTerm term46 = term;
                              Success196:
                              { 
                                Fail330:
                                { 
                                  IStrategoTerm k_14 = null;
                                  k_14 = term;
                                  if(u_11.value == null)
                                    break Fail330;
                                  term = termFactory.makeTuple(u_11.value, transform.constNone0);
                                  term = equal_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail330;
                                  term = k_14;
                                  { 
                                    term = transform.constDouble0;
                                    if(f_12.value == null)
                                      f_12.value = term;
                                    else
                                      if(f_12.value != term && !f_12.value.match(term))
                                        break Fail314;
                                    if(true)
                                      break Success196;
                                  }
                                }
                                term = term46;
                                if(u_11.value == null)
                                  break Fail314;
                                term = ensure__number_0_0.instance.invoke(context, u_11.value);
                                if(term == null)
                                  break Fail314;
                                if(f_12.value == null)
                                  f_12.value = term;
                                else
                                  if(f_12.value != term && !f_12.value.match(term))
                                    break Fail314;
                              }
                              if(true)
                                break Success195;
                            }
                          }
                          term = term45;
                          if(e_12.value == null)
                            break Fail314;
                          term = ensure__number_0_0.instance.invoke(context, e_12.value);
                          if(term == null)
                            break Fail314;
                          if(f_12.value == null)
                            f_12.value = term;
                          else
                            if(f_12.value != term && !f_12.value.match(term))
                              break Fail314;
                        }
                        if(t_12.value == null)
                          break Fail314;
                        term = arik_0_9.instance.invokeDynamic(context, t_12.value, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, f_12.value, v_11.value, w_11.value});
                        if(term == null)
                          break Fail314;
                        term = termFactory.makeAppl(transform._consPostDecr_1, new IStrategoTerm[]{term});
                        if(true)
                          break Success194;
                      }
                    }
                    term = term44;
                    IStrategoTerm term47 = term;
                    Success197:
                    { 
                      Fail331:
                      { 
                        IStrategoTerm l_14 = null;
                        l_14 = term;
                        if(v_12.value == null)
                          break Fail331;
                        term = v_12.value;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consNot_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail331;
                        term = l_14;
                        { 
                          if(u_12.value == null)
                            break Fail314;
                          term = u_12.value;
                          lifted40 lifted400 = new lifted40();
                          lifted400.o_11 = o_11;
                          lifted400.p_11 = p_11;
                          lifted400.q_11 = q_11;
                          lifted400.r_11 = r_11;
                          lifted400.s_11 = s_11;
                          lifted400.t_11 = t_11;
                          lifted400.v_11 = v_11;
                          lifted400.w_11 = w_11;
                          term = SRTS_all.instance.invoke(context, term, lifted400);
                          if(term == null)
                            break Fail314;
                          if(true)
                            break Success197;
                        }
                      }
                      term = term47;
                      IStrategoTerm term48 = term;
                      Success198:
                      { 
                        Fail332:
                        { 
                          IStrategoTerm m_14 = null;
                          m_14 = term;
                          if(v_12.value == null)
                            break Fail332;
                          term = or_2_0.instance.invoke(context, v_12.value, lifted41.instance, lifted44.instance);
                          if(term == null)
                            break Fail332;
                          term = m_14;
                          { 
                            if(u_12.value == null)
                              break Fail314;
                            term = u_12.value;
                            lifted45 lifted450 = new lifted45();
                            lifted450.u_12 = u_12;
                            lifted450.u_11 = u_11;
                            lifted450.o_11 = o_11;
                            lifted450.p_11 = p_11;
                            lifted450.q_11 = q_11;
                            lifted450.r_11 = r_11;
                            lifted450.s_11 = s_11;
                            lifted450.t_11 = t_11;
                            lifted450.v_11 = v_11;
                            lifted450.w_11 = w_11;
                            term = SRTS_all.instance.invoke(context, term, lifted450);
                            if(term == null)
                              break Fail314;
                            if(true)
                              break Success198;
                          }
                        }
                        term = term48;
                        IStrategoTerm term49 = term;
                        Success199:
                        { 
                          Fail333:
                          { 
                            IStrategoTerm n_14 = null;
                            n_14 = term;
                            if(v_12.value == null)
                              break Fail333;
                            term = v_12.value;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssign_2 != ((IStrategoAppl)term).getConstructor())
                              break Fail333;
                            if(g_12.value == null)
                              g_12.value = term.getSubterm(0);
                            else
                              if(g_12.value != term.getSubterm(0) && !g_12.value.match(term.getSubterm(0)))
                                break Fail333;
                            if(t_12.value == null)
                              t_12.value = term.getSubterm(1);
                            else
                              if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                break Fail333;
                            term = n_14;
                            { 
                              IStrategoTerm k_18 = null;
                              IStrategoTerm l_18 = null;
                              if(g_12.value == null)
                                break Fail314;
                              term = get_$L$H$S_type_0_3.instance.invoke(context, g_12.value, u_11.value, o_11.value, p_11.value);
                              if(term == null)
                                break Fail314;
                              if(h_12.value == null)
                                h_12.value = term;
                              else
                                if(h_12.value != term && !h_12.value.match(term))
                                  break Fail314;
                              l_18 = term;
                              if(t_12.value == null)
                                break Fail314;
                              term = arik_0_9.instance.invokeDynamic(context, t_12.value, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, h_12.value, v_11.value, w_11.value});
                              if(term == null)
                                break Fail314;
                              k_18 = term;
                              term = l_18;
                              if(g_12.value == null)
                                break Fail314;
                              term = termFactory.makeAppl(transform._consAssign_2, new IStrategoTerm[]{g_12.value, k_18});
                              if(true)
                                break Success199;
                            }
                          }
                          term = term49;
                          IStrategoTerm term50 = term;
                          Success200:
                          { 
                            Fail334:
                            { 
                              IStrategoTerm o_14 = null;
                              o_14 = term;
                              if(v_12.value == null)
                                break Fail334;
                              term = v_12.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignMul_2 != ((IStrategoAppl)term).getConstructor())
                                break Fail334;
                              if(g_12.value == null)
                                g_12.value = term.getSubterm(0);
                              else
                                if(g_12.value != term.getSubterm(0) && !g_12.value.match(term.getSubterm(0)))
                                  break Fail334;
                              if(t_12.value == null)
                                t_12.value = term.getSubterm(1);
                              else
                                if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                  break Fail334;
                              term = o_14;
                              { 
                                IStrategoTerm m_18 = null;
                                IStrategoTerm n_18 = null;
                                IStrategoTerm p_18 = null;
                                if(g_12.value == null)
                                  break Fail314;
                                term = get_$L$H$S_type_0_3.instance.invoke(context, g_12.value, u_11.value, o_11.value, p_11.value);
                                if(term == null)
                                  break Fail314;
                                n_18 = term;
                                if(t_12.value == null)
                                  break Fail314;
                                p_18 = t_12.value;
                                term = arik_0_9.instance.invokeDynamic(context, p_18, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constDouble0, v_11.value, w_11.value});
                                if(term == null)
                                  break Fail314;
                                m_18 = term;
                                term = n_18;
                                if(g_12.value == null)
                                  break Fail314;
                                term = termFactory.makeAppl(transform._consAssignMul_2, new IStrategoTerm[]{g_12.value, m_18});
                                if(true)
                                  break Success200;
                              }
                            }
                            term = term50;
                            IStrategoTerm term51 = term;
                            Success201:
                            { 
                              Fail335:
                              { 
                                IStrategoTerm p_14 = null;
                                p_14 = term;
                                if(v_12.value == null)
                                  break Fail335;
                                term = v_12.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignDiv_2 != ((IStrategoAppl)term).getConstructor())
                                  break Fail335;
                                if(g_12.value == null)
                                  g_12.value = term.getSubterm(0);
                                else
                                  if(g_12.value != term.getSubterm(0) && !g_12.value.match(term.getSubterm(0)))
                                    break Fail335;
                                if(t_12.value == null)
                                  t_12.value = term.getSubterm(1);
                                else
                                  if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                    break Fail335;
                                term = p_14;
                                { 
                                  IStrategoTerm q_18 = null;
                                  IStrategoTerm r_18 = null;
                                  IStrategoTerm t_18 = null;
                                  if(g_12.value == null)
                                    break Fail314;
                                  term = get_$L$H$S_type_0_3.instance.invoke(context, g_12.value, u_11.value, o_11.value, p_11.value);
                                  if(term == null)
                                    break Fail314;
                                  r_18 = term;
                                  if(t_12.value == null)
                                    break Fail314;
                                  t_18 = t_12.value;
                                  term = arik_0_9.instance.invokeDynamic(context, t_18, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constDouble0, v_11.value, w_11.value});
                                  if(term == null)
                                    break Fail314;
                                  q_18 = term;
                                  term = r_18;
                                  if(g_12.value == null)
                                    break Fail314;
                                  term = termFactory.makeAppl(transform._consAssignDiv_2, new IStrategoTerm[]{g_12.value, q_18});
                                  if(true)
                                    break Success201;
                                }
                              }
                              term = term51;
                              IStrategoTerm term52 = term;
                              Success202:
                              { 
                                Fail336:
                                { 
                                  IStrategoTerm s_14 = null;
                                  s_14 = term;
                                  if(v_12.value == null)
                                    break Fail336;
                                  term = v_12.value;
                                  if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignRemain_2 != ((IStrategoAppl)term).getConstructor())
                                    break Fail336;
                                  if(g_12.value == null)
                                    g_12.value = term.getSubterm(0);
                                  else
                                    if(g_12.value != term.getSubterm(0) && !g_12.value.match(term.getSubterm(0)))
                                      break Fail336;
                                  if(t_12.value == null)
                                    t_12.value = term.getSubterm(1);
                                  else
                                    if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                      break Fail336;
                                  term = s_14;
                                  { 
                                    IStrategoTerm u_18 = null;
                                    IStrategoTerm v_18 = null;
                                    IStrategoTerm x_18 = null;
                                    if(g_12.value == null)
                                      break Fail314;
                                    term = get_$L$H$S_type_0_3.instance.invoke(context, g_12.value, u_11.value, o_11.value, p_11.value);
                                    if(term == null)
                                      break Fail314;
                                    v_18 = term;
                                    if(t_12.value == null)
                                      break Fail314;
                                    x_18 = t_12.value;
                                    term = arik_0_9.instance.invokeDynamic(context, x_18, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constDouble0, v_11.value, w_11.value});
                                    if(term == null)
                                      break Fail314;
                                    u_18 = term;
                                    term = v_18;
                                    if(g_12.value == null)
                                      break Fail314;
                                    term = termFactory.makeAppl(transform._consAssignRemain_2, new IStrategoTerm[]{g_12.value, u_18});
                                    if(true)
                                      break Success202;
                                  }
                                }
                                term = term52;
                                IStrategoTerm term53 = term;
                                Success203:
                                { 
                                  Fail337:
                                  { 
                                    IStrategoTerm t_14 = null;
                                    t_14 = term;
                                    if(v_12.value == null)
                                      break Fail337;
                                    term = v_12.value;
                                    if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignPlus_2 != ((IStrategoAppl)term).getConstructor())
                                      break Fail337;
                                    if(g_12.value == null)
                                      g_12.value = term.getSubterm(0);
                                    else
                                      if(g_12.value != term.getSubterm(0) && !g_12.value.match(term.getSubterm(0)))
                                        break Fail337;
                                    if(t_12.value == null)
                                      t_12.value = term.getSubterm(1);
                                    else
                                      if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                        break Fail337;
                                    term = t_14;
                                    { 
                                      IStrategoTerm y_18 = null;
                                      IStrategoTerm z_18 = null;
                                      IStrategoTerm b_19 = null;
                                      if(g_12.value == null)
                                        break Fail314;
                                      term = get_$L$H$S_type_0_3.instance.invoke(context, g_12.value, u_11.value, o_11.value, p_11.value);
                                      if(term == null)
                                        break Fail314;
                                      z_18 = term;
                                      if(t_12.value == null)
                                        break Fail314;
                                      b_19 = t_12.value;
                                      term = arik_0_9.instance.invokeDynamic(context, b_19, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constDouble0, v_11.value, w_11.value});
                                      if(term == null)
                                        break Fail314;
                                      y_18 = term;
                                      term = z_18;
                                      if(g_12.value == null)
                                        break Fail314;
                                      term = termFactory.makeAppl(transform._consAssignPlus_2, new IStrategoTerm[]{g_12.value, y_18});
                                      if(true)
                                        break Success203;
                                    }
                                  }
                                  term = term53;
                                  IStrategoTerm term54 = term;
                                  Success204:
                                  { 
                                    Fail338:
                                    { 
                                      IStrategoTerm u_14 = null;
                                      u_14 = term;
                                      if(v_12.value == null)
                                        break Fail338;
                                      term = v_12.value;
                                      if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignMinus_2 != ((IStrategoAppl)term).getConstructor())
                                        break Fail338;
                                      if(g_12.value == null)
                                        g_12.value = term.getSubterm(0);
                                      else
                                        if(g_12.value != term.getSubterm(0) && !g_12.value.match(term.getSubterm(0)))
                                          break Fail338;
                                      if(t_12.value == null)
                                        t_12.value = term.getSubterm(1);
                                      else
                                        if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                          break Fail338;
                                      term = u_14;
                                      { 
                                        IStrategoTerm d_19 = null;
                                        IStrategoTerm e_19 = null;
                                        IStrategoTerm g_19 = null;
                                        if(g_12.value == null)
                                          break Fail314;
                                        term = get_$L$H$S_type_0_3.instance.invoke(context, g_12.value, u_11.value, o_11.value, p_11.value);
                                        if(term == null)
                                          break Fail314;
                                        e_19 = term;
                                        if(t_12.value == null)
                                          break Fail314;
                                        g_19 = t_12.value;
                                        term = arik_0_9.instance.invokeDynamic(context, g_19, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constDouble0, v_11.value, w_11.value});
                                        if(term == null)
                                          break Fail314;
                                        d_19 = term;
                                        term = e_19;
                                        if(g_12.value == null)
                                          break Fail314;
                                        term = termFactory.makeAppl(transform._consAssignMinus_2, new IStrategoTerm[]{g_12.value, d_19});
                                        if(true)
                                          break Success204;
                                      }
                                    }
                                    term = term54;
                                    IStrategoTerm term55 = term;
                                    Success205:
                                    { 
                                      Fail339:
                                      { 
                                        IStrategoTerm v_14 = null;
                                        v_14 = term;
                                        if(v_12.value == null)
                                          break Fail339;
                                        term = v_12.value;
                                        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignLeftShift_2 != ((IStrategoAppl)term).getConstructor())
                                          break Fail339;
                                        if(g_12.value == null)
                                          g_12.value = term.getSubterm(0);
                                        else
                                          if(g_12.value != term.getSubterm(0) && !g_12.value.match(term.getSubterm(0)))
                                            break Fail339;
                                        if(t_12.value == null)
                                          t_12.value = term.getSubterm(1);
                                        else
                                          if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                            break Fail339;
                                        term = v_14;
                                        { 
                                          IStrategoTerm h_19 = null;
                                          IStrategoTerm k_19 = null;
                                          IStrategoTerm m_19 = null;
                                          if(g_12.value == null)
                                            break Fail314;
                                          term = get_$L$H$S_type_0_3.instance.invoke(context, g_12.value, u_11.value, o_11.value, p_11.value);
                                          if(term == null)
                                            break Fail314;
                                          k_19 = term;
                                          if(t_12.value == null)
                                            break Fail314;
                                          m_19 = t_12.value;
                                          term = arik_0_9.instance.invokeDynamic(context, m_19, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constLong0, v_11.value, w_11.value});
                                          if(term == null)
                                            break Fail314;
                                          h_19 = term;
                                          term = k_19;
                                          if(g_12.value == null)
                                            break Fail314;
                                          term = termFactory.makeAppl(transform._consAssignLeftShift_2, new IStrategoTerm[]{g_12.value, h_19});
                                          if(true)
                                            break Success205;
                                        }
                                      }
                                      term = term55;
                                      IStrategoTerm term56 = term;
                                      Success206:
                                      { 
                                        Fail340:
                                        { 
                                          IStrategoTerm w_14 = null;
                                          w_14 = term;
                                          if(v_12.value == null)
                                            break Fail340;
                                          term = v_12.value;
                                          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignRightShift_2 != ((IStrategoAppl)term).getConstructor())
                                            break Fail340;
                                          if(g_12.value == null)
                                            g_12.value = term.getSubterm(0);
                                          else
                                            if(g_12.value != term.getSubterm(0) && !g_12.value.match(term.getSubterm(0)))
                                              break Fail340;
                                          if(t_12.value == null)
                                            t_12.value = term.getSubterm(1);
                                          else
                                            if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                              break Fail340;
                                          term = w_14;
                                          { 
                                            IStrategoTerm n_19 = null;
                                            IStrategoTerm o_19 = null;
                                            IStrategoTerm q_19 = null;
                                            if(g_12.value == null)
                                              break Fail314;
                                            term = get_$L$H$S_type_0_3.instance.invoke(context, g_12.value, u_11.value, o_11.value, p_11.value);
                                            if(term == null)
                                              break Fail314;
                                            o_19 = term;
                                            if(t_12.value == null)
                                              break Fail314;
                                            q_19 = t_12.value;
                                            term = arik_0_9.instance.invokeDynamic(context, q_19, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constLong0, v_11.value, w_11.value});
                                            if(term == null)
                                              break Fail314;
                                            n_19 = term;
                                            term = o_19;
                                            if(g_12.value == null)
                                              break Fail314;
                                            term = termFactory.makeAppl(transform._consAssignRightShift_2, new IStrategoTerm[]{g_12.value, n_19});
                                            if(true)
                                              break Success206;
                                          }
                                        }
                                        term = term56;
                                        IStrategoTerm term57 = term;
                                        Success207:
                                        { 
                                          Fail341:
                                          { 
                                            IStrategoTerm x_14 = null;
                                            x_14 = term;
                                            if(v_12.value == null)
                                              break Fail341;
                                            term = v_12.value;
                                            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignURightShift_2 != ((IStrategoAppl)term).getConstructor())
                                              break Fail341;
                                            if(g_12.value == null)
                                              g_12.value = term.getSubterm(0);
                                            else
                                              if(g_12.value != term.getSubterm(0) && !g_12.value.match(term.getSubterm(0)))
                                                break Fail341;
                                            if(t_12.value == null)
                                              t_12.value = term.getSubterm(1);
                                            else
                                              if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                                break Fail341;
                                            term = x_14;
                                            { 
                                              IStrategoTerm r_19 = null;
                                              IStrategoTerm s_19 = null;
                                              IStrategoTerm u_19 = null;
                                              if(g_12.value == null)
                                                break Fail314;
                                              term = get_$L$H$S_type_0_3.instance.invoke(context, g_12.value, u_11.value, o_11.value, p_11.value);
                                              if(term == null)
                                                break Fail314;
                                              s_19 = term;
                                              if(t_12.value == null)
                                                break Fail314;
                                              u_19 = t_12.value;
                                              term = arik_0_9.instance.invokeDynamic(context, u_19, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constLong0, v_11.value, w_11.value});
                                              if(term == null)
                                                break Fail314;
                                              r_19 = term;
                                              term = s_19;
                                              if(g_12.value == null)
                                                break Fail314;
                                              term = termFactory.makeAppl(transform._consAssignURightShift_2, new IStrategoTerm[]{g_12.value, r_19});
                                              if(true)
                                                break Success207;
                                            }
                                          }
                                          term = term57;
                                          arik_0_9_fragment_0 arik_0_9_fragment_00 = new arik_0_9_fragment_0();
                                          arik_0_9_fragment_00.h_12 = h_12;
                                          arik_0_9_fragment_00.g_12 = g_12;
                                          arik_0_9_fragment_00.i_12 = i_12;
                                          arik_0_9_fragment_00.j_12 = j_12;
                                          arik_0_9_fragment_00.k_12 = k_12;
                                          arik_0_9_fragment_00.l_12 = l_12;
                                          arik_0_9_fragment_00.m_12 = m_12;
                                          arik_0_9_fragment_00.n_12 = n_12;
                                          arik_0_9_fragment_00.o_12 = o_12;
                                          arik_0_9_fragment_00.p_12 = p_12;
                                          arik_0_9_fragment_00.q_12 = q_12;
                                          arik_0_9_fragment_00.r_12 = r_12;
                                          arik_0_9_fragment_00.v_12 = v_12;
                                          arik_0_9_fragment_00.t_12 = t_12;
                                          arik_0_9_fragment_00.s_12 = s_12;
                                          arik_0_9_fragment_00.o_11 = o_11;
                                          arik_0_9_fragment_00.p_11 = p_11;
                                          arik_0_9_fragment_00.q_11 = q_11;
                                          arik_0_9_fragment_00.r_11 = r_11;
                                          arik_0_9_fragment_00.s_11 = s_11;
                                          arik_0_9_fragment_00.t_11 = t_11;
                                          arik_0_9_fragment_00.u_11 = u_11;
                                          arik_0_9_fragment_00.v_11 = v_11;
                                          arik_0_9_fragment_00.w_11 = w_11;
                                          arik_0_9_fragment_00.u_12 = u_12;
                                          term = arik_0_9_fragment_00.invoke(context, term);
                                          if(term == null)
                                            break Fail314;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class arik_0_9_fragment_0 extends Strategy 
  { 
    TermReference h_12;

    TermReference g_12;

    TermReference i_12;

    TermReference j_12;

    TermReference k_12;

    TermReference l_12;

    TermReference m_12;

    TermReference n_12;

    TermReference o_12;

    TermReference p_12;

    TermReference q_12;

    TermReference r_12;

    TermReference v_12;

    TermReference t_12;

    TermReference s_12;

    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference u_11;

    TermReference v_11;

    TermReference w_11;

    TermReference u_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail342:
      { 
        IStrategoTerm term58 = term;
        Success208:
        { 
          Fail343:
          { 
            IStrategoTerm y_14 = null;
            y_14 = term;
            if(v_12.value == null)
              break Fail343;
            term = v_12.value;
            if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignAnd_2 != ((IStrategoAppl)term).getConstructor())
              break Fail343;
            if(g_12.value == null)
              g_12.value = term.getSubterm(0);
            else
              if(g_12.value != term.getSubterm(0) && !g_12.value.match(term.getSubterm(0)))
                break Fail343;
            if(t_12.value == null)
              t_12.value = term.getSubterm(1);
            else
              if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                break Fail343;
            term = y_14;
            { 
              IStrategoTerm w_19 = null;
              IStrategoTerm x_19 = null;
              IStrategoTerm z_19 = null;
              if(g_12.value == null)
                break Fail342;
              term = get_$L$H$S_type_0_3.instance.invoke(context, g_12.value, u_11.value, o_11.value, p_11.value);
              if(term == null)
                break Fail342;
              if(h_12.value == null)
                h_12.value = term;
              else
                if(h_12.value != term && !h_12.value.match(term))
                  break Fail342;
              x_19 = term;
              if(t_12.value == null)
                break Fail342;
              term = t_12.value;
              z_19 = t_12.value;
              if(h_12.value == null)
                break Fail342;
              term = cc_0_0.instance.invoke(context, h_12.value);
              if(term == null)
                break Fail342;
              term = arik_0_9.instance.invokeDynamic(context, z_19, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, term, v_11.value, w_11.value});
              if(term == null)
                break Fail342;
              w_19 = term;
              term = x_19;
              if(g_12.value == null)
                break Fail342;
              term = termFactory.makeAppl(transform._consAssignAnd_2, new IStrategoTerm[]{g_12.value, w_19});
              if(true)
                break Success208;
            }
          }
          term = term58;
          IStrategoTerm term59 = term;
          Success209:
          { 
            Fail344:
            { 
              IStrategoTerm z_14 = null;
              z_14 = term;
              if(v_12.value == null)
                break Fail344;
              term = v_12.value;
              if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignExcOr_2 != ((IStrategoAppl)term).getConstructor())
                break Fail344;
              if(g_12.value == null)
                g_12.value = term.getSubterm(0);
              else
                if(g_12.value != term.getSubterm(0) && !g_12.value.match(term.getSubterm(0)))
                  break Fail344;
              if(t_12.value == null)
                t_12.value = term.getSubterm(1);
              else
                if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                  break Fail344;
              term = z_14;
              { 
                IStrategoTerm a_20 = null;
                IStrategoTerm b_20 = null;
                IStrategoTerm d_20 = null;
                if(g_12.value == null)
                  break Fail342;
                term = get_$L$H$S_type_0_3.instance.invoke(context, g_12.value, u_11.value, o_11.value, p_11.value);
                if(term == null)
                  break Fail342;
                if(h_12.value == null)
                  h_12.value = term;
                else
                  if(h_12.value != term && !h_12.value.match(term))
                    break Fail342;
                b_20 = term;
                if(t_12.value == null)
                  break Fail342;
                term = t_12.value;
                d_20 = t_12.value;
                if(h_12.value == null)
                  break Fail342;
                term = cc_0_0.instance.invoke(context, h_12.value);
                if(term == null)
                  break Fail342;
                term = arik_0_9.instance.invokeDynamic(context, d_20, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, term, v_11.value, w_11.value});
                if(term == null)
                  break Fail342;
                a_20 = term;
                term = b_20;
                if(g_12.value == null)
                  break Fail342;
                term = termFactory.makeAppl(transform._consAssignExcOr_2, new IStrategoTerm[]{g_12.value, a_20});
                if(true)
                  break Success209;
              }
            }
            term = term59;
            IStrategoTerm term60 = term;
            Success210:
            { 
              Fail345:
              { 
                IStrategoTerm a_15 = null;
                a_15 = term;
                if(v_12.value == null)
                  break Fail345;
                term = v_12.value;
                if(term.getTermType() != IStrategoTerm.APPL || transform._consAssignOr_2 != ((IStrategoAppl)term).getConstructor())
                  break Fail345;
                if(g_12.value == null)
                  g_12.value = term.getSubterm(0);
                else
                  if(g_12.value != term.getSubterm(0) && !g_12.value.match(term.getSubterm(0)))
                    break Fail345;
                if(t_12.value == null)
                  t_12.value = term.getSubterm(1);
                else
                  if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                    break Fail345;
                term = a_15;
                { 
                  IStrategoTerm e_20 = null;
                  IStrategoTerm f_20 = null;
                  IStrategoTerm h_20 = null;
                  if(g_12.value == null)
                    break Fail342;
                  term = get_$L$H$S_type_0_3.instance.invoke(context, g_12.value, u_11.value, o_11.value, p_11.value);
                  if(term == null)
                    break Fail342;
                  if(h_12.value == null)
                    h_12.value = term;
                  else
                    if(h_12.value != term && !h_12.value.match(term))
                      break Fail342;
                  f_20 = term;
                  if(t_12.value == null)
                    break Fail342;
                  term = t_12.value;
                  h_20 = t_12.value;
                  if(h_12.value == null)
                    break Fail342;
                  term = cc_0_0.instance.invoke(context, h_12.value);
                  if(term == null)
                    break Fail342;
                  term = arik_0_9.instance.invokeDynamic(context, h_20, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, term, v_11.value, w_11.value});
                  if(term == null)
                    break Fail342;
                  e_20 = term;
                  term = f_20;
                  if(g_12.value == null)
                    break Fail342;
                  term = termFactory.makeAppl(transform._consAssignOr_2, new IStrategoTerm[]{g_12.value, e_20});
                  if(true)
                    break Success210;
                }
              }
              term = term60;
              IStrategoTerm term61 = term;
              Success211:
              { 
                Fail346:
                { 
                  IStrategoTerm b_15 = null;
                  b_15 = term;
                  if(v_12.value == null)
                    break Fail346;
                  term = or_2_0.instance.invoke(context, v_12.value, lifted46.instance, lifted47.instance);
                  if(term == null)
                    break Fail346;
                  term = b_15;
                  { 
                    if(u_12.value == null)
                      break Fail342;
                    term = u_12.value;
                    lifted48 lifted480 = new lifted48();
                    lifted480.o_11 = o_11;
                    lifted480.p_11 = p_11;
                    lifted480.q_11 = q_11;
                    lifted480.r_11 = r_11;
                    lifted480.s_11 = s_11;
                    lifted480.t_11 = t_11;
                    lifted480.v_11 = v_11;
                    lifted480.w_11 = w_11;
                    term = SRTS_all.instance.invoke(context, term, lifted480);
                    if(term == null)
                      break Fail342;
                    if(true)
                      break Success211;
                  }
                }
                term = term61;
                IStrategoTerm term62 = term;
                Success212:
                { 
                  Fail347:
                  { 
                    IStrategoTerm c_15 = null;
                    c_15 = term;
                    if(v_12.value == null)
                      break Fail347;
                    term = v_12.value;
                    if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_2 != ((IStrategoAppl)term).getConstructor())
                      break Fail347;
                    if(t_12.value == null)
                      t_12.value = term.getSubterm(0);
                    else
                      if(t_12.value != term.getSubterm(0) && !t_12.value.match(term.getSubterm(0)))
                        break Fail347;
                    if(i_12.value == null)
                      i_12.value = term.getSubterm(1);
                    else
                      if(i_12.value != term.getSubterm(1) && !i_12.value.match(term.getSubterm(1)))
                        break Fail347;
                    term = c_15;
                    { 
                      IStrategoTerm k_20 = null;
                      IStrategoTerm m_20 = null;
                      IStrategoTerm o_20 = null;
                      IStrategoTerm r_20 = null;
                      m_20 = term;
                      if(t_12.value == null)
                        break Fail342;
                      o_20 = t_12.value;
                      term = arik_0_9.instance.invokeDynamic(context, o_20, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constBoolean0, v_11.value, w_11.value});
                      if(term == null)
                        break Fail342;
                      k_20 = term;
                      term = m_20;
                      if(i_12.value == null)
                        break Fail342;
                      r_20 = i_12.value;
                      term = arik_0_9.instance.invokeDynamic(context, r_20, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                      if(term == null)
                        break Fail342;
                      term = termFactory.makeAppl(transform._consIf_2, new IStrategoTerm[]{k_20, term});
                      if(true)
                        break Success212;
                    }
                  }
                  term = term62;
                  IStrategoTerm term63 = term;
                  Success213:
                  { 
                    Fail348:
                    { 
                      IStrategoTerm d_15 = null;
                      d_15 = term;
                      if(v_12.value == null)
                        break Fail348;
                      term = v_12.value;
                      if(term.getTermType() != IStrategoTerm.APPL || transform._consIf_3 != ((IStrategoAppl)term).getConstructor())
                        break Fail348;
                      if(t_12.value == null)
                        t_12.value = term.getSubterm(0);
                      else
                        if(t_12.value != term.getSubterm(0) && !t_12.value.match(term.getSubterm(0)))
                          break Fail348;
                      if(i_12.value == null)
                        i_12.value = term.getSubterm(1);
                      else
                        if(i_12.value != term.getSubterm(1) && !i_12.value.match(term.getSubterm(1)))
                          break Fail348;
                      if(j_12.value == null)
                        j_12.value = term.getSubterm(2);
                      else
                        if(j_12.value != term.getSubterm(2) && !j_12.value.match(term.getSubterm(2)))
                          break Fail348;
                      term = d_15;
                      { 
                        IStrategoTerm s_20 = null;
                        IStrategoTerm v_20 = null;
                        IStrategoTerm x_20 = null;
                        IStrategoTerm t_20 = null;
                        IStrategoTerm y_20 = null;
                        IStrategoTerm a_21 = null;
                        IStrategoTerm d_21 = null;
                        v_20 = term;
                        if(t_12.value == null)
                          break Fail342;
                        x_20 = t_12.value;
                        term = arik_0_9.instance.invokeDynamic(context, x_20, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constBoolean0, v_11.value, w_11.value});
                        if(term == null)
                          break Fail342;
                        s_20 = term;
                        term = v_20;
                        y_20 = v_20;
                        if(i_12.value == null)
                          break Fail342;
                        a_21 = i_12.value;
                        term = arik_0_9.instance.invokeDynamic(context, a_21, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                        if(term == null)
                          break Fail342;
                        t_20 = term;
                        term = y_20;
                        if(j_12.value == null)
                          break Fail342;
                        d_21 = j_12.value;
                        term = arik_0_9.instance.invokeDynamic(context, d_21, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                        if(term == null)
                          break Fail342;
                        term = termFactory.makeAppl(transform._consIf_3, new IStrategoTerm[]{s_20, t_20, term});
                        if(true)
                          break Success213;
                      }
                    }
                    term = term63;
                    IStrategoTerm term64 = term;
                    Success214:
                    { 
                      Fail349:
                      { 
                        IStrategoTerm f_15 = null;
                        f_15 = term;
                        if(v_12.value == null)
                          break Fail349;
                        term = v_12.value;
                        if(term.getTermType() != IStrategoTerm.APPL || transform._consAssertStm_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail349;
                        if(t_12.value == null)
                          t_12.value = term.getSubterm(0);
                        else
                          if(t_12.value != term.getSubterm(0) && !t_12.value.match(term.getSubterm(0)))
                            break Fail349;
                        term = f_15;
                        { 
                          IStrategoTerm h_21 = null;
                          if(t_12.value == null)
                            break Fail342;
                          h_21 = t_12.value;
                          term = arik_0_9.instance.invokeDynamic(context, h_21, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constBoolean0, v_11.value, w_11.value});
                          if(term == null)
                            break Fail342;
                          term = termFactory.makeAppl(transform._consAssertStm_1, new IStrategoTerm[]{term});
                          if(true)
                            break Success214;
                        }
                      }
                      term = term64;
                      IStrategoTerm term65 = term;
                      Success215:
                      { 
                        Fail350:
                        { 
                          IStrategoTerm g_15 = null;
                          g_15 = term;
                          if(v_12.value == null)
                            break Fail350;
                          term = v_12.value;
                          if(term.getTermType() != IStrategoTerm.APPL || transform._consAssertStm_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail350;
                          if(k_12.value == null)
                            k_12.value = term.getSubterm(0);
                          else
                            if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
                              break Fail350;
                          if(l_12.value == null)
                            l_12.value = term.getSubterm(1);
                          else
                            if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
                              break Fail350;
                          term = g_15;
                          { 
                            IStrategoTerm i_21 = null;
                            IStrategoTerm k_21 = null;
                            IStrategoTerm m_21 = null;
                            IStrategoTerm p_21 = null;
                            k_21 = term;
                            if(k_12.value == null)
                              break Fail342;
                            m_21 = k_12.value;
                            term = arik_0_9.instance.invokeDynamic(context, m_21, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constBoolean0, v_11.value, w_11.value});
                            if(term == null)
                              break Fail342;
                            i_21 = term;
                            term = k_21;
                            if(l_12.value == null)
                              break Fail342;
                            p_21 = l_12.value;
                            term = arik_0_9.instance.invokeDynamic(context, p_21, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constBoolean0, v_11.value, w_11.value});
                            if(term == null)
                              break Fail342;
                            term = termFactory.makeAppl(transform._consAssertStm_2, new IStrategoTerm[]{i_21, term});
                            if(true)
                              break Success215;
                          }
                        }
                        term = term65;
                        IStrategoTerm term66 = term;
                        Success216:
                        { 
                          Fail351:
                          { 
                            IStrategoTerm h_15 = null;
                            h_15 = term;
                            if(v_12.value == null)
                              break Fail351;
                            term = v_12.value;
                            if(term.getTermType() != IStrategoTerm.APPL || transform._consWhile_2 != ((IStrategoAppl)term).getConstructor())
                              break Fail351;
                            if(t_12.value == null)
                              t_12.value = term.getSubterm(0);
                            else
                              if(t_12.value != term.getSubterm(0) && !t_12.value.match(term.getSubterm(0)))
                                break Fail351;
                            if(r_12.value == null)
                              r_12.value = term.getSubterm(1);
                            else
                              if(r_12.value != term.getSubterm(1) && !r_12.value.match(term.getSubterm(1)))
                                break Fail351;
                            term = h_15;
                            { 
                              IStrategoTerm q_21 = null;
                              IStrategoTerm s_21 = null;
                              IStrategoTerm u_21 = null;
                              IStrategoTerm x_21 = null;
                              s_21 = term;
                              if(t_12.value == null)
                                break Fail342;
                              u_21 = t_12.value;
                              term = arik_0_9.instance.invokeDynamic(context, u_21, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constBoolean0, v_11.value, w_11.value});
                              if(term == null)
                                break Fail342;
                              q_21 = term;
                              term = s_21;
                              if(r_12.value == null)
                                break Fail342;
                              x_21 = r_12.value;
                              term = arik_0_9.instance.invokeDynamic(context, x_21, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                              if(term == null)
                                break Fail342;
                              term = termFactory.makeAppl(transform._consWhile_2, new IStrategoTerm[]{q_21, term});
                              if(true)
                                break Success216;
                            }
                          }
                          term = term66;
                          IStrategoTerm term67 = term;
                          Success217:
                          { 
                            Fail352:
                            { 
                              IStrategoTerm i_15 = null;
                              i_15 = term;
                              if(v_12.value == null)
                                break Fail352;
                              term = v_12.value;
                              if(term.getTermType() != IStrategoTerm.APPL || transform._consDoWhile_2 != ((IStrategoAppl)term).getConstructor())
                                break Fail352;
                              if(r_12.value == null)
                                r_12.value = term.getSubterm(0);
                              else
                                if(r_12.value != term.getSubterm(0) && !r_12.value.match(term.getSubterm(0)))
                                  break Fail352;
                              if(t_12.value == null)
                                t_12.value = term.getSubterm(1);
                              else
                                if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                  break Fail352;
                              term = i_15;
                              { 
                                IStrategoTerm y_21 = null;
                                IStrategoTerm a_22 = null;
                                IStrategoTerm c_22 = null;
                                IStrategoTerm f_22 = null;
                                a_22 = term;
                                if(r_12.value == null)
                                  break Fail342;
                                c_22 = r_12.value;
                                term = arik_0_9.instance.invokeDynamic(context, c_22, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                                if(term == null)
                                  break Fail342;
                                y_21 = term;
                                term = a_22;
                                if(t_12.value == null)
                                  break Fail342;
                                f_22 = t_12.value;
                                term = arik_0_9.instance.invokeDynamic(context, f_22, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constBoolean0, v_11.value, w_11.value});
                                if(term == null)
                                  break Fail342;
                                term = termFactory.makeAppl(transform._consDoWhile_2, new IStrategoTerm[]{y_21, term});
                                if(true)
                                  break Success217;
                              }
                            }
                            term = term67;
                            IStrategoTerm term68 = term;
                            Success218:
                            { 
                              Fail353:
                              { 
                                IStrategoTerm o_15 = null;
                                o_15 = term;
                                if(v_12.value == null)
                                  break Fail353;
                                term = v_12.value;
                                if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                                  break Fail353;
                                if(m_12.value == null)
                                  m_12.value = term.getSubterm(0);
                                else
                                  if(m_12.value != term.getSubterm(0) && !m_12.value.match(term.getSubterm(0)))
                                    break Fail353;
                                if(t_12.value == null)
                                  t_12.value = term.getSubterm(1);
                                else
                                  if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                    break Fail353;
                                if(n_12.value == null)
                                  n_12.value = term.getSubterm(2);
                                else
                                  if(n_12.value != term.getSubterm(2) && !n_12.value.match(term.getSubterm(2)))
                                    break Fail353;
                                if(r_12.value == null)
                                  r_12.value = term.getSubterm(3);
                                else
                                  if(r_12.value != term.getSubterm(3) && !r_12.value.match(term.getSubterm(3)))
                                    break Fail353;
                                term = o_15;
                                { 
                                  IStrategoTerm g_22 = null;
                                  IStrategoTerm k_22 = null;
                                  IStrategoTerm m_22 = null;
                                  IStrategoTerm h_22 = null;
                                  IStrategoTerm n_22 = null;
                                  IStrategoTerm p_22 = null;
                                  IStrategoTerm i_22 = null;
                                  IStrategoTerm q_22 = null;
                                  IStrategoTerm s_22 = null;
                                  IStrategoTerm v_22 = null;
                                  k_22 = term;
                                  if(m_12.value == null)
                                    break Fail342;
                                  m_22 = m_12.value;
                                  term = arik_0_9.instance.invokeDynamic(context, m_22, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                                  if(term == null)
                                    break Fail342;
                                  g_22 = term;
                                  term = k_22;
                                  n_22 = k_22;
                                  if(t_12.value == null)
                                    break Fail342;
                                  p_22 = t_12.value;
                                  term = arik_0_9.instance.invokeDynamic(context, p_22, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constBoolean0, v_11.value, w_11.value});
                                  if(term == null)
                                    break Fail342;
                                  h_22 = term;
                                  term = n_22;
                                  q_22 = n_22;
                                  if(n_12.value == null)
                                    break Fail342;
                                  s_22 = n_12.value;
                                  term = arik_0_9.instance.invokeDynamic(context, s_22, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                                  if(term == null)
                                    break Fail342;
                                  i_22 = term;
                                  term = q_22;
                                  if(r_12.value == null)
                                    break Fail342;
                                  v_22 = r_12.value;
                                  term = arik_0_9.instance.invokeDynamic(context, v_22, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                                  if(term == null)
                                    break Fail342;
                                  term = termFactory.makeAppl(transform._consFor_4, new IStrategoTerm[]{g_22, h_22, i_22, term});
                                  if(true)
                                    break Success218;
                                }
                              }
                              term = term68;
                              IStrategoTerm term69 = term;
                              Success219:
                              { 
                                Fail354:
                                { 
                                  IStrategoTerm p_15 = null;
                                  p_15 = term;
                                  if(v_12.value == null)
                                    break Fail354;
                                  term = v_12.value;
                                  if(term.getTermType() != IStrategoTerm.APPL || transform._consFor_4 != ((IStrategoAppl)term).getConstructor())
                                    break Fail354;
                                  if(o_12.value == null)
                                    o_12.value = term.getSubterm(0);
                                  else
                                    if(o_12.value != term.getSubterm(0) && !o_12.value.match(term.getSubterm(0)))
                                      break Fail354;
                                  if(t_12.value == null)
                                    t_12.value = term.getSubterm(1);
                                  else
                                    if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                      break Fail354;
                                  if(p_12.value == null)
                                    p_12.value = term.getSubterm(2);
                                  else
                                    if(p_12.value != term.getSubterm(2) && !p_12.value.match(term.getSubterm(2)))
                                      break Fail354;
                                  if(r_12.value == null)
                                    r_12.value = term.getSubterm(3);
                                  else
                                    if(r_12.value != term.getSubterm(3) && !r_12.value.match(term.getSubterm(3)))
                                      break Fail354;
                                  term = p_15;
                                  { 
                                    IStrategoTerm w_22 = null;
                                    IStrategoTerm a_23 = null;
                                    IStrategoTerm c_23 = null;
                                    IStrategoTerm x_22 = null;
                                    IStrategoTerm d_23 = null;
                                    IStrategoTerm f_23 = null;
                                    IStrategoTerm y_22 = null;
                                    IStrategoTerm g_23 = null;
                                    IStrategoTerm i_23 = null;
                                    IStrategoTerm l_23 = null;
                                    a_23 = term;
                                    if(o_12.value == null)
                                      break Fail342;
                                    c_23 = o_12.value;
                                    term = arik_0_9.instance.invokeDynamic(context, c_23, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                                    if(term == null)
                                      break Fail342;
                                    w_22 = term;
                                    term = a_23;
                                    d_23 = a_23;
                                    if(t_12.value == null)
                                      break Fail342;
                                    f_23 = t_12.value;
                                    term = arik_0_9.instance.invokeDynamic(context, f_23, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constBoolean0, v_11.value, w_11.value});
                                    if(term == null)
                                      break Fail342;
                                    x_22 = term;
                                    term = d_23;
                                    g_23 = d_23;
                                    if(p_12.value == null)
                                      break Fail342;
                                    i_23 = p_12.value;
                                    term = arik_0_9.instance.invokeDynamic(context, i_23, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                                    if(term == null)
                                      break Fail342;
                                    y_22 = term;
                                    term = g_23;
                                    if(r_12.value == null)
                                      break Fail342;
                                    l_23 = r_12.value;
                                    term = arik_0_9.instance.invokeDynamic(context, l_23, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                                    if(term == null)
                                      break Fail342;
                                    term = termFactory.makeAppl(transform._consFor_4, new IStrategoTerm[]{w_22, x_22, y_22, term});
                                    if(true)
                                      break Success219;
                                  }
                                }
                                term = term69;
                                IStrategoTerm term70 = term;
                                Success220:
                                { 
                                  Fail355:
                                  { 
                                    IStrategoTerm q_15 = null;
                                    q_15 = term;
                                    if(v_12.value == null)
                                      break Fail355;
                                    term = v_12.value;
                                    if(term.getTermType() != IStrategoTerm.APPL || transform._consForEach_3 != ((IStrategoAppl)term).getConstructor())
                                      break Fail355;
                                    if(q_12.value == null)
                                      q_12.value = term.getSubterm(0);
                                    else
                                      if(q_12.value != term.getSubterm(0) && !q_12.value.match(term.getSubterm(0)))
                                        break Fail355;
                                    if(t_12.value == null)
                                      t_12.value = term.getSubterm(1);
                                    else
                                      if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                        break Fail355;
                                    if(r_12.value == null)
                                      r_12.value = term.getSubterm(2);
                                    else
                                      if(r_12.value != term.getSubterm(2) && !r_12.value.match(term.getSubterm(2)))
                                        break Fail355;
                                    term = q_15;
                                    { 
                                      IStrategoTerm m_23 = null;
                                      IStrategoTerm p_23 = null;
                                      IStrategoTerm r_23 = null;
                                      IStrategoTerm n_23 = null;
                                      IStrategoTerm s_23 = null;
                                      IStrategoTerm u_23 = null;
                                      IStrategoTerm x_23 = null;
                                      p_23 = term;
                                      if(q_12.value == null)
                                        break Fail342;
                                      r_23 = q_12.value;
                                      term = arik_0_9.instance.invokeDynamic(context, r_23, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                                      if(term == null)
                                        break Fail342;
                                      m_23 = term;
                                      term = p_23;
                                      s_23 = p_23;
                                      if(t_12.value == null)
                                        break Fail342;
                                      u_23 = t_12.value;
                                      term = arik_0_9.instance.invokeDynamic(context, u_23, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                                      if(term == null)
                                        break Fail342;
                                      n_23 = term;
                                      term = s_23;
                                      if(r_12.value == null)
                                        break Fail342;
                                      x_23 = r_12.value;
                                      term = arik_0_9.instance.invokeDynamic(context, x_23, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                                      if(term == null)
                                        break Fail342;
                                      term = termFactory.makeAppl(transform._consForEach_3, new IStrategoTerm[]{m_23, n_23, term});
                                      if(true)
                                        break Success220;
                                    }
                                  }
                                  term = term70;
                                  IStrategoTerm term71 = term;
                                  Success221:
                                  { 
                                    Fail356:
                                    { 
                                      IStrategoTerm r_15 = null;
                                      r_15 = term;
                                      if(v_12.value == null)
                                        break Fail356;
                                      term = v_12.value;
                                      if(term.getTermType() != IStrategoTerm.APPL || transform._consCastPrim_2 != ((IStrategoAppl)term).getConstructor())
                                        break Fail356;
                                      if(s_12.value == null)
                                        s_12.value = term.getSubterm(0);
                                      else
                                        if(s_12.value != term.getSubterm(0) && !s_12.value.match(term.getSubterm(0)))
                                          break Fail356;
                                      if(t_12.value == null)
                                        t_12.value = term.getSubterm(1);
                                      else
                                        if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                          break Fail356;
                                      term = r_15;
                                      { 
                                        IStrategoTerm y_23 = null;
                                        IStrategoTerm z_23 = null;
                                        IStrategoTerm b_24 = null;
                                        z_23 = term;
                                        if(t_12.value == null)
                                          break Fail342;
                                        b_24 = t_12.value;
                                        term = arik_0_9.instance.invokeDynamic(context, b_24, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                                        if(term == null)
                                          break Fail342;
                                        y_23 = term;
                                        term = z_23;
                                        if(s_12.value == null)
                                          break Fail342;
                                        term = termFactory.makeAppl(transform._consCastPrim_2, new IStrategoTerm[]{s_12.value, y_23});
                                        if(true)
                                          break Success221;
                                      }
                                    }
                                    term = term71;
                                    IStrategoTerm term72 = term;
                                    Success222:
                                    { 
                                      Fail357:
                                      { 
                                        IStrategoTerm s_15 = null;
                                        s_15 = term;
                                        if(v_12.value == null)
                                          break Fail357;
                                        term = v_12.value;
                                        if(term.getTermType() != IStrategoTerm.APPL || transform._consCastRef_2 != ((IStrategoAppl)term).getConstructor())
                                          break Fail357;
                                        if(s_12.value == null)
                                          s_12.value = term.getSubterm(0);
                                        else
                                          if(s_12.value != term.getSubterm(0) && !s_12.value.match(term.getSubterm(0)))
                                            break Fail357;
                                        if(t_12.value == null)
                                          t_12.value = term.getSubterm(1);
                                        else
                                          if(t_12.value != term.getSubterm(1) && !t_12.value.match(term.getSubterm(1)))
                                            break Fail357;
                                        term = s_15;
                                        { 
                                          IStrategoTerm c_24 = null;
                                          IStrategoTerm d_24 = null;
                                          IStrategoTerm f_24 = null;
                                          d_24 = term;
                                          if(t_12.value == null)
                                            break Fail342;
                                          f_24 = t_12.value;
                                          term = arik_0_9.instance.invokeDynamic(context, f_24, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constNone0, v_11.value, w_11.value});
                                          if(term == null)
                                            break Fail342;
                                          c_24 = term;
                                          term = d_24;
                                          if(s_12.value == null)
                                            break Fail342;
                                          term = termFactory.makeAppl(transform._consCastRef_2, new IStrategoTerm[]{s_12.value, c_24});
                                          if(true)
                                            break Success222;
                                        }
                                      }
                                      term = term72;
                                      if(u_12.value == null)
                                        break Fail342;
                                      term = u_12.value;
                                      lifted49 lifted490 = new lifted49();
                                      lifted490.o_11 = o_11;
                                      lifted490.p_11 = p_11;
                                      lifted490.q_11 = q_11;
                                      lifted490.r_11 = r_11;
                                      lifted490.s_11 = s_11;
                                      lifted490.t_11 = t_11;
                                      lifted490.u_11 = u_11;
                                      lifted490.v_11 = v_11;
                                      lifted490.w_11 = w_11;
                                      term = SRTS_all.instance.invoke(context, term, lifted490);
                                      if(term == null)
                                        break Fail342;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted49 extends Strategy 
  { 
    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference u_11;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail358:
      { 
        term = arik_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, u_11.value, v_11.value, w_11.value});
        if(term == null)
          break Fail358;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted48 extends Strategy 
  { 
    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail359:
      { 
        IStrategoTerm j_20 = null;
        j_20 = term;
        term = arik_0_9.instance.invokeDynamic(context, j_20, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constBoolean0, v_11.value, w_11.value});
        if(term == null)
          break Fail359;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted47 extends Strategy 
  { 
    public static final lifted47 instance = new lifted47();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail360:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLazyOr_2 != ((IStrategoAppl)term).getConstructor())
          break Fail360;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted46 extends Strategy 
  { 
    public static final lifted46 instance = new lifted46();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail361:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLazyAnd_2 != ((IStrategoAppl)term).getConstructor())
          break Fail361;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted45 extends Strategy 
  { 
    TermReference u_12;

    TermReference u_11;

    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail362:
      { 
        IStrategoTerm j_18 = null;
        j_18 = term;
        if(u_12.value == null)
          break Fail362;
        term = type_of_0_3.instance.invoke(context, u_12.value, u_11.value, o_11.value, p_11.value);
        if(term == null)
          break Fail362;
        term = arik_0_9.instance.invokeDynamic(context, j_18, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, term, v_11.value, w_11.value});
        if(term == null)
          break Fail362;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted44 extends Strategy 
  { 
    public static final lifted44 instance = new lifted44();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail363:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consComplement_1 != ((IStrategoAppl)term).getConstructor())
          break Fail363;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted41 extends Strategy 
  { 
    public static final lifted41 instance = new lifted41();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail364:
      { 
        term = or_2_0.instance.invoke(context, term, lifted42.instance, lifted43.instance);
        if(term == null)
          break Fail364;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted43 extends Strategy 
  { 
    public static final lifted43 instance = new lifted43();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail365:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail365;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted42 extends Strategy 
  { 
    public static final lifted42 instance = new lifted42();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail366:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_1 != ((IStrategoAppl)term).getConstructor())
          break Fail366;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted40 extends Strategy 
  { 
    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail367:
      { 
        IStrategoTerm f_18 = null;
        f_18 = term;
        term = arik_0_9.instance.invokeDynamic(context, f_18, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constBoolean0, v_11.value, w_11.value});
        if(term == null)
          break Fail367;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted39 extends Strategy 
  { 
    TermReference u_11;

    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail368:
      { 
        IStrategoTerm c_17 = null;
        c_17 = term;
        if(u_11.value == null)
          break Fail368;
        term = dd_0_0.instance.invoke(context, u_11.value);
        if(term == null)
          break Fail368;
        term = arik_0_9.instance.invokeDynamic(context, c_17, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, term, v_11.value, w_11.value});
        if(term == null)
          break Fail368;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted38 extends Strategy 
  { 
    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail369:
      { 
        IStrategoTerm a_17 = null;
        a_17 = term;
        term = arik_0_9.instance.invokeDynamic(context, a_17, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constDouble0, v_11.value, w_11.value});
        if(term == null)
          break Fail369;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted37 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail370:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consRemain_2 != ((IStrategoAppl)term).getConstructor())
          break Fail370;
        if(k_12.value == null)
          k_12.value = term.getSubterm(0);
        else
          if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
            break Fail370;
        if(l_12.value == null)
          l_12.value = term.getSubterm(1);
        else
          if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
            break Fail370;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted30 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail371:
      { 
        lifted34 lifted340 = new lifted34();
        lifted31 lifted311 = new lifted31();
        lifted340.k_12 = k_12;
        lifted340.l_12 = l_12;
        lifted311.k_12 = k_12;
        lifted311.l_12 = l_12;
        term = or_2_0.instance.invoke(context, term, lifted311, lifted340);
        if(term == null)
          break Fail371;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted34 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail372:
      { 
        lifted36 lifted360 = new lifted36();
        lifted35 lifted350 = new lifted35();
        lifted360.k_12 = k_12;
        lifted360.l_12 = l_12;
        lifted350.k_12 = k_12;
        lifted350.l_12 = l_12;
        term = or_2_0.instance.invoke(context, term, lifted350, lifted360);
        if(term == null)
          break Fail372;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted36 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail373:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consDiv_2 != ((IStrategoAppl)term).getConstructor())
          break Fail373;
        if(k_12.value == null)
          k_12.value = term.getSubterm(0);
        else
          if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
            break Fail373;
        if(l_12.value == null)
          l_12.value = term.getSubterm(1);
        else
          if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
            break Fail373;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted35 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail374:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMul_2 != ((IStrategoAppl)term).getConstructor())
          break Fail374;
        if(k_12.value == null)
          k_12.value = term.getSubterm(0);
        else
          if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
            break Fail374;
        if(l_12.value == null)
          l_12.value = term.getSubterm(1);
        else
          if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
            break Fail374;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted31 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail375:
      { 
        lifted33 lifted330 = new lifted33();
        lifted32 lifted320 = new lifted32();
        lifted330.k_12 = k_12;
        lifted330.l_12 = l_12;
        lifted320.k_12 = k_12;
        lifted320.l_12 = l_12;
        term = or_2_0.instance.invoke(context, term, lifted320, lifted330);
        if(term == null)
          break Fail375;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted33 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail376:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consMinus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail376;
        if(k_12.value == null)
          k_12.value = term.getSubterm(0);
        else
          if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
            break Fail376;
        if(l_12.value == null)
          l_12.value = term.getSubterm(1);
        else
          if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
            break Fail376;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted32 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail377:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consPlus_2 != ((IStrategoAppl)term).getConstructor())
          break Fail377;
        if(k_12.value == null)
          k_12.value = term.getSubterm(0);
        else
          if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
            break Fail377;
        if(l_12.value == null)
          l_12.value = term.getSubterm(1);
        else
          if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
            break Fail377;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted29 extends Strategy 
  { 
    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail378:
      { 
        IStrategoTerm w_16 = null;
        w_16 = term;
        term = arik_0_9.instance.invokeDynamic(context, w_16, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, transform.constDouble0, v_11.value, w_11.value});
        if(term == null)
          break Fail378;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted26 extends Strategy 
  { 
    public static final lifted26 instance = new lifted26();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail379:
      { 
        term = or_2_0.instance.invoke(context, term, lifted27.instance, lifted28.instance);
        if(term == null)
          break Fail379;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted28 extends Strategy 
  { 
    public static final lifted28 instance = new lifted28();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail380:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consGtEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail380;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted27 extends Strategy 
  { 
    public static final lifted27 instance = new lifted27();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail381:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consGt_2 != ((IStrategoAppl)term).getConstructor())
          break Fail381;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted23 extends Strategy 
  { 
    public static final lifted23 instance = new lifted23();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail382:
      { 
        term = or_2_0.instance.invoke(context, term, lifted24.instance, lifted25.instance);
        if(term == null)
          break Fail382;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted25 extends Strategy 
  { 
    public static final lifted25 instance = new lifted25();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail383:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLtEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail383;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted24 extends Strategy 
  { 
    public static final lifted24 instance = new lifted24();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail384:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLt_2 != ((IStrategoAppl)term).getConstructor())
          break Fail384;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted22 extends Strategy 
  { 
    TermReference u_11;

    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail385:
      { 
        IStrategoTerm u_16 = null;
        u_16 = term;
        if(u_11.value == null)
          break Fail385;
        term = cc_0_0.instance.invoke(context, u_11.value);
        if(term == null)
          break Fail385;
        term = arik_0_9.instance.invokeDynamic(context, u_16, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, term, v_11.value, w_11.value});
        if(term == null)
          break Fail385;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted21 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    TermReference u_11;

    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail386:
      { 
        IStrategoTerm r_16 = null;
        r_16 = term;
        if(k_12.value == null || l_12.value == null)
          break Fail386;
        term = termFactory.makeTuple(k_12.value, l_12.value);
        term = gogo_0_3.instance.invoke(context, term, u_11.value, o_11.value, p_11.value);
        if(term == null)
          break Fail386;
        term = gg_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail386;
        term = arik_0_9.instance.invokeDynamic(context, r_16, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, term, v_11.value, w_11.value});
        if(term == null)
          break Fail386;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted20 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail387:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consAnd_2 != ((IStrategoAppl)term).getConstructor())
          break Fail387;
        if(k_12.value == null)
          k_12.value = term.getSubterm(0);
        else
          if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
            break Fail387;
        if(l_12.value == null)
          l_12.value = term.getSubterm(1);
        else
          if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
            break Fail387;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted17 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail388:
      { 
        lifted19 lifted190 = new lifted19();
        lifted18 lifted180 = new lifted18();
        lifted190.k_12 = k_12;
        lifted190.l_12 = l_12;
        lifted180.k_12 = k_12;
        lifted180.l_12 = l_12;
        term = or_2_0.instance.invoke(context, term, lifted180, lifted190);
        if(term == null)
          break Fail388;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted19 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail389:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExcOr_2 != ((IStrategoAppl)term).getConstructor())
          break Fail389;
        if(k_12.value == null)
          k_12.value = term.getSubterm(0);
        else
          if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
            break Fail389;
        if(l_12.value == null)
          l_12.value = term.getSubterm(1);
        else
          if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
            break Fail389;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted18 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail390:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consOr_2 != ((IStrategoAppl)term).getConstructor())
          break Fail390;
        if(k_12.value == null)
          k_12.value = term.getSubterm(0);
        else
          if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
            break Fail390;
        if(l_12.value == null)
          l_12.value = term.getSubterm(1);
        else
          if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
            break Fail390;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted16 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail391:
      { 
        IStrategoTerm k_16 = null;
        IStrategoTerm p_16 = null;
        k_16 = term;
        if(k_12.value == null || l_12.value == null)
          break Fail391;
        term = termFactory.makeTuple(k_12.value, l_12.value);
        p_16 = term;
        term = gogo_0_3.instance.invoke(context, p_16, transform.constNone0, o_11.value, p_11.value);
        if(term == null)
          break Fail391;
        term = bb_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail391;
        term = arik_0_9.instance.invokeDynamic(context, k_16, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, term, v_11.value, w_11.value});
        if(term == null)
          break Fail391;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted15 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail392:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consNotEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail392;
        if(k_12.value == null)
          k_12.value = term.getSubterm(0);
        else
          if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
            break Fail392;
        if(l_12.value == null)
          l_12.value = term.getSubterm(1);
        else
          if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
            break Fail392;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted14 extends Strategy 
  { 
    TermReference k_12;

    TermReference l_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail393:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consEq_2 != ((IStrategoAppl)term).getConstructor())
          break Fail393;
        if(k_12.value == null)
          k_12.value = term.getSubterm(0);
        else
          if(k_12.value != term.getSubterm(0) && !k_12.value.match(term.getSubterm(0)))
            break Fail393;
        if(l_12.value == null)
          l_12.value = term.getSubterm(1);
        else
          if(l_12.value != term.getSubterm(1) && !l_12.value.match(term.getSubterm(1)))
            break Fail393;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted13 extends Strategy 
  { 
    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference s_12;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail394:
      { 
        term = arik_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, s_12.value, v_11.value, w_11.value});
        if(term == null)
          break Fail394;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted12 extends Strategy 
  { 
    TermReference s_12;

    TermReference d_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail395:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consLocalVarDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail395;
        if(s_12.value == null)
          s_12.value = term.getSubterm(1);
        else
          if(s_12.value != term.getSubterm(1) && !s_12.value.match(term.getSubterm(1)))
            break Fail395;
        if(d_12.value == null)
          d_12.value = term.getSubterm(2);
        else
          if(d_12.value != term.getSubterm(2) && !d_12.value.match(term.getSubterm(2)))
            break Fail395;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted11 extends Strategy 
  { 
    TermReference s_12;

    TermReference d_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail396:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consFieldDec_3 != ((IStrategoAppl)term).getConstructor())
          break Fail396;
        if(s_12.value == null)
          s_12.value = term.getSubterm(1);
        else
          if(s_12.value != term.getSubterm(1) && !s_12.value.match(term.getSubterm(1)))
            break Fail396;
        if(d_12.value == null)
          d_12.value = term.getSubterm(2);
        else
          if(d_12.value != term.getSubterm(2) && !d_12.value.match(term.getSubterm(2)))
            break Fail396;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted10 extends Strategy 
  { 
    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference r_11;

    TermReference s_11;

    TermReference t_11;

    TermReference u_11;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail397:
      { 
        term = arik_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, r_11.value, s_11.value, t_11.value, u_11.value, v_11.value, w_11.value});
        if(term == null)
          break Fail397;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted9 extends Strategy 
  { 
    public static final lifted9 instance = new lifted9();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail398:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprName_2 != ((IStrategoAppl)term).getConstructor())
          break Fail398;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted8 extends Strategy 
  { 
    public static final lifted8 instance = new lifted8();

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail399:
      { 
        if(term.getTermType() != IStrategoTerm.APPL || transform._consExprName_1 != ((IStrategoAppl)term).getConstructor())
          break Fail399;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted7 extends Strategy 
  { 
    TermReference o_11;

    TermReference a_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail400:
      { 
        term = decreament_0_2.instance.invoke(context, term, o_11.value, a_12.value);
        if(term == null)
          break Fail400;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted6 extends Strategy 
  { 
    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference a_12;

    TermReference s_11;

    TermReference t_11;

    TermReference u_11;

    TermReference y_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail401:
      { 
        term = arik_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, a_12.value, s_11.value, t_11.value, u_11.value, y_11.value, w_11.value});
        if(term == null)
          break Fail401;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted4 extends Strategy 
  { 
    TermReference o_11;

    TermReference a_12;

    TermReference p_11;

    TermReference u_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail402:
      { 
        lifted5 lifted510 = new lifted5();
        lifted510.o_11 = o_11;
        lifted510.a_12 = a_12;
        lifted510.p_11 = p_11;
        lifted510.u_11 = u_11;
        term = try_1_0.instance.invoke(context, term, lifted510);
        if(term == null)
          break Fail402;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted5 extends Strategy 
  { 
    TermReference o_11;

    TermReference a_12;

    TermReference p_11;

    TermReference u_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail403:
      { 
        term = add__params_0_4.instance.invoke(context, term, o_11.value, a_12.value, p_11.value, u_11.value);
        if(term == null)
          break Fail403;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted3 extends Strategy 
  { 
    TermReference o_11;

    TermReference a_12;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail404:
      { 
        term = decreament_0_2.instance.invoke(context, term, o_11.value, a_12.value);
        if(term == null)
          break Fail404;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted2 extends Strategy 
  { 
    TermReference o_11;

    TermReference p_11;

    TermReference q_11;

    TermReference a_12;

    TermReference s_11;

    TermReference t_11;

    TermReference u_11;

    TermReference v_11;

    TermReference w_11;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail405:
      { 
        term = arik_0_9.instance.invokeDynamic(context, term, NO_STRATEGIES, new IStrategoTerm[]{o_11.value, p_11.value, q_11.value, a_12.value, s_11.value, t_11.value, u_11.value, v_11.value, w_11.value});
        if(term == null)
          break Fail405;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted0 extends Strategy 
  { 
    TermReference y_9;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      Fail406:
      { 
        lifted1 lifted134 = new lifted1();
        lifted134.y_9 = y_9;
        term = try_1_0.instance.invoke(context, term, lifted134);
        if(term == null)
          break Fail406;
        if(true)
          return term;
      }
      return null;
    }
  }

  @SuppressWarnings("all") private static final class lifted1 extends Strategy 
  { 
    TermReference y_9;

    @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
    { 
      ITermFactory termFactory = context.getFactory();
      Fail407:
      { 
        IStrategoTerm z_9 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transform._consClassBody_1 != ((IStrategoAppl)term).getConstructor())
          break Fail407;
        z_9 = term.getSubterm(0);
        if(y_9.value == null)
          break Fail407;
        term = iset_elements_0_0.instance.invoke(context, y_9.value);
        if(term == null)
          break Fail407;
        term = termFactory.makeTuple(z_9, term);
        term = conc_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail407;
        term = termFactory.makeAppl(transform._consClassBody_1, new IStrategoTerm[]{term});
        if(true)
          return term;
      }
      return null;
    }
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }

  @SuppressWarnings("unused") public static class InteropRegisterer extends org.strategoxt.lang.InteropRegisterer 
  { 
    @Override public void register(org.spoofax.interpreter.core.IContext context, Context compiledContext)
    { 
      register(context, compiledContext, context.getVarScope());
    }

    @Override public void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader)
    { 
      registerLazy(context, compiledContext, classLoader, context.getVarScope());
    }

    private void register(org.spoofax.interpreter.core.IContext context, Context compiledContext, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("transform");
      transform.init(compiledContext);
      varScope.addSVar("fetch__full__class__name_0_0", new InteropSDefT(fetch__full__class__name_0_0.instance, context));
      varScope.addSVar("pp_type_0_0", new InteropSDefT(pp_type_0_0.instance, context));
      varScope.addSVar("add__externals_0_1", new InteropSDefT(add__externals_0_1.instance, context));
      varScope.addSVar("arik_0_2", new InteropSDefT(arik_0_2.instance, context));
      varScope.addSVar("arik_0_9", new InteropSDefT(arik_0_9.instance, context));
      varScope.addSVar("is__on__entry__or__on__exit__method_0_0", new InteropSDefT(is__on__entry__or__on__exit__method_0_0.instance, context));
      varScope.addSVar("add__params_0_4", new InteropSDefT(add__params_0_4.instance, context));
      varScope.addSVar("add__var_0_5", new InteropSDefT(add__var_0_5.instance, context));
      varScope.addSVar("gogo_0_3", new InteropSDefT(gogo_0_3.instance, context));
      varScope.addSVar("bb_0_0", new InteropSDefT(bb_0_0.instance, context));
      varScope.addSVar("dd_0_0", new InteropSDefT(dd_0_0.instance, context));
      varScope.addSVar("cc_0_0", new InteropSDefT(cc_0_0.instance, context));
      varScope.addSVar("ee_0_0", new InteropSDefT(ee_0_0.instance, context));
      varScope.addSVar("ff_0_0", new InteropSDefT(ff_0_0.instance, context));
      varScope.addSVar("gg_0_0", new InteropSDefT(gg_0_0.instance, context));
      varScope.addSVar("ensure__number_0_0", new InteropSDefT(ensure__number_0_0.instance, context));
      varScope.addSVar("get_LHS_type_0_3", new InteropSDefT(get_$L$H$S_type_0_3.instance, context));
      varScope.addSVar("get_type_of_0_3", new InteropSDefT(get_type_of_0_3.instance, context));
      varScope.addSVar("handle_expr_0_7", new InteropSDefT(handle_expr_0_7.instance, context));
      varScope.addSVar("generate_invoke_ref_0_1", new InteropSDefT(generate_invoke_ref_0_1.instance, context));
      varScope.addSVar("generate_ref_method__name_0_2", new InteropSDefT(generate_ref_method__name_0_2.instance, context));
      varScope.addSVar("increament_0_2", new InteropSDefT(increament_0_2.instance, context));
      varScope.addSVar("decreament_0_2", new InteropSDefT(decreament_0_2.instance, context));
      varScope.addSVar("ddd_0_4", new InteropSDefT(ddd_0_4.instance, context));
      varScope.addSVar("get_expr_type_0_3", new InteropSDefT(get_expr_type_0_3.instance, context));
      varScope.addSVar("type_of_0_3", new InteropSDefT(type_of_0_3.instance, context));
      varScope.addSVar("fetch_0_0", new InteropSDefT(fetch_0_0.instance, context));
      varScope.addSVar("main_0_0", new InteropSDefT(main_0_0.instance, context));
      varScope.addSVar("handle_io_0_0", new InteropSDefT(handle_io_0_0.instance, context));
      varScope.addSVar("transform_0_0", new InteropSDefT(transform_0_0.instance, context));
      varScope.addSVar("gen_isRunByOthers_method_0_0", new InteropSDefT(gen_is$Run$By$Others_method_0_0.instance, context));
      varScope.addSVar("gen_method_state_0_1", new InteropSDefT(gen_method_state_0_1.instance, context));
      varScope.addSVar("gen_method_state_name_0_1", new InteropSDefT(gen_method_state_name_0_1.instance, context));
      varScope.addSVar("gen_requires_method_name_0_1", new InteropSDefT(gen_requires_method_name_0_1.instance, context));
      varScope.addSVar("gen_on_entry_method_name_0_1", new InteropSDefT(gen_on_entry_method_name_0_1.instance, context));
      varScope.addSVar("gen_on_exit_method_name_0_1", new InteropSDefT(gen_on_exit_method_name_0_1.instance, context));
      varScope.addSVar("make_while_condition_0_1", new InteropSDefT(make_while_condition_0_1.instance, context));
      varScope.addSVar("gen_class_head_0_1", new InteropSDefT(gen_class_head_0_1.instance, context));
      varScope.addSVar("make_requires_method_0_3", new InteropSDefT(make_requires_method_0_3.instance, context));
      varScope.addSVar("make_on_entry_method_0_4", new InteropSDefT(make_on_entry_method_0_4.instance, context));
      varScope.addSVar("make_on_exit_method_0_4", new InteropSDefT(make_on_exit_method_0_4.instance, context));
      varScope.addSVar("convert_0_0", new InteropSDefT(convert_0_0.instance, context));
      varScope.addSVar("generate_imports_0_2", new InteropSDefT(generate_imports_0_2.instance, context));
      varScope.addSVar("get_coordinator_0_1", new InteropSDefT(get_coordinator_0_1.instance, context));
      varScope.addSVar("fetch_coordinator_type_0_0", new InteropSDefT(fetch_coordinator_type_0_0.instance, context));
      varScope.addSVar("convert_coordinator_declaration_0_1", new InteropSDefT(convert_coordinator_declaration_0_1.instance, context));
      varScope.addSVar("gen_coordinator_body_0_1", new InteropSDefT(gen_coordinator_body_0_1.instance, context));
      varScope.addSVar("make_lock_and_unlock_methods_0_7", new InteropSDefT(make_lock_and_unlock_methods_0_7.instance, context));
      varScope.addSVar("make_unlock_method_0_3", new InteropSDefT(make_unlock_method_0_3.instance, context));
      varScope.addSVar("make_lock_method_0_6", new InteropSDefT(make_lock_method_0_6.instance, context));
      varScope.addSVar("fillMethodMaps_0_4", new InteropSDefT(fill$Method$Maps_0_4.instance, context));
      varScope.addSVar("add_condition_fields_0_0", new InteropSDefT(add_condition_fields_0_0.instance, context));
      varScope.addSVar("add_coordinator_fields_0_0", new InteropSDefT(add_coordinator_fields_0_0.instance, context));
      varScope.addSVar("get_methods_list_0_0", new InteropSDefT(get_methods_list_0_0.instance, context));
    }

    private void registerLazy(org.spoofax.interpreter.core.IContext context, Context compiledContext, ClassLoader classLoader, org.spoofax.interpreter.core.VarScope varScope)
    { 
      compiledContext.registerComponent("transform");
      transform.init(compiledContext);
      varScope.addSVar("fetch__full__class__name_0_0", new InteropSDefT(classLoader, "transform$fetch__full__class__name_0_0", context));
      varScope.addSVar("pp_type_0_0", new InteropSDefT(classLoader, "transform$pp_type_0_0", context));
      varScope.addSVar("add__externals_0_1", new InteropSDefT(classLoader, "transform$add__externals_0_1", context));
      varScope.addSVar("arik_0_2", new InteropSDefT(classLoader, "transform$arik_0_2", context));
      varScope.addSVar("arik_0_9", new InteropSDefT(classLoader, "transform$arik_0_9", context));
      varScope.addSVar("is__on__entry__or__on__exit__method_0_0", new InteropSDefT(classLoader, "transform$is__on__entry__or__on__exit__method_0_0", context));
      varScope.addSVar("add__params_0_4", new InteropSDefT(classLoader, "transform$add__params_0_4", context));
      varScope.addSVar("add__var_0_5", new InteropSDefT(classLoader, "transform$add__var_0_5", context));
      varScope.addSVar("gogo_0_3", new InteropSDefT(classLoader, "transform$gogo_0_3", context));
      varScope.addSVar("bb_0_0", new InteropSDefT(classLoader, "transform$bb_0_0", context));
      varScope.addSVar("dd_0_0", new InteropSDefT(classLoader, "transform$dd_0_0", context));
      varScope.addSVar("cc_0_0", new InteropSDefT(classLoader, "transform$cc_0_0", context));
      varScope.addSVar("ee_0_0", new InteropSDefT(classLoader, "transform$ee_0_0", context));
      varScope.addSVar("ff_0_0", new InteropSDefT(classLoader, "transform$ff_0_0", context));
      varScope.addSVar("gg_0_0", new InteropSDefT(classLoader, "transform$gg_0_0", context));
      varScope.addSVar("ensure__number_0_0", new InteropSDefT(classLoader, "transform$ensure__number_0_0", context));
      varScope.addSVar("get_LHS_type_0_3", new InteropSDefT(classLoader, "transform$get_$L$H$S_type_0_3", context));
      varScope.addSVar("get_type_of_0_3", new InteropSDefT(classLoader, "transform$get_type_of_0_3", context));
      varScope.addSVar("handle_expr_0_7", new InteropSDefT(classLoader, "transform$handle_expr_0_7", context));
      varScope.addSVar("generate_invoke_ref_0_1", new InteropSDefT(classLoader, "transform$generate_invoke_ref_0_1", context));
      varScope.addSVar("generate_ref_method__name_0_2", new InteropSDefT(classLoader, "transform$generate_ref_method__name_0_2", context));
      varScope.addSVar("increament_0_2", new InteropSDefT(classLoader, "transform$increament_0_2", context));
      varScope.addSVar("decreament_0_2", new InteropSDefT(classLoader, "transform$decreament_0_2", context));
      varScope.addSVar("ddd_0_4", new InteropSDefT(classLoader, "transform$ddd_0_4", context));
      varScope.addSVar("get_expr_type_0_3", new InteropSDefT(classLoader, "transform$get_expr_type_0_3", context));
      varScope.addSVar("type_of_0_3", new InteropSDefT(classLoader, "transform$type_of_0_3", context));
      varScope.addSVar("fetch_0_0", new InteropSDefT(classLoader, "transform$fetch_0_0", context));
      varScope.addSVar("main_0_0", new InteropSDefT(classLoader, "transform$main_0_0", context));
      varScope.addSVar("handle_io_0_0", new InteropSDefT(classLoader, "transform$handle_io_0_0", context));
      varScope.addSVar("transform_0_0", new InteropSDefT(classLoader, "transform$transform_0_0", context));
      varScope.addSVar("gen_isRunByOthers_method_0_0", new InteropSDefT(classLoader, "transform$gen_is$Run$By$Others_method_0_0", context));
      varScope.addSVar("gen_method_state_0_1", new InteropSDefT(classLoader, "transform$gen_method_state_0_1", context));
      varScope.addSVar("gen_method_state_name_0_1", new InteropSDefT(classLoader, "transform$gen_method_state_name_0_1", context));
      varScope.addSVar("gen_requires_method_name_0_1", new InteropSDefT(classLoader, "transform$gen_requires_method_name_0_1", context));
      varScope.addSVar("gen_on_entry_method_name_0_1", new InteropSDefT(classLoader, "transform$gen_on_entry_method_name_0_1", context));
      varScope.addSVar("gen_on_exit_method_name_0_1", new InteropSDefT(classLoader, "transform$gen_on_exit_method_name_0_1", context));
      varScope.addSVar("make_while_condition_0_1", new InteropSDefT(classLoader, "transform$make_while_condition_0_1", context));
      varScope.addSVar("gen_class_head_0_1", new InteropSDefT(classLoader, "transform$gen_class_head_0_1", context));
      varScope.addSVar("make_requires_method_0_3", new InteropSDefT(classLoader, "transform$make_requires_method_0_3", context));
      varScope.addSVar("make_on_entry_method_0_4", new InteropSDefT(classLoader, "transform$make_on_entry_method_0_4", context));
      varScope.addSVar("make_on_exit_method_0_4", new InteropSDefT(classLoader, "transform$make_on_exit_method_0_4", context));
      varScope.addSVar("convert_0_0", new InteropSDefT(classLoader, "transform$convert_0_0", context));
      varScope.addSVar("generate_imports_0_2", new InteropSDefT(classLoader, "transform$generate_imports_0_2", context));
      varScope.addSVar("get_coordinator_0_1", new InteropSDefT(classLoader, "transform$get_coordinator_0_1", context));
      varScope.addSVar("fetch_coordinator_type_0_0", new InteropSDefT(classLoader, "transform$fetch_coordinator_type_0_0", context));
      varScope.addSVar("convert_coordinator_declaration_0_1", new InteropSDefT(classLoader, "transform$convert_coordinator_declaration_0_1", context));
      varScope.addSVar("gen_coordinator_body_0_1", new InteropSDefT(classLoader, "transform$gen_coordinator_body_0_1", context));
      varScope.addSVar("make_lock_and_unlock_methods_0_7", new InteropSDefT(classLoader, "transform$make_lock_and_unlock_methods_0_7", context));
      varScope.addSVar("make_unlock_method_0_3", new InteropSDefT(classLoader, "transform$make_unlock_method_0_3", context));
      varScope.addSVar("make_lock_method_0_6", new InteropSDefT(classLoader, "transform$make_lock_method_0_6", context));
      varScope.addSVar("fillMethodMaps_0_4", new InteropSDefT(classLoader, "transform$fill$Method$Maps_0_4", context));
      varScope.addSVar("add_condition_fields_0_0", new InteropSDefT(classLoader, "transform$add_condition_fields_0_0", context));
      varScope.addSVar("add_coordinator_fields_0_0", new InteropSDefT(classLoader, "transform$add_coordinator_fields_0_0", context));
      varScope.addSVar("get_methods_list_0_0", new InteropSDefT(classLoader, "transform$get_methods_list_0_0", context));
    }
  }
}