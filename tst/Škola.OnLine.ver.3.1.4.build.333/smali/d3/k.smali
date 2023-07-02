.class public abstract Ld3/k;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld3/k$d;,
        Ld3/k$c;,
        Ld3/k$b;,
        Ld3/k$a;,
        Ld3/k$e;
    }
.end annotation


# instance fields
.field final a:Ld3/i;

.field final b:J

.field final c:J


# direct methods
.method public constructor <init>(Ld3/i;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld3/k;->a:Ld3/i;

    iput-wide p2, p0, Ld3/k;->b:J

    iput-wide p4, p0, Ld3/k;->c:J

    return-void
.end method


# virtual methods
.method public a(Ld3/j;)Ld3/i;
    .locals 0

    iget-object p1, p0, Ld3/k;->a:Ld3/i;

    return-object p1
.end method

.method public b()J
    .locals 6

    iget-wide v0, p0, Ld3/k;->c:J

    iget-wide v4, p0, Ld3/k;->b:J

    const-wide/32 v2, 0xf4240

    invoke-static/range {v0 .. v5}, Lu3/n0;->N0(JJJ)J

    move-result-wide v0

    return-wide v0
.end method
