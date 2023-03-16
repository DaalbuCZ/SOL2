.class final enum Lf7/u$b;
.super Lf7/u;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf7/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4010
    name = null
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lf7/u;-><init>(Ljava/lang/String;ILf7/u$a;)V

    return-void
.end method


# virtual methods
.method public e(Ln7/a;)Ljava/lang/Number;
    .locals 1

    new-instance v0, Lh7/g;

    invoke-virtual {p1}, Ln7/a;->X()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lh7/g;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
