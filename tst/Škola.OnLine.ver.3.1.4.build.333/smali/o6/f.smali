.class public final synthetic Lo6/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/h;


# static fields
.field public static final synthetic a:Lo6/f;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lo6/f;

    invoke-direct {v0}, Lo6/f;-><init>()V

    sput-object v0, Lo6/f;->a:Lo6/f;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lp5/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/installations/FirebaseInstallationsRegistrar;->a(Lp5/e;)Lo6/e;

    move-result-object p1

    return-object p1
.end method
