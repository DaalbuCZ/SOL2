.class public final synthetic Lo1/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo1/m0$b;


# static fields
.field public static final synthetic a:Lo1/b0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lo1/b0;

    invoke-direct {v0}, Lo1/b0;-><init>()V

    sput-object v0, Lo1/b0;->a:Lo1/b0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {p1}, Lo1/m0;->k(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
