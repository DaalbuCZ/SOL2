.class public final synthetic Lv7/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv7/q;

.field public final synthetic o:Lv7/m;


# direct methods
.method public synthetic constructor <init>(Lv7/q;Lv7/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/p;->n:Lv7/q;

    iput-object p2, p0, Lv7/p;->o:Lv7/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lv7/p;->n:Lv7/q;

    iget-object v1, p0, Lv7/p;->o:Lv7/m;

    invoke-static {v0, v1}, Lv7/q;->d(Lv7/q;Lv7/m;)V

    return-void
.end method
