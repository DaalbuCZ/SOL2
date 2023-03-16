.class Lt7/d$a;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt7/d;->a(Ljava/lang/Object;Ll8/d$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lt7/d;


# direct methods
.method constructor <init>(Lt7/d;)V
    .locals 0

    iput-object p1, p0, Lt7/d$a;->a:Lt7/d;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 0

    iget-object p1, p0, Lt7/d$a;->a:Lt7/d;

    invoke-static {p1}, Lt7/d;->e(Lt7/d;)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lt7/d$a;->a:Lt7/d;

    const-string v0, "none"

    invoke-static {p1, v0}, Lt7/d;->f(Lt7/d;Ljava/lang/String;)V

    return-void
.end method
