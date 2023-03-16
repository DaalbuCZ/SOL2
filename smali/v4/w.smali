.class final Lv4/w;
.super Lv4/t;
.source ""


# instance fields
.field final synthetic o:Lv4/t;

.field final synthetic p:Lv4/d0;


# direct methods
.method constructor <init>(Lv4/d0;Lt4/j;Lv4/t;)V
    .locals 0

    iput-object p1, p0, Lv4/w;->p:Lv4/d0;

    iput-object p3, p0, Lv4/w;->o:Lv4/t;

    invoke-direct {p0, p2}, Lv4/t;-><init>(Lt4/j;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lv4/w;->p:Lv4/d0;

    iget-object v1, p0, Lv4/w;->o:Lv4/t;

    invoke-static {v0, v1}, Lv4/d0;->m(Lv4/d0;Lv4/t;)V

    return-void
.end method
