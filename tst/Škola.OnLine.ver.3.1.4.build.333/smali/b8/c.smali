.class public final synthetic Lb8/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lb8/d;

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lb8/d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/c;->n:Lb8/d;

    iput-object p2, p0, Lb8/c;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb8/c;->n:Lb8/d;

    iget-object v1, p0, Lb8/c;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Lb8/d;->d(Lb8/d;Ljava/lang/String;)V

    return-void
.end method
