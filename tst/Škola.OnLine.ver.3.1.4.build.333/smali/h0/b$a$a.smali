.class Lh0/b$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/database/DatabaseErrorHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh0/b$a;-><init>(Landroid/content/Context;Ljava/lang/String;[Lh0/a;Lg0/c$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg0/c$a;

.field final synthetic b:[Lh0/a;


# direct methods
.method constructor <init>(Lg0/c$a;[Lh0/a;)V
    .locals 0

    iput-object p1, p0, Lh0/b$a$a;->a:Lg0/c$a;

    iput-object p2, p0, Lh0/b$a$a;->b:[Lh0/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCorruption(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 2

    iget-object v0, p0, Lh0/b$a$a;->a:Lg0/c$a;

    iget-object v1, p0, Lh0/b$a$a;->b:[Lh0/a;

    invoke-static {v1, p1}, Lh0/b$a;->b([Lh0/a;Landroid/database/sqlite/SQLiteDatabase;)Lh0/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg0/c$a;->c(Lg0/b;)V

    return-void
.end method
