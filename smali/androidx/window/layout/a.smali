.class public final Landroidx/window/layout/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Landroidx/window/layout/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/window/layout/a;

    invoke-direct {v0}, Landroidx/window/layout/a;-><init>()V

    sput-object v0, Landroidx/window/layout/a;->a:Landroidx/window/layout/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/app/Activity;)Z
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/app/Activity;->isInMultiWindowMode()Z

    move-result p1

    return p1
.end method
