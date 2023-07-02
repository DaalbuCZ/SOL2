.class public abstract Ls9/n;
.super Ls9/p;
.source ""

# interfaces
.implements Lw9/e;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Ls9/p;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method protected b()Lw9/a;
    .locals 1

    invoke-static {p0}, Ls9/s;->d(Ls9/n;)Lw9/e;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/Object;
    .locals 1

    invoke-interface {p0}, Lw9/e;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
