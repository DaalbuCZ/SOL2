.class final Li2/d$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field public final a:I

.field public final b:J


# direct methods
.method private constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Li2/d$a;->a:I

    iput-wide p2, p0, Li2/d$a;->b:J

    return-void
.end method

.method public static a(Lx1/m;Lp3/a0;)Li2/d$a;
    .locals 3

    invoke-virtual {p1}, Lp3/a0;->d()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x8

    invoke-interface {p0, v0, v1, v2}, Lx1/m;->o([BII)V

    invoke-virtual {p1, v1}, Lp3/a0;->O(I)V

    invoke-virtual {p1}, Lp3/a0;->m()I

    move-result p0

    invoke-virtual {p1}, Lp3/a0;->s()J

    move-result-wide v0

    new-instance p1, Li2/d$a;

    invoke-direct {p1, p0, v0, v1}, Li2/d$a;-><init>(IJ)V

    return-object p1
.end method
