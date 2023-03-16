.class public final synthetic Lv3/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv3/r;

.field public final synthetic o:Lv3/u;


# direct methods
.method public synthetic constructor <init>(Lv3/r;Lv3/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/p;->n:Lv3/r;

    iput-object p2, p0, Lv3/p;->o:Lv3/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv3/p;->n:Lv3/r;

    iget-object v1, p0, Lv3/p;->o:Lv3/u;

    iget v1, v1, Lv3/u;->a:I

    invoke-virtual {v0, v1}, Lv3/r;->e(I)V

    return-void
.end method
