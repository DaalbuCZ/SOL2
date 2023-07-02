.class Ly0/a$a;
.super Ly0/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly0/a;->b(Ljava/util/UUID;Lq0/i;)Ly0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:Lq0/i;

.field final synthetic p:Ljava/util/UUID;


# direct methods
.method constructor <init>(Lq0/i;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Ly0/a$a;->o:Lq0/i;

    iput-object p2, p0, Ly0/a$a;->p:Ljava/util/UUID;

    invoke-direct {p0}, Ly0/a;-><init>()V

    return-void
.end method


# virtual methods
.method h()V
    .locals 3

    iget-object v0, p0, Ly0/a$a;->o:Lq0/i;

    invoke-virtual {v0}, Lq0/i;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/room/h;->c()V

    :try_start_0
    iget-object v1, p0, Ly0/a$a;->o:Lq0/i;

    iget-object v2, p0, Ly0/a$a;->p:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Ly0/a;->a(Lq0/i;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/room/h;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Landroidx/room/h;->g()V

    iget-object v0, p0, Ly0/a$a;->o:Lq0/i;

    invoke-virtual {p0, v0}, Ly0/a;->g(Lq0/i;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Landroidx/room/h;->g()V

    throw v1
.end method
