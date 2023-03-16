.class Ls0/r$h;
.super Ly/d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls0/r;-><init>(Landroidx/room/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Ls0/r;


# direct methods
.method constructor <init>(Ls0/r;Landroidx/room/h;)V
    .locals 0

    iput-object p1, p0, Ls0/r$h;->d:Ls0/r;

    invoke-direct {p0, p2}, Ly/d;-><init>(Landroidx/room/h;)V

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    const-string v0, "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)"

    return-object v0
.end method
