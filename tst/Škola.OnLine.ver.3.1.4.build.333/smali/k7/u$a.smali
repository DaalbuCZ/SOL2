.class final enum Lk7/u$a;
.super Lk7/u;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk7/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lk7/u;-><init>(Ljava/lang/String;ILk7/u$a;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ls7/a;)Ljava/lang/Number;
    .locals 0

    invoke-virtual {p0, p1}, Lk7/u$a;->g(Ls7/a;)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method

.method public g(Ls7/a;)Ljava/lang/Double;
    .locals 2

    invoke-virtual {p1}, Ls7/a;->G()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1
.end method
