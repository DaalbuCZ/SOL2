.class public final synthetic Lv3/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv3/r;


# direct methods
.method public synthetic constructor <init>(Lv3/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/n;->n:Lv3/r;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lv3/n;->n:Lv3/r;

    invoke-virtual {v0}, Lv3/r;->d()V

    return-void
.end method
