.class final Lk2/k$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk2/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:Lk2/o;

.field public final b:Lk2/r;

.field public final c:Lc2/e0;

.field public final d:Lc2/f0;

.field public e:I


# direct methods
.method public constructor <init>(Lk2/o;Lk2/r;Lc2/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk2/k$a;->a:Lk2/o;

    iput-object p2, p0, Lk2/k$a;->b:Lk2/r;

    iput-object p3, p0, Lk2/k$a;->c:Lc2/e0;

    iget-object p1, p1, Lk2/o;->f:Lx1/n1;

    iget-object p1, p1, Lx1/n1;->y:Ljava/lang/String;

    const-string p2, "audio/true-hd"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lc2/f0;

    invoke-direct {p1}, Lc2/f0;-><init>()V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lk2/k$a;->d:Lc2/f0;

    return-void
.end method
