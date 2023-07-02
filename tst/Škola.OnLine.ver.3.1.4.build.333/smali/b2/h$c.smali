.class Lb2/h$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb2/g0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lb2/h;


# direct methods
.method private constructor <init>(Lb2/h;)V
    .locals 0

    iput-object p1, p0, Lb2/h$c;->a:Lb2/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lb2/h;Lb2/h$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lb2/h$c;-><init>(Lb2/h;)V

    return-void
.end method


# virtual methods
.method public a(Lb2/g0;[BII[B)V
    .locals 0

    iget-object p1, p0, Lb2/h$c;->a:Lb2/h;

    iget-object p1, p1, Lb2/h;->z:Lb2/h$d;

    invoke-static {p1}, Lu3/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb2/h$d;

    invoke-virtual {p1, p3, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object p1

    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    return-void
.end method
