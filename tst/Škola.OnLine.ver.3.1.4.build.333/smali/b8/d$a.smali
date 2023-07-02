.class Lb8/d$a;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lb8/d;->a(Ljava/lang/Object;Lt8/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb8/d;


# direct methods
.method constructor <init>(Lb8/d;)V
    .locals 0

    iput-object p1, p0, Lb8/d$a;->a:Lb8/d;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 0

    iget-object p1, p0, Lb8/d$a;->a:Lb8/d;

    invoke-static {p1}, Lb8/d;->e(Lb8/d;)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lb8/d$a;->a:Lb8/d;

    const-string v0, "none"

    invoke-static {p1, v0}, Lb8/d;->f(Lb8/d;Ljava/lang/String;)V

    return-void
.end method
