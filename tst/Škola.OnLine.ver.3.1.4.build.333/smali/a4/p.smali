.class public final synthetic La4/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:La4/r;

.field public final synthetic o:La4/u;


# direct methods
.method public synthetic constructor <init>(La4/r;La4/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La4/p;->n:La4/r;

    iput-object p2, p0, La4/p;->o:La4/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, La4/p;->n:La4/r;

    iget-object v1, p0, La4/p;->o:La4/u;

    iget v1, v1, La4/u;->a:I

    invoke-virtual {v0, v1}, La4/r;->e(I)V

    return-void
.end method
