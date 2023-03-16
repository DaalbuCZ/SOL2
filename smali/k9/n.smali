.class public abstract Lk9/n;
.super Lk9/p;
.source ""

# interfaces
.implements Lo9/e;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lk9/p;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected b()Lo9/a;
    .locals 1

    invoke-static {p0}, Lk9/s;->d(Lk9/n;)Lo9/e;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lo9/e;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
