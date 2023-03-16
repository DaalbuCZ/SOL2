.class Ly9/h$a;
.super Ly9/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ly9/h;->a(Ly9/d;JLaa/b;)Ly9/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:J

.field final synthetic o:Laa/b;


# direct methods
.method constructor <init>(Ly9/d;JLaa/b;)V
    .locals 0

    iput-wide p2, p0, Ly9/h$a;->n:J

    iput-object p4, p0, Ly9/h$a;->o:Laa/b;

    invoke-direct {p0}, Ly9/h;-><init>()V

    return-void
.end method


# virtual methods
.method public c()Laa/b;
    .locals 1

    iget-object v0, p0, Ly9/h$a;->o:Laa/b;

    return-object v0
.end method
