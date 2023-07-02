.class final enum Lk7/u$b;
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
.method public e(Ls7/a;)Ljava/lang/Number;
    .locals 1

    new-instance v0, Lm7/g;

    invoke-virtual {p1}, Ls7/a;->X()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lm7/g;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
