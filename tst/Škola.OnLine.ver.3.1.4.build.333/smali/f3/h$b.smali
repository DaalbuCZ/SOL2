.class public final Lf3/h$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Lx1/n1;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/net/Uri;Lx1/n1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/h$b;->a:Landroid/net/Uri;

    iput-object p2, p0, Lf3/h$b;->b:Lx1/n1;

    iput-object p3, p0, Lf3/h$b;->c:Ljava/lang/String;

    iput-object p4, p0, Lf3/h$b;->d:Ljava/lang/String;

    iput-object p5, p0, Lf3/h$b;->e:Ljava/lang/String;

    iput-object p6, p0, Lf3/h$b;->f:Ljava/lang/String;

    return-void
.end method

.method public static b(Landroid/net/Uri;)Lf3/h$b;
    .locals 8

    new-instance v0, Lx1/n1$b;

    invoke-direct {v0}, Lx1/n1$b;-><init>()V

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lx1/n1$b;->U(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v0

    const-string v1, "application/x-mpegURL"

    invoke-virtual {v0, v1}, Lx1/n1$b;->M(Ljava/lang/String;)Lx1/n1$b;

    move-result-object v0

    invoke-virtual {v0}, Lx1/n1$b;->G()Lx1/n1;

    move-result-object v3

    new-instance v0, Lf3/h$b;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lf3/h$b;-><init>(Landroid/net/Uri;Lx1/n1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public a(Lx1/n1;)Lf3/h$b;
    .locals 8

    new-instance v7, Lf3/h$b;

    iget-object v1, p0, Lf3/h$b;->a:Landroid/net/Uri;

    iget-object v3, p0, Lf3/h$b;->c:Ljava/lang/String;

    iget-object v4, p0, Lf3/h$b;->d:Ljava/lang/String;

    iget-object v5, p0, Lf3/h$b;->e:Ljava/lang/String;

    iget-object v6, p0, Lf3/h$b;->f:Ljava/lang/String;

    move-object v0, v7

    move-object v2, p1

    invoke-direct/range {v0 .. v6}, Lf3/h$b;-><init>(Landroid/net/Uri;Lx1/n1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v7
.end method
