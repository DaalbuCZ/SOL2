.class public final synthetic Lv7/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lv7/i;


# direct methods
.method public synthetic constructor <init>(Lv7/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/c;->n:Lv7/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lv7/c;->n:Lv7/i;

    invoke-static {v0}, Lv7/i;->d(Lv7/i;)V

    return-void
.end method
