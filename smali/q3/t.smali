.class public final synthetic Lq3/t;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lq3/x$a;

.field public final synthetic o:Lq3/z;


# direct methods
.method public synthetic constructor <init>(Lq3/x$a;Lq3/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/t;->n:Lq3/x$a;

    iput-object p2, p0, Lq3/t;->o:Lq3/z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lq3/t;->n:Lq3/x$a;

    iget-object v1, p0, Lq3/t;->o:Lq3/z;

    invoke-static {v0, v1}, Lq3/x$a;->h(Lq3/x$a;Lq3/z;)V

    return-void
.end method
