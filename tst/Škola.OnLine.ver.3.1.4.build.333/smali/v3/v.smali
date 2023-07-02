.class public final synthetic Lv3/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv3/x$a;

.field public final synthetic o:Lv3/z;


# direct methods
.method public synthetic constructor <init>(Lv3/x$a;Lv3/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/v;->n:Lv3/x$a;

    iput-object p2, p0, Lv3/v;->o:Lv3/z;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv3/v;->n:Lv3/x$a;

    iget-object v1, p0, Lv3/v;->o:Lv3/z;

    invoke-static {v0, v1}, Lv3/x$a;->h(Lv3/x$a;Lv3/z;)V

    return-void
.end method
