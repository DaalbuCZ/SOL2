.class final Landroidx/window/layout/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/window/layout/r;


# static fields
.field public static final a:Landroidx/window/layout/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/window/layout/f;

    invoke-direct {v0}, Landroidx/window/layout/f;-><init>()V

    sput-object v0, Landroidx/window/layout/f;->a:Landroidx/window/layout/f;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/window/layout/q;)Landroidx/window/layout/q;
    .locals 1

    const-string v0, "tracker"

    invoke-static {p1, v0}, Ls9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
